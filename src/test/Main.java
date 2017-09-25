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
package test;

import html5.br.com.everton.Body;
import html5.br.com.everton.Html;
import html5.br.com.everton.Br;
import html5.br.com.everton.Div;
import html5.br.com.everton.H1;
import html5.br.com.everton.Hr;
import html5.br.com.everton.Doc;
import html5.br.com.everton.Head;
import html5.br.com.everton.Section;

/**
 *
 * @author evertonramos
 */
public class Main {
    public static void main(String [] args) {
        Doc doc = new Doc();
        
        Html html = new Html();
        
        Head head = new Head();
        
        Body body = new Body();
        body.append(new H1("H1 title"));
        
        Section section = new Section();
        section.comment("teste do section");
        
        body.append(section);
        
        html.append(head);
        html.append(body);
        
        doc.setHtml(html);
        
        
        //doc.setBody(body);
        
        System.out.println(doc);
        
        
    }
}
