package ye;

import bf.p;
import c5.b0;
import java.util.regex.Pattern;
public final class g extends df.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f46761b;
    public final bf.j f46760a = new p();
    public boolean f46762c = false;
    public b0 d = new b0(12, (byte) 0);

    public g(Pattern pattern) {
        this.f46761b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        b0 b0Var = this.d;
        StringBuilder sb2 = (StringBuilder) b0Var.f3847c;
        if (b0Var.f3846b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        b0Var.f3846b++;
        Pattern pattern = this.f46761b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f46762c = true;
        }
    }

    @Override
    public final void d() {
        this.f46760a.f3545g = ((StringBuilder) this.d.f3847c).toString();
        this.d = null;
    }

    @Override
    public final bf.a e() {
        return this.f46760a;
    }

    @Override
    public final q3.h h(d dVar) {
        if (!this.f46762c) {
            if (dVar.h && this.f46761b == null) {
                return null;
            }
            return q3.h.a(dVar.f46743b);
        }
        return null;
    }
}
