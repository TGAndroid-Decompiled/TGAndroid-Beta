package se;

import c5.x;
import java.util.regex.Pattern;
public final class g extends xe.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f48227b;
    public final ve.j f48226a = new df.c();
    public boolean f48228c = false;
    public x d = new x(17, (short) 0);

    public g(Pattern pattern) {
        this.f48227b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        x xVar = this.d;
        StringBuilder sb2 = (StringBuilder) xVar.f3828c;
        if (xVar.f3827b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        xVar.f3827b++;
        Pattern pattern = this.f48227b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f48228c = true;
        }
    }

    @Override
    public final void d() {
        this.f48226a.f50818g = ((StringBuilder) this.d.f3828c).toString();
        this.d = null;
    }

    @Override
    public final ve.a e() {
        return this.f48226a;
    }

    @Override
    public final q3.h h(d dVar) {
        if (!this.f48228c) {
            if (dVar.h && this.f48227b == null) {
                return null;
            }
            return q3.h.a(dVar.f48209b);
        }
        return null;
    }
}
