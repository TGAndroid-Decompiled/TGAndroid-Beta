package ye;

import bf.p;
import c5.b0;
import java.util.regex.Pattern;
public final class g extends df.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f47006b;
    public final bf.j f47005a = new p();
    public boolean f47007c = false;
    public b0 d = new b0(12, (byte) 0);

    public g(Pattern pattern) {
        this.f47006b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        b0 b0Var = this.d;
        StringBuilder sb2 = (StringBuilder) b0Var.f3839c;
        if (b0Var.f3838b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        b0Var.f3838b++;
        Pattern pattern = this.f47006b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f47007c = true;
        }
    }

    @Override
    public final void d() {
        this.f47005a.f3537g = ((StringBuilder) this.d.f3839c).toString();
        this.d = null;
    }

    @Override
    public final bf.a e() {
        return this.f47005a;
    }

    @Override
    public final q3.h h(d dVar) {
        if (!this.f47007c) {
            if (dVar.h && this.f47006b == null) {
                return null;
            }
            return q3.h.a(dVar.f46988b);
        }
        return null;
    }
}
