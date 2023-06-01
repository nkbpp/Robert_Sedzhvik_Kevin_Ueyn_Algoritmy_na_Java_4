package Chapter_1_3.Stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FixedCapaсityStackOfStringsTest {

    @Test
    public void test(){
        FixedCapaсityStackOfStrings fs = new FixedCapaсityStackOfStrings(100);

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

        List<String> l = new ArrayList<>();
        while(!fs.isEmpty()){
            l.add(fs.pop());
        }

        assertThat(fs.isEmpty()).isTrue();
        assertThat(l).hasSize(2).contains("is", "to");
    }

}