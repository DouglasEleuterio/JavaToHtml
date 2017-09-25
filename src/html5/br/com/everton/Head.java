/*
 * The MIT License
 *
 * Copyright 2017 evertonramos.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package html5.br.com.everton;

/**
 * The div tag defines a division or a section in an HTML document. The div tag
 * is used to group block-elements to format them with CSS.
 *
 * @author evertonramos
 */
public class Head extends Html5 {

    public Head() {
        super("head");
    }

    public Head(String content) {
        super("head", content);
    }
    
    public Head(Html5 html5) {
        super("head", html5);
    }
    
    public void setTitle(Title title) {
        append(title);
    }
    
    public void setTitle(String title) {
        append(new Title(title));
    }
}
