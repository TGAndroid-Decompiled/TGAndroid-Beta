package vh;

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
import java.util.ArrayList;
import java.util.List;
import k7.b6;
import k7.i8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.nw0;
public final class w5 extends FrameLayout implements org.telegram.ui.ActionBar.a6, k9 {
    public static final int S = 0;
    public boolean B;
    public boolean C;
    public g2 D;
    public String E;
    public int F;
    public zl0 G;
    public Drawable H;
    public si0 I;
    public final RectF J;
    public boolean K;
    public int L;
    public va0 M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public final Paint R;
    public final f6 f46338a;
    public final LinearLayout f46339b;
    public final View f46340c;
    public final eg.s0 d;
    public final nw0 e;
    public final e1 f46341f;
    public final e1 h;
    public boolean f46342n;
    public final ArrayList f46343r;
    public LinearLayout f46344s;
    public TextView v;
    public ImageView f46345w;
    public a f46346x;
    public t5 f46347y;

    public w5(Context context, f6 f6Var) {
        super(context);
        this.f46343r = new ArrayList();
        this.J = new RectF();
        this.N = -1;
        this.O = -1;
        this.R = new Paint(1);
        this.f46338a = f6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46339b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f46340c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        eg.s0 s0Var = new eg.s0(this, context);
        this.d = s0Var;
        s0Var.setGravity(8388627);
        s0Var.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        s0Var.setSingleLine(true);
        s0Var.setIncludeFontPadding(false);
        s0Var.setTextSize(1, 16.0f);
        linearLayout.addView(s0Var, b6.n(18, -2));
        nw0 nw0Var = new nw0(context, f6Var);
        this.e = nw0Var;
        nw0Var.setVisibility(8);
        nw0Var.setOnClickListener(new o5(this, 0));
        linearLayout.addView(nw0Var, b6.n(18, -2));
        e1 e1Var = new e1(context, f6Var);
        this.f46341f = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        e1Var.setListener(new r5(this));
        e1Var.setDelegate(new st(this) {
            public final w5 f46154b;

            {
                this.f46154b = this;
            }

            @Override
            public final void J() {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f46154b;
                        if (!w5Var.P && w5Var.f46346x != null) {
                            w5Var.J();
                            w5.d(w5Var.f46346x.f45853b, w5Var.f46341f.getText());
                            t5 t5Var = w5Var.f46347y;
                            if (t5Var != null) {
                                s3.N1(((b3) t5Var).f45897a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        w5 w5Var2 = this.f46154b;
                        if (w5Var2.f46346x != null) {
                            w5Var2.w();
                            t5 t5Var2 = w5Var2.f46347y;
                            if (t5Var2 != null) {
                                s3.N1(((b3) t5Var2).f45897a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        e1Var.setOnFocusChangeListener(new cg.z(this, 7));
        linearLayout.addView(e1Var, b6.l(1.0f, 0, -2));
        addView(linearLayout, b6.e(-1, -2, 51));
        e1 e1Var2 = new e1(context, f6Var);
        this.h = e1Var2;
        e1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        e1Var2.setAllowNewlines(false);
        e1Var2.setInputType(147457);
        e1Var2.setListener(new s5(this));
        e1Var2.setDelegate(new st(this) {
            public final w5 f46154b;

            {
                this.f46154b = this;
            }

            @Override
            public final void J() {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f46154b;
                        if (!w5Var.P && w5Var.f46346x != null) {
                            w5Var.J();
                            w5.d(w5Var.f46346x.f45853b, w5Var.f46341f.getText());
                            t5 t5Var = w5Var.f46347y;
                            if (t5Var != null) {
                                s3.N1(((b3) t5Var).f45897a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        w5 w5Var2 = this.f46154b;
                        if (w5Var2.f46346x != null) {
                            w5Var2.w();
                            t5 t5Var2 = w5Var2.f46347y;
                            if (t5Var2 != null) {
                                s3.N1(((b3) t5Var2).f45897a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        e1Var2.setVisibility(8);
        addView(e1Var2, b6.e(-1, -2, 51));
        e();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return y5.r(pageBlock.text, pageBlock, true);
    }

    public static void a(w5 w5Var, boolean z4) {
        t5 t5Var;
        w5Var.f46341f.setHint(w5Var.getHint());
        if (!z4 && (t5Var = w5Var.f46347y) != null) {
            ((b3) t5Var).f45897a.f46209e3.t(w5Var, null);
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
        pageBlock.text = y5.f(charSequence);
    }

    public static void f(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i10;
        a aVar = this.f46346x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f45853b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f45864p) {
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
            if (!aVar.f45865q) {
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

    public static boolean m(e1 e1Var, int i10, int i11, int i12, int i13) {
        if (e1Var.length() != 0 || i12 < i10 || i12 > e1Var.getWidth() + i10 || i13 < i11 || i13 > e1Var.getHeight() + i11) {
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

    public static v5 r(String str, a aVar) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i12 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new v5(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new v5(v(charAt - '0'), aVar.f45854c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new v5(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new v5(pageblockpullquote, 0, 0);
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
                                    return new v5(u(i12, i10), 0, 0);
                                }
                                return new v5(u(i12, i10), 0, 0);
                            }
                        }
                        i10 = 2;
                        return new v5(u(i12, i10), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new v5(pageblockblockquote, 0, 0);
            }
            return new v5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static v5 s(String str, a aVar) {
        int length;
        boolean z4;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i10 = length - 1;
            if (str.charAt(i10) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f45853b;
                boolean z10 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (str.charAt(0) == '#' && (z10 || z4)) {
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        if (str.charAt(i12) == '#') {
                            i11++;
                        } else {
                            return null;
                        }
                    }
                    if (i11 >= 1 && i11 <= 6) {
                        return new v5(v(i11), aVar.f45854c, aVar.d);
                    }
                    return null;
                } else if (z10) {
                    if (aVar.f45854c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new v5(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            f(pageblockparagraph, "");
                            return new v5(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f45854c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f45854c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f45854c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        f(pageblockparagraph2, "");
                        return new v5(pageblockparagraph2, 1, 1);
                    } else if (aVar.f45854c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new v5(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new v5(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static v5 t(boolean z4) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f(pageblockparagraph, "");
        return new v5(pageblockparagraph, 1, 0, true, z4);
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
                pagetablerow.cells.add(a6.f());
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

    public static boolean y(e1 e1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = e1Var.getLayout();
        if (layout != null && e1Var.length() != 0) {
            int paddingLeft = i12 - (e1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (e1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (e1Var.getWidth() - e1Var.getPaddingLeft()) - e1Var.getPaddingRight());
                float f10 = dp;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f10);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f10);
                float f11 = paddingLeft;
                if (f11 >= max2 && f11 <= min) {
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
        return y5.l(pageBlock.text);
    }

    public final void B() {
        this.f46341f.r();
    }

    public final void C() {
        Runnable runnable = this.D;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.D = null;
        }
        a aVar = this.f46346x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45853b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                g2 g2Var = new g2(this, 1);
                this.D = g2Var;
                postDelayed(g2Var, 100L);
                return;
            }
        }
        this.F++;
        Editable text = this.f46341f.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.E = null;
    }

    public final void D(l0 l0Var) {
        if (this.f46347y != null && this.f46346x != null && l0Var != null) {
            List<String> list = l0Var.f46061c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q10 = q(str);
                    if (q10 != 0) {
                        ((b3) this.f46347y).c(this.f46346x, q10);
                        return;
                    }
                    v5 r10 = r(str, this.f46346x);
                    if (r10 == null) {
                        r10 = s(w2.k(str, " "), this.f46346x);
                        continue;
                    }
                    if (r10 != null) {
                        ((b3) this.f46347y).d(this.f46346x, r10.f46313a, r10.f46314b, r10.f46315c, r10.d, r10.e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.u5[] u5VarArr;
        a aVar = this.f46346x;
        if (aVar != null && s3.B3(aVar.f45853b) && e2.c.s(editable)) {
            e1 e1Var = this.f46341f;
            Paint.FontMetricsInt fontMetricsInt = e1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((e1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.u5 u5Var : (org.telegram.ui.Components.u5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.u5.class)) {
                u5Var.replaceFontMetrics(fontMetricsInt);
                u5Var.setSize(max);
            }
        }
    }

    public final void F() {
        t5 t5Var;
        a aVar = this.f46346x;
        if (aVar != null && aVar.f45854c > 0 && (t5Var = this.f46347y) != null) {
            int b10 = ((b3) t5Var).b(aVar);
            int a2 = ((b3) this.f46347y).a(this.f46346x);
            a aVar2 = this.f46346x;
            if (aVar2.f45862n) {
                int i10 = aVar2.f45860l;
                if (i10 <= 0) {
                    b10 = 0;
                } else {
                    b10 = AndroidUtilities.dp(e2.c.e(i10, 1, 16, 10));
                }
            }
            a aVar3 = this.f46346x;
            if (aVar3.f45863o) {
                int i11 = aVar3.f45861m;
                if (i11 <= 0) {
                    a2 = 0;
                } else {
                    a2 = AndroidUtilities.dp(e2.c.e(i11, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a2 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
            }
        }
    }

    public final void G() {
        a aVar = this.f46346x;
        e1 e1Var = this.f46341f;
        e1 e1Var2 = this.h;
        if (aVar != null && p(aVar.f45853b) && (e1Var.length() > 0 || e1Var2.length() > 0)) {
            if (e1Var2.getVisibility() != 0) {
                e1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (e1Var2.getVisibility() != 8) {
            if (e1Var2.isFocused()) {
                e1Var.requestFocus();
            }
            e1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i10;
        Layout layout;
        int lineStart;
        e1 e1Var = this.f46341f;
        if (e1Var.getText() != null) {
            Editable text = e1Var.getText();
            int i11 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f46346x.f45853b).collapsed || (layout = e1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.N && i10 == this.O) {
                return;
            }
            this.P = true;
            try {
                va0 va0Var = this.M;
                if (va0Var != null) {
                    text.removeSpan(va0Var);
                }
                if (i11 >= 0) {
                    if (this.M == null) {
                        this.M = new va0(2, this);
                    }
                    text.setSpan(this.M, i11, i10, 33);
                }
                this.P = false;
                this.N = i11;
                this.O = i10;
            } catch (Throwable th2) {
                this.P = false;
                throw th2;
            }
        }
    }

    public final void I(TL_iv.PageBlock pageBlock, boolean z4) {
        float f10;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f46344s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f46344s;
        if (linearLayout2 != null && z4) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.f46344s = null;
        }
        LinearLayout linearLayout3 = this.f46344s;
        f6 f6Var = this.f46338a;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.f46344s = linearLayout4;
            linearLayout4.setOrientation(0);
            this.f46344s.setBackground(j6.Y(j6.v0(j6.f19971i6, f6Var), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.f46344s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.f46344s, b6.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.f46344s.addView(this.v, b6.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f46345w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.f46344s.addView(this.f46345w, b6.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.f46344s.setOnClickListener(new o5(this, 1));
            this.f46344s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int v02 = j6.v0(j6.G6, f6Var);
        if (TextUtils.isEmpty(str)) {
            f10 = 0.5f;
        } else {
            f10 = 0.75f;
        }
        int l1 = j6.l1(f10, v02);
        this.f46345w.setColorFilter(new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(l1);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.f46344s.setVisibility(0);
    }

    public final void J() {
        Typeface typeface;
        a aVar = this.f46346x;
        boolean z4 = false;
        if (aVar != null && aVar.d > 0) {
            e1 e1Var = this.f46341f;
            if (e1Var.length() > 0 && (e1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z4 = true;
            }
        }
        if (z4) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f46346x;
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
        String m9;
        int i13 = aVar.f45854c;
        nw0 nw0Var = this.e;
        View view = this.f46340c;
        eg.s0 s0Var = this.d;
        if (i13 <= 0) {
            view.setVisibility(8);
            s0Var.setVisibility(8);
            nw0Var.setVisibility(8);
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
        if (aVar.e) {
            s0Var.setVisibility(8);
            nw0Var.setVisibility(0);
            ((CheckBoxBase) nw0Var.f36598b).f(-1, aVar.f45855f, false);
            return;
        }
        nw0Var.setVisibility(8);
        s0Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) s0Var.getLayoutParams();
        if (aVar.d == 0) {
            b10 = AndroidUtilities.dp(18.0f);
        } else {
            t5 t5Var = this.f46347y;
            if (t5Var != null) {
                TextPaint paint = s0Var.getPaint();
                ArrayList arrayList = ((b3) t5Var).f45897a.f46217i3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i11 = aVar.f45854c) > 0 && aVar.d > 0) {
                    int i14 = indexOf;
                    while (i14 > 0) {
                        a aVar3 = (a) arrayList.get(i14 - 1);
                        int i15 = aVar3.f45854c;
                        if (i15 < i11 || (i15 == i11 && aVar3.d <= 0)) {
                            break;
                        }
                        i14--;
                    }
                    int i16 = indexOf + 1;
                    while (i16 < arrayList.size() && (i12 = (aVar2 = (a) arrayList.get(i16)).f45854c) >= i11 && (i12 != i11 || aVar2.d > 0)) {
                        i16++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f10 = 0.0f;
                    while (i14 < i16) {
                        a aVar4 = (a) arrayList.get(i14);
                        if (aVar4.f45854c == i11 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i14++;
                    }
                    b10 = org.telegram.messenger.y3.b(10.0f, (int) Math.ceil(f10), AndroidUtilities.dp(28.0f));
                } else {
                    b10 = org.telegram.messenger.y3.b(10.0f, (int) Math.ceil(paint.measureText(android.support.v4.media.a.m(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = s0Var.getPaint();
                b10 = org.telegram.messenger.y3.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            s0Var.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            m9 = "";
        } else {
            m9 = android.support.v4.media.a.m(aVar.d, ".", new StringBuilder());
        }
        s0Var.setText(m9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e1 e1Var;
        Canvas canvas2;
        float f10;
        l9 l9Var;
        int dp;
        float f11;
        float f12;
        int i10;
        int dp2;
        a aVar = this.f46346x;
        LinearLayout linearLayout = this.f46339b;
        Paint paint = this.R;
        f6 f6Var = this.f46338a;
        e1 e1Var2 = this.f46341f;
        if (aVar != null && (aVar.f45853b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(j6.v0(j6.xk, f6Var));
            int c3 = i8.c(this.f46346x);
            int d = i8.d(this.f46346x);
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
            float f13 = dp2;
            e1Var = e1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width, getHeight() - AndroidUtilities.dp(7.0f), f13, f13, paint);
            canvas2 = canvas;
        } else {
            e1Var = e1Var2;
            if (aVar != null && (aVar.f45853b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.G == null) {
                    zl0 zl0Var = new zl0(this);
                    this.G = zl0Var;
                    zl0Var.a(null, null, null, this.f46338a, 1);
                    i8.a(this.G, f6Var);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.G.b(canvas2, rectF, floor, floor, floor, 1.0f);
                this.G.e(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f45853b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.G == null) {
                        zl0 zl0Var2 = new zl0(this);
                        this.G = zl0Var2;
                        zl0Var2.a(null, null, null, this.f46338a, 1);
                        i8.a(this.G, f6Var);
                    }
                    if (this.H == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.H = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Oh, f6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = e1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            int left = e1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i11) + e1Var.getPaddingLeft() + left);
                            int left2 = e1Var.getLeft() + linearLayout.getLeft();
                            f10 = Math.max(f10, layout.getLineRight(i11) + e1Var.getPaddingLeft() + left2);
                        }
                    } else if (e1Var.getHint() != null) {
                        float measureText = e1Var.getPaint().measureText(e1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    e1 e1Var3 = this.h;
                    if (e1Var3.getVisibility() == 0) {
                        Layout layout2 = e1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                int left3 = e1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i12) + e1Var3.getPaddingLeft() + left3);
                                int left4 = e1Var3.getLeft();
                                f10 = Math.max(f10, layout2.getLineRight(i12) + e1Var3.getPaddingLeft() + left4);
                            }
                        } else if (e1Var3.getHint() != null) {
                            float measureText2 = e1Var3.getPaint().measureText(e1Var3.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                        }
                    }
                    if (width3 < f10) {
                        float dp5 = width3 - AndroidUtilities.dp(30.0f);
                        float dp6 = AndroidUtilities.dp(30.0f) + f10;
                        float floor2 = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                        int dp7 = AndroidUtilities.dp(8.0f);
                        int height = getHeight() - AndroidUtilities.dp(8.0f);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dp5, dp7, dp6, height);
                        this.G.b(canvas2, rectF2, floor2, floor2, floor2, 1.0f);
                        canvas2.save();
                        int i13 = (int) dp5;
                        this.H.setBounds(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(7.0f) + dp7, this.H.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i13, this.H.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + dp7);
                        canvas2.scale(-1.0f, -1.0f, this.H.getBounds().centerX(), this.H.getBounds().centerY());
                        this.H.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i14 = (int) dp6;
                        this.H.setBounds((i14 - AndroidUtilities.dp(8.0f)) - this.H.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.H.getIntrinsicHeight(), i14 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.H.getBounds().centerX(), this.H.getBounds().centerY());
                        this.H.draw(canvas2);
                        canvas2.restore();
                    }
                }
            }
        }
        if (this.Q) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = e1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + e1Var.getPaddingTop() + getPaddingTop());
                    int left5 = e1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + e1Var.getPaddingLeft() + left5);
                    int left6 = e1Var.getLeft() + linearLayout.getLeft();
                    f11 = Math.max(f11, layout3.getLineRight(i15) + e1Var.getPaddingLeft() + left6);
                    f12 = Math.max(height2, layout3.getLineBottom(i15) + e1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                paint.setColor(j6.l1(0.05f, j6.v0(j6.G6, f6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(width4 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(2.0f), f11 + AndroidUtilities.dp(4.0f), f12 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        t5 t5Var = this.f46347y;
        if (t5Var != null) {
            l9Var = ((b3) t5Var).f45897a.getTextSelectionHelper();
        } else {
            l9Var = null;
        }
        if (l9Var != null) {
            ArrayList arrayList = this.f46343r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                w9 w9Var = (w9) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(w9Var.getX(), w9Var.getY());
                l9Var.a0(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (!o()) {
            return;
        }
        if (this.I == null) {
            this.I = new si0(this);
        }
        int v02 = j6.v0(j6.Oh, f6Var);
        float B = org.telegram.messenger.y3.B(8.0f, getHeight(), AndroidUtilities.dp(3.333f));
        this.I.a(canvas2, this.J, org.telegram.messenger.y3.B(16.0f, getWidth(), dp), B, v02, ((TL_iv.pageBlockBlockquote) this.f46346x.f45853b).collapsed, l());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.I != null) {
            boolean contains = this.J.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.K) {
                            this.K = false;
                            this.I.b(false);
                            return true;
                        }
                    } else if (this.K) {
                        this.I.b(contains);
                        return true;
                    }
                } else if (this.K) {
                    this.K = false;
                    this.I.b(false);
                    if (contains && o()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f46346x.f45853b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        t5 t5Var = this.f46347y;
                        if (t5Var != null) {
                            s3 s3Var = ((b3) t5Var).f45897a;
                            d2 d2Var = s3Var.G3;
                            if (d2Var != null) {
                                d2Var.g();
                            }
                            s3Var.f46209e3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.K = true;
                this.I.b(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        this.f46341f.t();
        e1 e1Var = this.h;
        if (e1Var != null) {
            e1Var.t();
        }
        int i10 = j6.G6;
        f6 f6Var = this.f46338a;
        this.d.setTextColor(j6.v0(i10, f6Var));
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Oh, f6Var), PorterDuff.Mode.SRC_IN));
        }
        zl0 zl0Var = this.G;
        if (zl0Var != null) {
            i8.a(zl0Var, f6Var);
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        e1 e1Var = this.f46341f;
        Layout layout2 = e1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f46339b;
            arrayList.add(new y4(layout2, e1Var.getPaddingLeft() + e1Var.getLeft() + linearLayout.getLeft(), e1Var.getPaddingTop() + e1Var.getTop() + linearLayout.getTop(), 1));
        }
        e1 e1Var2 = this.h;
        if (e1Var2.getVisibility() == 0 && (layout = e1Var2.getLayout()) != null) {
            arrayList.add(new y4(layout, e1Var2.getPaddingLeft() + e1Var2.getLeft(), e1Var2.getPaddingTop() + e1Var2.getTop(), 2));
        }
    }

    public final void g(vh.a r25, vh.t5 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: vh.w5.g(vh.a, vh.t5, boolean):void");
    }

    public e1 getAuthorEditText() {
        return this.h;
    }

    public int[] getColorKeys() {
        return null;
    }

    public e1 getEditText() {
        return this.f46341f;
    }

    public a getRow() {
        return this.f46346x;
    }

    public org.telegram.ui.ActionBar.x4 getStyleDelegate() {
        return this.f46341f;
    }

    public final int h(int i10, int i11) {
        Layout layout;
        si0 si0Var;
        int dp;
        boolean z4;
        if (l()) {
            e1 e1Var = this.h;
            if (e1Var.getVisibility() == 0 && (layout = e1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.I == null) {
                    this.I = new si0(this);
                }
                boolean z10 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f46339b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + e1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + e1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + e1Var.getPaddingTop() + measuredHeight;
                int dp2 = AndroidUtilities.dp(3.333f);
                this.I.getClass();
                float B = org.telegram.messenger.y3.B(16.0f, i10, dp2) - org.telegram.messenger.y3.D(3.333f, 2, AndroidUtilities.dp(23.66f) + si0Var.f28750c);
                this.I.getClass();
                int i12 = i11 - dp2;
                float dp3 = i12 - AndroidUtilities.dp(17.66f);
                float f10 = i12;
                if (lineRight > B) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z10 = (lineBottom <= dp3 || lineTop >= f10) ? false : false;
                if (z4 && z10) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + dp) + dp2) - i11));
                }
            }
        }
        return 0;
    }

    public final void i() {
        a aVar = this.f46346x;
        if (aVar != null) {
            j(aVar.f45853b);
        }
        e1 e1Var = this.h;
        if (e1Var.getVisibility() != 0) {
            e1Var.setVisibility(0);
            requestLayout();
        }
        e1Var.r();
        e1Var.setSelection(e1Var.length());
    }

    public final boolean l() {
        Layout layout;
        if (!o() || (layout = this.f46341f.getLayout()) == null || layout.getLineCount() <= 3) {
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
        a aVar = this.f46346x;
        if (aVar != null && (aVar.f45853b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        H();
        e1 e1Var = this.h;
        if (e1Var.getVisibility() == 8) {
            super.onLayout(z4, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f46339b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        e1Var.layout(paddingLeft, measuredHeight, e1Var.getMeasuredWidth() + paddingLeft, e1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        F();
        int size = View.MeasureSpec.getSize(i10);
        e1 e1Var = this.h;
        if (e1Var.getVisibility() == 8) {
            this.L = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f46339b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        e1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + e1Var.getMeasuredHeight() + measuredHeight;
        int h = h(size, paddingBottom);
        this.L = h;
        setMeasuredDimension(size, paddingBottom + h);
    }

    public void setLocked(boolean z4) {
        this.f46341f.setLocked(z4);
        this.h.setLocked(z4);
    }

    public void setShowCommandBackground(boolean z4) {
        if (this.Q == z4) {
            return;
        }
        this.Q = z4;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            si0 si0Var = this.I;
            if (si0Var != null) {
                if (drawable != si0Var.f28749b && drawable != si0Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f46346x;
        if (aVar != null && p(aVar.f45853b)) {
            TL_iv.PageBlock pageBlock = this.f46346x.f45853b;
            TL_iv.RichText f10 = y5.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
            }
        }
    }

    public final void x() {
        a aVar = this.f46346x;
        if (aVar != null) {
            d(aVar.f45853b, this.f46341f.getText());
        }
    }
}
