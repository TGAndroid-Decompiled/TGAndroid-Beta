package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import i7.x7;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.y5;
import org.telegram.ui.op0;
public final class t5 extends FrameLayout implements org.telegram.ui.ActionBar.x5, j9 {
    public static final int R = 0;
    public boolean A;
    public boolean B;
    public e2 C;
    public String D;
    public int E;
    public ql0 F;
    public Drawable G;
    public hi0 H;
    public final RectF I;
    public boolean J;
    public int K;
    public pa0 L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public final Paint Q;
    public final c6 f48776a;
    public final LinearLayout f48777b;
    public final View f48778c;
    public final cg.s0 d;
    public final op0 f48779e;
    public final d1 f48780f;
    public final d1 h;
    public boolean f48781n;
    public final ArrayList f48782r;
    public LinearLayout f48783s;
    public TextView v;
    public ImageView f48784w;
    public a f48785x;
    public q5 f48786y;

    public t5(Context context, c6 c6Var) {
        super(context);
        this.f48782r = new ArrayList();
        this.I = new RectF();
        this.M = -1;
        this.N = -1;
        this.Q = new Paint(1);
        this.f48776a = c6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48777b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f48778c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        cg.s0 s0Var = new cg.s0(this, context);
        this.d = s0Var;
        s0Var.setGravity(8388627);
        s0Var.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        s0Var.setSingleLine(true);
        s0Var.setIncludeFontPadding(false);
        s0Var.setTextSize(1, 16.0f);
        linearLayout.addView(s0Var, f6.n(18, -2));
        op0 op0Var = new op0(context, c6Var);
        this.f48779e = op0Var;
        op0Var.setVisibility(8);
        op0Var.setOnClickListener(new l5(this, 0));
        linearLayout.addView(op0Var, f6.n(18, -2));
        d1 d1Var = new d1(context, c6Var);
        this.f48780f = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        d1Var.setListener(new o5(this));
        d1Var.setDelegate(new qt(this) {
            public final t5 f48586b;

            {
                this.f48586b = this;
            }

            @Override
            public final void e1() {
                switch (r2) {
                    case 0:
                        t5 t5Var = this.f48586b;
                        if (!t5Var.O && t5Var.f48785x != null) {
                            t5Var.J();
                            t5.d(t5Var.f48785x.f48328b, t5Var.f48780f.getText());
                            q5 q5Var = t5Var.f48786y;
                            if (q5Var != null) {
                                p3.O1(((y2) q5Var).f48903a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        t5 t5Var2 = this.f48586b;
                        if (t5Var2.f48785x != null) {
                            t5Var2.w();
                            q5 q5Var2 = t5Var2.f48786y;
                            if (q5Var2 != null) {
                                p3.O1(((y2) q5Var2).f48903a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        d1Var.setOnFocusChangeListener(new ag.a0(this, 7));
        linearLayout.addView(d1Var, f6.l(1.0f, 0, -2));
        addView(linearLayout, f6.e(-1, -2, 51));
        d1 d1Var2 = new d1(context, c6Var);
        this.h = d1Var2;
        d1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var2.setAllowNewlines(false);
        d1Var2.setInputType(147457);
        d1Var2.setListener(new p5(this));
        d1Var2.setDelegate(new qt(this) {
            public final t5 f48586b;

            {
                this.f48586b = this;
            }

            @Override
            public final void e1() {
                switch (r2) {
                    case 0:
                        t5 t5Var = this.f48586b;
                        if (!t5Var.O && t5Var.f48785x != null) {
                            t5Var.J();
                            t5.d(t5Var.f48785x.f48328b, t5Var.f48780f.getText());
                            q5 q5Var = t5Var.f48786y;
                            if (q5Var != null) {
                                p3.O1(((y2) q5Var).f48903a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        t5 t5Var2 = this.f48586b;
                        if (t5Var2.f48785x != null) {
                            t5Var2.w();
                            q5 q5Var2 = t5Var2.f48786y;
                            if (q5Var2 != null) {
                                p3.O1(((y2) q5Var2).f48903a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        d1Var2.setVisibility(8);
        addView(d1Var2, f6.e(-1, -2, 51));
        e();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return v5.r(pageBlock.text, pageBlock, true);
    }

    public static void a(t5 t5Var, boolean z10) {
        q5 q5Var;
        t5Var.f48780f.setHint(t5Var.getHint());
        if (!z10 && (q5Var = t5Var.f48786y) != null) {
            ((y2) q5Var).f48903a.f48638d3.a1(t5Var, null);
        }
    }

    public static String b(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
            return null;
        }
        return null;
    }

    public static void d(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = v5.f(charSequence);
    }

    public static void f(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i10;
        a aVar = this.f48785x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f48328b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f48340p) {
                i10 = R.string.ArticleHintTitle;
            } else {
                i10 = R.string.ArticleHeading1;
            }
            return LocaleController.getString(i10);
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return LocaleController.getString(R.string.ArticleHeading2);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return LocaleController.getString(R.string.ArticleHeading3);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return LocaleController.getString(R.string.ArticleHeading4);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return LocaleController.getString(R.string.ArticleHeading5);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return LocaleController.getString(R.string.ArticleHeading6);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return LocaleController.getString(R.string.ArticleHintCode);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return LocaleController.getString(R.string.ArticleHintQuote);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return LocaleController.getString(R.string.ArticleHintQuote);
            }
            if (!aVar.f48341q) {
                return null;
            }
            return LocaleController.getString(R.string.ArticleHintText);
        }
    }

    public static void j(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    public static TL_iv.RichText k(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean m(d1 d1Var, int i10, int i11, int i12, int i13) {
        if (d1Var.length() != 0 || i12 < i10 || i12 > d1Var.getWidth() + i10 || i13 < i11 || i13 > d1Var.getHeight() + i11) {
            return false;
        }
        return true;
    }

    public static boolean p(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (!lowerCase.equals("/img") && !lowerCase.equals("/pic") && !lowerCase.equals("/image") && !lowerCase.equals("/picture") && !lowerCase.equals("/photo")) {
            if (!lowerCase.equals("/vid") && !lowerCase.equals("/video")) {
                if (!lowerCase.equals("/audio") && !lowerCase.equals("/music")) {
                    if (!lowerCase.equals("/map") && !lowerCase.equals("/location") && !lowerCase.equals("/loc")) {
                        if (!lowerCase.equals("/latex") && !lowerCase.equals("/equation") && !lowerCase.equals("/math")) {
                            if (!lowerCase.equals("/toggle") && !lowerCase.equals("/details")) {
                                if (!lowerCase.equals("/button")) {
                                    return 0;
                                }
                                return 7;
                            }
                            return 6;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 5;
        }
        return 4;
    }

    public static s5 r(String str, a aVar) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i12 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new s5(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new s5(v(charAt - '0'), aVar.f48329c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new s5(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new s5(pageblockpullquote, 0, 0);
                    } else if (lowerCase.equals("/table") || lowerCase.startsWith("/table ")) {
                        if (lowerCase.length() > 7) {
                            String trim2 = lowerCase.substring(7).trim();
                            int indexOf = trim2.indexOf(120);
                            if (indexOf < 0) {
                                indexOf = trim2.indexOf(88);
                            }
                            if (indexOf > 0) {
                                try {
                                    i11 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                                } catch (NumberFormatException unused) {
                                    i11 = 2;
                                }
                                try {
                                    i10 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                                    i12 = i11;
                                } catch (NumberFormatException unused2) {
                                    i12 = i11;
                                    i10 = 2;
                                    return new s5(u(i12, i10), 0, 0);
                                }
                                return new s5(u(i12, i10), 0, 0);
                            }
                        }
                        i10 = 2;
                        return new s5(u(i12, i10), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new s5(pageblockblockquote, 0, 0);
            }
            return new s5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static s5 s(String str, a aVar) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i10 = length - 1;
            if (str.charAt(i10) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f48328b;
                boolean z11 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (str.charAt(0) == '#' && (z11 || z10)) {
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        if (str.charAt(i12) == '#') {
                            i11++;
                        } else {
                            return null;
                        }
                    }
                    if (i11 >= 1 && i11 <= 6) {
                        return new s5(v(i11), aVar.f48329c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f48329c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new s5(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            f(pageblockparagraph, "");
                            return new s5(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f48329c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f48329c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f48329c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        f(pageblockparagraph2, "");
                        return new s5(pageblockparagraph2, 1, 1);
                    } else if (aVar.f48329c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new s5(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new s5(new TL_iv.pageBlockPreformatted(), 0, 0);
                        }
                        return null;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static s5 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f(pageblockparagraph, "");
        return new s5(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable u(int i10, int i11) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i12 = 0; i12 < i10; i12++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i13 = 0; i13 < i11; i13++) {
                pagetablerow.cells.add(x5.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i10) {
        switch (i10) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    public static boolean y(d1 d1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = d1Var.getLayout();
        if (layout != null && d1Var.length() != 0) {
            int paddingLeft = i12 - (d1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (d1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (d1Var.getWidth() - d1Var.getPaddingLeft()) - d1Var.getPaddingRight());
                float f9 = dp;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f9);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f9);
                float f10 = paddingLeft;
                if (f10 >= max2 && f10 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return v5.l(pageBlock.text);
    }

    public final void B() {
        this.f48780f.r();
    }

    public final void C() {
        Runnable runnable = this.C;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.C = null;
        }
        a aVar = this.f48785x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                e2 e2Var = new e2(this, 1);
                this.C = e2Var;
                postDelayed(e2Var, 100L);
                return;
            }
        }
        this.E++;
        Editable text = this.f48780f.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.D = null;
    }

    public final void D(k0 k0Var) {
        if (this.f48786y != null && this.f48785x != null && k0Var != null) {
            List<String> list = k0Var.f48531c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q6 = q(str);
                    if (q6 != 0) {
                        ((y2) this.f48786y).c(this.f48785x, q6);
                        return;
                    }
                    s5 r6 = r(str, this.f48785x);
                    if (r6 == null) {
                        r6 = s(u3.c.k(str, " "), this.f48785x);
                        continue;
                    }
                    if (r6 != null) {
                        ((y2) this.f48786y).d(this.f48785x, r6.f48747a, r6.f48748b, r6.f48749c, r6.d, r6.f48750e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        y5[] y5VarArr;
        a aVar = this.f48785x;
        if (aVar != null && p3.C3(aVar.f48328b) && com.google.android.recaptcha.internal.a.u(editable)) {
            d1 d1Var = this.f48780f;
            Paint.FontMetricsInt fontMetricsInt = d1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((d1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (y5 y5Var : (y5[]) editable.getSpans(0, editable.length(), y5.class)) {
                y5Var.replaceFontMetrics(fontMetricsInt);
                y5Var.setSize(max);
            }
        }
    }

    public final void F() {
        q5 q5Var;
        a aVar = this.f48785x;
        if (aVar != null && aVar.f48329c > 0 && (q5Var = this.f48786y) != null) {
            int b10 = ((y2) q5Var).b(aVar);
            int a2 = ((y2) this.f48786y).a(this.f48785x);
            a aVar2 = this.f48785x;
            if (aVar2.f48338n) {
                int i10 = aVar2.f48336l;
                if (i10 <= 0) {
                    b10 = 0;
                } else {
                    b10 = AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(i10, 1, 16, 10));
                }
            }
            a aVar3 = this.f48785x;
            if (aVar3.f48339o) {
                int i11 = aVar3.f48337m;
                if (i11 <= 0) {
                    a2 = 0;
                } else {
                    a2 = AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(i11, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a2 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
            }
        }
    }

    public final void G() {
        a aVar = this.f48785x;
        d1 d1Var = this.f48780f;
        d1 d1Var2 = this.h;
        if (aVar != null && p(aVar.f48328b) && (d1Var.length() > 0 || d1Var2.length() > 0)) {
            if (d1Var2.getVisibility() != 0) {
                d1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (d1Var2.getVisibility() != 8) {
            if (d1Var2.isFocused()) {
                d1Var.requestFocus();
            }
            d1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i10;
        Layout layout;
        int lineStart;
        d1 d1Var = this.f48780f;
        if (d1Var.getText() != null) {
            Editable text = d1Var.getText();
            int i11 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f48785x.f48328b).collapsed || (layout = d1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.M && i10 == this.N) {
                return;
            }
            this.O = true;
            try {
                pa0 pa0Var = this.L;
                if (pa0Var != null) {
                    text.removeSpan(pa0Var);
                }
                if (i11 >= 0) {
                    if (this.L == null) {
                        this.L = new pa0(2, this);
                    }
                    text.setSpan(this.L, i11, i10, 33);
                }
                this.O = false;
                this.M = i11;
                this.N = i10;
            } catch (Throwable th2) {
                this.O = false;
                throw th2;
            }
        }
    }

    public final void I(TL_iv.PageBlock pageBlock, boolean z10) {
        float f9;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f48783s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f48783s;
        if (linearLayout2 != null && z10) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.f48783s = null;
        }
        LinearLayout linearLayout3 = this.f48783s;
        c6 c6Var = this.f48776a;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.f48783s = linearLayout4;
            linearLayout4.setOrientation(0);
            this.f48783s.setBackground(g6.Y(g6.v0(g6.f23152i6, c6Var), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.f48783s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.f48783s, f6.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.f48783s.addView(this.v, f6.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f48784w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.f48783s.addView(this.f48784w, f6.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.f48783s.setOnClickListener(new l5(this, 1));
            this.f48783s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int v02 = g6.v0(g6.G6, c6Var);
        if (TextUtils.isEmpty(str)) {
            f9 = 0.5f;
        } else {
            f9 = 0.75f;
        }
        int l1 = g6.l1(f9, v02);
        this.f48784w.setColorFilter(new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(l1);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.f48783s.setVisibility(0);
    }

    public final void J() {
        Typeface typeface;
        a aVar = this.f48785x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            d1 d1Var = this.f48780f;
            if (d1Var.length() > 0 && (d1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        if (z10) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f48785x;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    public final void c(a aVar) {
        int i10;
        int b10;
        int i11;
        a aVar2;
        int i12;
        String l10;
        int i13 = aVar.f48329c;
        op0 op0Var = this.f48779e;
        View view = this.f48778c;
        cg.s0 s0Var = this.d;
        if (i13 <= 0) {
            view.setVisibility(8);
            s0Var.setVisibility(8);
            op0Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i13 - 1);
        view.setLayoutParams(layoutParams);
        if (i13 > 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (aVar.f48330e) {
            s0Var.setVisibility(8);
            op0Var.setVisibility(0);
            ((CheckBoxBase) op0Var.f41209b).f(-1, aVar.f48331f, false);
            return;
        }
        op0Var.setVisibility(8);
        s0Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) s0Var.getLayoutParams();
        if (aVar.d == 0) {
            b10 = AndroidUtilities.dp(18.0f);
        } else {
            q5 q5Var = this.f48786y;
            if (q5Var != null) {
                TextPaint paint = s0Var.getPaint();
                ArrayList arrayList = ((y2) q5Var).f48903a.f48646h3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i11 = aVar.f48329c) > 0 && aVar.d > 0) {
                    int i14 = indexOf;
                    while (i14 > 0) {
                        a aVar3 = (a) arrayList.get(i14 - 1);
                        int i15 = aVar3.f48329c;
                        if (i15 < i11 || (i15 == i11 && aVar3.d <= 0)) {
                            break;
                        }
                        i14--;
                    }
                    int i16 = indexOf + 1;
                    while (i16 < arrayList.size() && (i12 = (aVar2 = (a) arrayList.get(i16)).f48329c) >= i11 && (i12 != i11 || aVar2.d > 0)) {
                        i16++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f9 = 0.0f;
                    while (i14 < i16) {
                        a aVar4 = (a) arrayList.get(i14);
                        if (aVar4.f48329c == i11 && aVar4.d > 0) {
                            f9 = Math.max(f9, paint2.measureText(aVar4.d + "."));
                        }
                        i14++;
                    }
                    b10 = org.telegram.messenger.x3.b(10.0f, (int) Math.ceil(f9), AndroidUtilities.dp(28.0f));
                } else {
                    b10 = org.telegram.messenger.x3.b(10.0f, (int) Math.ceil(paint.measureText(a4.w.l(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = s0Var.getPaint();
                b10 = org.telegram.messenger.x3.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            s0Var.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            l10 = "";
        } else {
            l10 = a4.w.l(aVar.d, ".", new StringBuilder());
        }
        s0Var.setText(l10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d1 d1Var;
        Canvas canvas2;
        float f9;
        k9 k9Var;
        int dp;
        float f10;
        float f11;
        int i10;
        int dp2;
        a aVar = this.f48785x;
        LinearLayout linearLayout = this.f48777b;
        Paint paint = this.Q;
        c6 c6Var = this.f48776a;
        d1 d1Var2 = this.f48780f;
        if (aVar != null && (aVar.f48328b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(g6.v0(g6.xk, c6Var));
            int c3 = x7.c(this.f48785x);
            int d = x7.d(this.f48785x);
            int width = getWidth();
            if (c3 <= 0 && d <= 0) {
                i10 = 0;
            } else {
                int dp3 = AndroidUtilities.dp(16.0f) + c3;
                int dp4 = AndroidUtilities.dp(16.0f) + d;
                if (LocaleController.isRTL) {
                    i10 = dp4;
                } else {
                    i10 = dp3;
                }
                int width2 = getWidth();
                if (!LocaleController.isRTL) {
                    dp3 = dp4;
                }
                width = width2 - dp3;
            }
            if (i10 <= 0 && width >= getWidth()) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(8.0f);
            }
            float f12 = dp2;
            d1Var = d1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width, getHeight() - AndroidUtilities.dp(7.0f), f12, f12, paint);
            canvas2 = canvas;
        } else {
            d1Var = d1Var2;
            if (aVar != null && (aVar.f48328b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.F == null) {
                    ql0 ql0Var = new ql0(this);
                    this.F = ql0Var;
                    ql0Var.a(null, null, null, this.f48776a, 1);
                    x7.a(this.F, c6Var);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.F.b(canvas2, rectF, floor, floor, floor, 1.0f);
                this.F.e(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f48328b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.F == null) {
                        ql0 ql0Var2 = new ql0(this);
                        this.F = ql0Var2;
                        ql0Var2.a(null, null, null, this.f48776a, 1);
                        x7.a(this.F, c6Var);
                    }
                    if (this.G == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.G = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Oh, c6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = d1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f9 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            int left = d1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i11) + d1Var.getPaddingLeft() + left);
                            int left2 = d1Var.getLeft() + linearLayout.getLeft();
                            f9 = Math.max(f9, layout.getLineRight(i11) + d1Var.getPaddingLeft() + left2);
                        }
                    } else if (d1Var.getHint() != null) {
                        float measureText = d1Var.getPaint().measureText(d1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f9 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f9 = 0.0f;
                    }
                    d1 d1Var3 = this.h;
                    if (d1Var3.getVisibility() == 0) {
                        Layout layout2 = d1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                int left3 = d1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i12) + d1Var3.getPaddingLeft() + left3);
                                int left4 = d1Var3.getLeft();
                                f9 = Math.max(f9, layout2.getLineRight(i12) + d1Var3.getPaddingLeft() + left4);
                            }
                        } else if (d1Var3.getHint() != null) {
                            float measureText2 = d1Var3.getPaint().measureText(d1Var3.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                            f9 = Math.max(f9, ((getWidth() + measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                        }
                    }
                    if (width3 < f9) {
                        float dp5 = width3 - AndroidUtilities.dp(30.0f);
                        float dp6 = AndroidUtilities.dp(30.0f) + f9;
                        float floor2 = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                        int dp7 = AndroidUtilities.dp(8.0f);
                        int height = getHeight() - AndroidUtilities.dp(8.0f);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dp5, dp7, dp6, height);
                        this.F.b(canvas2, rectF2, floor2, floor2, floor2, 1.0f);
                        canvas2.save();
                        int i13 = (int) dp5;
                        this.G.setBounds(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(7.0f) + dp7, this.G.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i13, this.G.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + dp7);
                        canvas2.scale(-1.0f, -1.0f, this.G.getBounds().centerX(), this.G.getBounds().centerY());
                        this.G.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i14 = (int) dp6;
                        this.G.setBounds((i14 - AndroidUtilities.dp(8.0f)) - this.G.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.G.getIntrinsicHeight(), i14 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.G.getBounds().centerX(), this.G.getBounds().centerY());
                        this.G.draw(canvas2);
                        canvas2.restore();
                    }
                }
            }
        }
        if (this.P) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = d1Var.getLayout();
            if (layout3 != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + d1Var.getPaddingTop() + getPaddingTop());
                    int left5 = d1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + d1Var.getPaddingLeft() + left5);
                    int left6 = d1Var.getLeft() + linearLayout.getLeft();
                    f10 = Math.max(f10, layout3.getLineRight(i15) + d1Var.getPaddingLeft() + left6);
                    f11 = Math.max(height2, layout3.getLineBottom(i15) + d1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (width4 < f10 && height2 < f11) {
                paint.setColor(g6.l1(0.05f, g6.v0(g6.G6, c6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(width4 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(2.0f), f10 + AndroidUtilities.dp(4.0f), f11 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        q5 q5Var = this.f48786y;
        if (q5Var != null) {
            k9Var = ((y2) q5Var).f48903a.getTextSelectionHelper();
        } else {
            k9Var = null;
        }
        if (k9Var != null) {
            ArrayList arrayList = this.f48782r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                v9 v9Var = (v9) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(v9Var.getX(), v9Var.getY());
                k9Var.a0(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (!o()) {
            return;
        }
        if (this.H == null) {
            this.H = new hi0(this);
        }
        int v02 = g6.v0(g6.Oh, c6Var);
        float B = org.telegram.messenger.x3.B(8.0f, getHeight(), AndroidUtilities.dp(3.333f));
        this.H.a(canvas2, this.I, org.telegram.messenger.x3.B(16.0f, getWidth(), dp), B, v02, ((TL_iv.pageBlockBlockquote) this.f48785x.f48328b).collapsed, l());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.H != null) {
            boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.J) {
                            this.J = false;
                            this.H.b(false);
                            return true;
                        }
                    } else if (this.J) {
                        this.H.b(contains);
                        return true;
                    }
                } else if (this.J) {
                    this.J = false;
                    this.H.b(false);
                    if (contains && o()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f48785x.f48328b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        q5 q5Var = this.f48786y;
                        if (q5Var != null) {
                            p3 p3Var = ((y2) q5Var).f48903a;
                            b2 b2Var = p3Var.F3;
                            if (b2Var != null) {
                                b2Var.g();
                            }
                            p3Var.f48638d3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.J = true;
                this.H.b(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        this.f48780f.t();
        d1 d1Var = this.h;
        if (d1Var != null) {
            d1Var.t();
        }
        int i10 = g6.G6;
        c6 c6Var = this.f48776a;
        this.d.setTextColor(g6.v0(i10, c6Var));
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Oh, c6Var), PorterDuff.Mode.SRC_IN));
        }
        ql0 ql0Var = this.F;
        if (ql0Var != null) {
            x7.a(ql0Var, c6Var);
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        d1 d1Var = this.f48780f;
        Layout layout2 = d1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f48777b;
            arrayList.add(new v4(layout2, d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft(), d1Var.getPaddingTop() + d1Var.getTop() + linearLayout.getTop(), 1));
        }
        d1 d1Var2 = this.h;
        if (d1Var2.getVisibility() == 0 && (layout = d1Var2.getLayout()) != null) {
            arrayList.add(new v4(layout, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop(), 2));
        }
    }

    public final void g(th.a r25, th.q5 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: th.t5.g(th.a, th.q5, boolean):void");
    }

    public d1 getAuthorEditText() {
        return this.h;
    }

    public int[] getColorKeys() {
        return null;
    }

    public d1 getEditText() {
        return this.f48780f;
    }

    public a getRow() {
        return this.f48785x;
    }

    public org.telegram.ui.ActionBar.u4 getStyleDelegate() {
        return this.f48780f;
    }

    public final int h(int i10, int i11) {
        Layout layout;
        hi0 hi0Var;
        int dp;
        boolean z10;
        if (l()) {
            d1 d1Var = this.h;
            if (d1Var.getVisibility() == 0 && (layout = d1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.H == null) {
                    this.H = new hi0(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f48777b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + d1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + d1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + d1Var.getPaddingTop() + measuredHeight;
                int dp2 = AndroidUtilities.dp(3.333f);
                this.H.getClass();
                float B = org.telegram.messenger.x3.B(16.0f, i10, dp2) - org.telegram.messenger.x3.D(3.333f, 2, AndroidUtilities.dp(23.66f) + hi0Var.f29185c);
                this.H.getClass();
                int i12 = i11 - dp2;
                float dp3 = i12 - AndroidUtilities.dp(17.66f);
                float f9 = i12;
                if (lineRight > B) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = (lineBottom <= dp3 || lineTop >= f9) ? false : false;
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + dp) + dp2) - i11));
                }
            }
        }
        return 0;
    }

    public final void i() {
        a aVar = this.f48785x;
        if (aVar != null) {
            j(aVar.f48328b);
        }
        d1 d1Var = this.h;
        if (d1Var.getVisibility() != 0) {
            d1Var.setVisibility(0);
            requestLayout();
        }
        d1Var.r();
        d1Var.setSelection(d1Var.length());
    }

    public final boolean l() {
        Layout layout;
        if (!o() || (layout = this.f48780f.getLayout()) == null || layout.getLineCount() <= 3) {
            return false;
        }
        return true;
    }

    public final boolean n() {
        if (this.h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        a aVar = this.f48785x;
        if (aVar != null && (aVar.f48328b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        H();
        d1 d1Var = this.h;
        if (d1Var.getVisibility() == 8) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f48777b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        d1Var.layout(paddingLeft, measuredHeight, d1Var.getMeasuredWidth() + paddingLeft, d1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        F();
        int size = View.MeasureSpec.getSize(i10);
        d1 d1Var = this.h;
        if (d1Var.getVisibility() == 8) {
            this.K = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f48777b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        d1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + d1Var.getMeasuredHeight() + measuredHeight;
        int h = h(size, paddingBottom);
        this.K = h;
        setMeasuredDimension(size, paddingBottom + h);
    }

    public void setLocked(boolean z10) {
        this.f48780f.setLocked(z10);
        this.h.setLocked(z10);
    }

    public void setShowCommandBackground(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            hi0 hi0Var = this.H;
            if (hi0Var != null) {
                if (drawable != hi0Var.f29184b && drawable != hi0Var.f29186e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f48785x;
        if (aVar != null && p(aVar.f48328b)) {
            TL_iv.PageBlock pageBlock = this.f48785x.f48328b;
            TL_iv.RichText f9 = v5.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f9;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f9;
            }
        }
    }

    public final void x() {
        a aVar = this.f48785x;
        if (aVar != null) {
            d(aVar.f48328b, this.f48780f.getText());
        }
    }
}
