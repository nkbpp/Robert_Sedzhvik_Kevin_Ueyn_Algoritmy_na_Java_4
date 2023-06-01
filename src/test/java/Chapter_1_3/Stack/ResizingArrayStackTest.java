package Chapter_1_3.Stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ResizingArrayStackTest {

    @Test
    public void test(){
        ResizingArrayStack<String> fs = new ResizingArrayStack<>();

        fs.push("to");
        fs.push("be");
        fs.push("or");
        fs.push("not");
        fs.push("to");
        fs.pop();
        fs.push("be");
        fs.pop();
        fs.pop();
        fs.push("that");
        fs.pop();
        fs.pop();
        fs.pop();
        fs.push("is");

        String s = "";
        for (var o:
                fs) {
            s+=o;
        }

        List<String> l = new ArrayList<>();
        while(!fs.isEmpty()){
            l.add(fs.pop());
        }

        assertThat(fs.isEmpty()).isTrue();
        assertThat(l).hasSize(2).contains("is", "to");
    }

}