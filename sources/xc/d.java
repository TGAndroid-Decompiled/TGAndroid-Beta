package xc;

import ad.j;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import v7.s;
import x7.z5;
public final class d extends z5 {
    public static final Set f58611g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set f58612i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final s f58613a;
    public final kb.a f58614b;
    public final ArrayList f58615c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean f58616e;
    public boolean f58617f;

    public d(s sVar, kb.a aVar) {
        this.f58613a = sVar;
        this.f58614b = aVar;
    }

    public static Map a(j jVar) {
        boolean z10;
        zc.b bVar = jVar.f363k;
        int i3 = bVar.f60377a;
        if (i3 > 0) {
            HashMap hashMap = new HashMap(i3);
            int i10 = 0;
            while (true) {
                if (i10 < bVar.f60377a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    String str = bVar.f60379c[i10];
                    String str2 = bVar.f60378b[i10];
                    if (str == null) {
                        str = "";
                    }
                    ?? obj = new Object();
                    if (str2 != null) {
                        obj.f60374a = str2.trim();
                        if (str2.length() != 0) {
                            obj.f60375b = str;
                            obj.f60376c = bVar;
                            i10++;
                            hashMap.put(obj.f60374a.toLowerCase(Locale.US), obj.f60375b);
                        } else {
                            throw new IllegalArgumentException("String must not be empty");
                        }
                    } else {
                        throw new IllegalArgumentException("Object must not be null");
                    }
                } else {
                    return DesugarCollections.unmodifiableMap(hashMap);
                }
            }
        } else {
            return Collections.EMPTY_MAP;
        }
    }

    public final void b(java.lang.Appendable r17, java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: xc.d.b(java.lang.Appendable, java.lang.String):void");
    }
}
