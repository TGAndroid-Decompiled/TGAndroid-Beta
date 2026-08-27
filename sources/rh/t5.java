package rh;

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
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import h7.z6;
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
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.aj0;

public final class t5 extends FrameLayout implements org.telegram.ui.ActionBar.x5, i9 {
    public static final int R = 0;
    public boolean A;
    public boolean B;
    public e2 C;
    public String D;
    public int E;
    public gl0 F;
    public Drawable G;
    public zh0 H;
    public final RectF I;
    public boolean J;
    public int K;
    public fa0 L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public final Paint Q;

    public final c6 f47478a;

    public final LinearLayout f47479b;

    public final View f47480c;
    public final ag.e1 d;

    public final aj0 f47481e;

    public final d1 f47482f;
    public final d1 h;

    public boolean f47483n;

    public final ArrayList f47484r;

    public LinearLayout f47485s;
    public TextView v;

    public ImageView f47486w;

    public a f47487x;

    public q5 f47488y;

    public t5(Context context, c6 c6Var) {
        super(context);
        this.f47484r = new ArrayList();
        this.I = new RectF();
        this.M = -1;
        this.N = -1;
        this.Q = new Paint(1);
        this.f47478a = c6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47479b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f47480c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        ag.e1 e1Var = new ag.e1(this, context);
        this.d = e1Var;
        e1Var.setGravity(8388627);
        e1Var.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        e1Var.setSingleLine(true);
        e1Var.setIncludeFontPadding(false);
        e1Var.setTextSize(1, 16.0f);
        linearLayout.addView(e1Var, z5.n(18, -2));
        aj0 aj0Var = new aj0(context, c6Var);
        this.f47481e = aj0Var;
        aj0Var.setVisibility(8);
        aj0Var.setOnClickListener(new l5(this, 0));
        linearLayout.addView(aj0Var, z5.n(18, -2));
        d1 d1Var = new d1(context, c6Var);
        this.f47482f = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        d1Var.setListener(new o5(this));
        final int i10 = 0;
        d1Var.setDelegate(new jt(this) {

            public final t5 f47286b;

            {
                this.f47286b = this;
            }

            @Override
            public final void k1() {
                switch (i10) {
                    case 0:
                        t5 t5Var = this.f47286b;
                        if (!t5Var.O && t5Var.f47487x != null) {
                            t5Var.J();
                            t5.e(t5Var.f47487x.f47028b, t5Var.f47482f.getText());
                            q5 q5Var = t5Var.f47488y;
                            if (q5Var != null) {
                                p3.O1(((y2) q5Var).f47605a);
                            }
                        }
                        break;
                    default:
                        t5 t5Var2 = this.f47286b;
                        if (t5Var2.f47487x != null) {
                            t5Var2.w();
                            q5 q5Var2 = t5Var2.f47488y;
                            if (q5Var2 != null) {
                                p3.O1(((y2) q5Var2).f47605a);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        d1Var.setOnFocusChangeListener(new hh.j(this, 5));
        linearLayout.addView(d1Var, z5.l(1.0f, 0, -2));
        addView(linearLayout, z5.e(-1, -2, 51));
        d1 d1Var2 = new d1(context, c6Var);
        this.h = d1Var2;
        d1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var2.setAllowNewlines(false);
        d1Var2.setInputType(147457);
        d1Var2.setListener(new p5(this));
        final int i11 = 1;
        d1Var2.setDelegate(new jt(this) {

            public final t5 f47286b;

            {
                this.f47286b = this;
            }

            @Override
            public final void k1() {
                switch (i11) {
                    case 0:
                        t5 t5Var = this.f47286b;
                        if (!t5Var.O && t5Var.f47487x != null) {
                            t5Var.J();
                            t5.e(t5Var.f47487x.f47028b, t5Var.f47482f.getText());
                            q5 q5Var = t5Var.f47488y;
                            if (q5Var != null) {
                                p3.O1(((y2) q5Var).f47605a);
                            }
                        }
                        break;
                    default:
                        t5 t5Var2 = this.f47286b;
                        if (t5Var2.f47487x != null) {
                            t5Var2.w();
                            q5 q5Var2 = t5Var2.f47488y;
                            if (q5Var2 != null) {
                                p3.O1(((y2) q5Var2).f47605a);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        d1Var2.setVisibility(8);
        addView(d1Var2, z5.e(-1, -2, 51));
        d();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return v5.r(pageBlock.text, pageBlock, true);
    }

    public static void a(t5 t5Var, boolean z10) {
        q5 q5Var;
        t5Var.f47482f.setHint(t5Var.getHint());
        if (z10 || (q5Var = t5Var.f47488y) == null) {
            return;
        }
        ((y2) q5Var).f47605a.f47340d3.a0(t5Var, null);
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) != '/') {
            return null;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\t') {
                return null;
            }
        }
        return str;
    }

    public static void e(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = v5.f(charSequence);
    }

    public static void f(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        a aVar = this.f47487x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return LocaleController.getString(aVar.f47040p ? R.string.ArticleHintTitle : R.string.ArticleHeading1);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return LocaleController.getString(R.string.ArticleHeading2);
        }
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
        if (aVar.f47041q) {
            return LocaleController.getString(R.string.ArticleHintText);
        }
        return null;
    }

    public static void j(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
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
        return d1Var.length() == 0 && i12 >= i10 && i12 <= d1Var.getWidth() + i10 && i13 >= i11 && i13 <= d1Var.getHeight() + i11;
    }

    public static boolean p(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals("/img") || lowerCase.equals("/pic") || lowerCase.equals("/image") || lowerCase.equals("/picture") || lowerCase.equals("/photo")) {
            return 4;
        }
        if (lowerCase.equals("/vid") || lowerCase.equals("/video")) {
            return 5;
        }
        if (lowerCase.equals("/audio") || lowerCase.equals("/music")) {
            return 1;
        }
        if (lowerCase.equals("/map") || lowerCase.equals("/location") || lowerCase.equals("/loc")) {
            return 2;
        }
        if (lowerCase.equals("/latex") || lowerCase.equals("/equation") || lowerCase.equals("/math")) {
            return 3;
        }
        if (lowerCase.equals("/toggle") || lowerCase.equals("/details")) {
            return 6;
        }
        return lowerCase.equals("/button") ? 7 : 0;
    }

    public static s5 r(String str, a aVar) {
        int iMax;
        int iMax2;
        char cCharAt;
        char cCharAt2;
        if (str == null || aVar == null) {
            return null;
        }
        String strTrim = str.trim();
        int i10 = 2;
        if (strTrim.length() == 3 && (((cCharAt2 = strTrim.charAt(0)) == '-' || cCharAt2 == '*' || cCharAt2 == '_') && strTrim.charAt(1) == cCharAt2 && strTrim.charAt(2) == cCharAt2)) {
            return new s5(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = strTrim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (cCharAt = lowerCase.charAt(2)) >= '1' && cCharAt <= '6') {
            return new s5(v(cCharAt - '0'), aVar.f47029c, aVar.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new s5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new s5(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new s5(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new s5(pageblockpullquote, 0, 0);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() <= 7) {
            iMax = 2;
        } else {
            String strTrim2 = lowerCase.substring(7).trim();
            int iIndexOf = strTrim2.indexOf(120);
            if (iIndexOf < 0) {
                iIndexOf = strTrim2.indexOf(88);
            }
            if (iIndexOf > 0) {
                try {
                    iMax2 = Math.max(1, Math.min(20, Integer.parseInt(strTrim2.substring(0, iIndexOf).trim())));
                    try {
                        iMax = Math.max(1, Math.min(20, Integer.parseInt(strTrim2.substring(iIndexOf + 1).trim())));
                        i10 = iMax2;
                    } catch (NumberFormatException unused) {
                        i10 = iMax2;
                        iMax = 2;
                    }
                } catch (NumberFormatException unused2) {
                    iMax2 = 2;
                }
            } else {
                iMax = 2;
            }
        }
        return new s5(u(i10, iMax), 0, 0);
    }

    public static s5 s(String str, a aVar) {
        int length;
        char cCharAt;
        if (aVar == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i10 = length - 1;
        if (str.charAt(i10) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        boolean z10 = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z11 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z10 || z11)) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (str.charAt(i12) != '#') {
                    return null;
                }
                i11++;
            }
            if (i11 < 1 || i11 > 6) {
                return null;
            }
            return new s5(v(i11), aVar.f47029c, aVar.d);
        }
        if (!z10) {
            return null;
        }
        if (aVar.f47029c == 0 && length == 2) {
            char cCharAt2 = str.charAt(0);
            if (cCharAt2 == '-' || cCharAt2 == '*' || cCharAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                f(pageblockparagraph, "");
                return new s5(pageblockparagraph, 1, 0);
            }
            if (cCharAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new s5(pageblockblockquote, 0, 0);
            }
        }
        if (aVar.f47029c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
            return t(false);
        }
        if (aVar.f47029c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
            char cCharAt3 = str.charAt(1);
            if (cCharAt3 == ' ') {
                return t(false);
            }
            if (cCharAt3 == 'x' || cCharAt3 == 'X') {
                return t(true);
            }
        }
        if (aVar.f47029c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((cCharAt = str.charAt(1)) == '.' || cCharAt == ')')) {
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            f(pageblockparagraph2, "");
            return new s5(pageblockparagraph2, 1, 1);
        }
        if (aVar.f47029c != 0 || length != 4) {
            return null;
        }
        char cCharAt4 = str.charAt(0);
        if ((cCharAt4 == '-' || cCharAt4 == '*' || cCharAt4 == '_') && str.charAt(1) == cCharAt4 && str.charAt(2) == cCharAt4) {
            return new s5(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (cCharAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new s5(new TL_iv.pageBlockPreformatted(), 0, 0);
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
                int iDp = AndroidUtilities.dp(24.0f);
                int iMax = Math.max(0, (d1Var.getWidth() - d1Var.getPaddingLeft()) - d1Var.getPaddingRight());
                float f10 = iDp;
                float fMax = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f10);
                float fMin = Math.min(iMax, layout.getLineRight(lineForVertical) + f10);
                float f11 = paddingLeft;
                if (f11 >= fMax && f11 <= fMin) {
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
        this.f47482f.r();
    }

    public final void C() {
        Runnable runnable = this.C;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.C = null;
        }
        a aVar = this.f47487x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                e2 e2Var = new e2(this, 1);
                this.C = e2Var;
                postDelayed(e2Var, 100L);
                return;
            }
        }
        this.E++;
        Editable text = this.f47482f.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.D = null;
    }

    public final void D(k0 k0Var) {
        if (this.f47488y == null || this.f47487x == null || k0Var == null) {
            return;
        }
        List<String> list = k0Var.f47231c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int iQ = q(str);
            if (iQ != 0) {
                ((y2) this.f47488y).c(this.f47487x, iQ);
                return;
            }
            s5 s5VarR = r(str, this.f47487x);
            if (s5VarR == null) {
                s5VarR = s(s3.c.l(str, " "), this.f47487x);
            }
            if (s5VarR != null) {
                ((y2) this.f47488y).d(this.f47487x, s5VarR.f47449a, s5VarR.f47450b, s5VarR.f47451c, s5VarR.d, s5VarR.f47452e);
                return;
            }
        }
    }

    public final void E(Editable editable) {
        a aVar = this.f47487x;
        if (aVar != null && p3.C3(aVar.f47028b) && com.google.android.recaptcha.internal.a.u(editable)) {
            d1 d1Var = this.f47482f;
            Paint.FontMetricsInt fontMetricsInt = d1Var.getPaint().getFontMetricsInt();
            int iMax = Math.max(1, Math.round((d1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.t5.class)) {
                t5Var.replaceFontMetrics(fontMetricsInt);
                t5Var.setSize(iMax);
            }
        }
    }

    public final void F() {
        q5 q5Var;
        a aVar = this.f47487x;
        if (aVar == null || aVar.f47029c <= 0 || (q5Var = this.f47488y) == null) {
            return;
        }
        int iB = ((y2) q5Var).b(aVar);
        int iA = ((y2) this.f47488y).a(this.f47487x);
        a aVar2 = this.f47487x;
        if (aVar2.f47038n) {
            int i10 = aVar2.f47036l;
            iB = i10 <= 0 ? 0 : AndroidUtilities.dp(i0.a.e(i10, 1, 16, 10));
        }
        a aVar3 = this.f47487x;
        if (aVar3.f47039o) {
            int i11 = aVar3.f47037m;
            iA = i11 <= 0 ? 0 : AndroidUtilities.dp(i0.a.e(i11, 1, 16, 10));
        }
        if (iB == getPaddingTop() && iA == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), iB, getPaddingRight(), iA);
    }

    public final void G() {
        a aVar = this.f47487x;
        d1 d1Var = this.f47482f;
        d1 d1Var2 = this.h;
        if (aVar != null && p(aVar.f47028b) && (d1Var.length() > 0 || d1Var2.length() > 0)) {
            if (d1Var2.getVisibility() != 0) {
                d1Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (d1Var2.getVisibility() != 8) {
            if (d1Var2.isFocused()) {
                d1Var.requestFocus();
            }
            d1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int length;
        Layout layout;
        int lineStart;
        d1 d1Var = this.f47482f;
        if (d1Var.getText() != null) {
            Editable text = d1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f47487x.f47028b).collapsed || (layout = d1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (length = text.length())) {
                length = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.M && length == this.N) {
                return;
            }
            this.O = true;
            try {
                fa0 fa0Var = this.L;
                if (fa0Var != null) {
                    text.removeSpan(fa0Var);
                }
                if (i10 >= 0) {
                    if (this.L == null) {
                        this.L = new fa0(2, this);
                    }
                    text.setSpan(this.L, i10, length, 33);
                }
                this.O = false;
                this.M = i10;
                this.N = length;
            } catch (Throwable th) {
                this.O = false;
                throw th;
            }
        }
    }

    public final void I(TL_iv.PageBlock pageBlock, boolean z10) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f47485s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f47485s;
        if (linearLayout2 != null && z10) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.f47485s = null;
        }
        LinearLayout linearLayout3 = this.f47485s;
        c6 c6Var = this.f47478a;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.f47485s = linearLayout4;
            linearLayout4.setOrientation(0);
            this.f47485s.setBackground(g6.Y(g6.v0(g6.f23144i6, c6Var), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.f47485s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.f47485s, z5.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.f47485s.addView(this.v, z5.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f47486w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.f47485s.addView(this.f47486w, z5.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.f47485s.setOnClickListener(new l5(this, 1));
            this.f47485s.setOnLongClickListener(new n5());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int iL1 = g6.l1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, g6.v0(g6.G6, c6Var));
        this.f47486w.setColorFilter(new PorterDuffColorFilter(iL1, PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(iL1);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.f47485s.setVisibility(0);
    }

    public final void J() {
        a aVar = this.f47487x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            d1 d1Var = this.f47482f;
            if (d1Var.length() > 0 && (d1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        this.d.setTypeface(z10 ? AndroidUtilities.bold() : null);
        a aVar2 = this.f47487x;
        if (aVar2 == null || aVar2.d <= 0) {
            return;
        }
        c(aVar2);
    }

    public final void c(a aVar) {
        int iB;
        int i10;
        a aVar2;
        int i11;
        int i12 = aVar.f47029c;
        aj0 aj0Var = this.f47481e;
        View view = this.f47480c;
        ag.e1 e1Var = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            e1Var.setVisibility(8);
            aj0Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i12 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i12 > 1 ? 0 : 8);
        if (aVar.f47030e) {
            e1Var.setVisibility(8);
            aj0Var.setVisibility(0);
            ((CheckBoxBase) aj0Var.f36554b).f(-1, aVar.f47031f, false);
            return;
        }
        aj0Var.setVisibility(8);
        e1Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) e1Var.getLayoutParams();
        if (aVar.d == 0) {
            iB = AndroidUtilities.dp(18.0f);
        } else {
            q5 q5Var = this.f47488y;
            if (q5Var != null) {
                TextPaint paint = e1Var.getPaint();
                ArrayList arrayList = ((y2) q5Var).f47605a.f47348h3;
                int iIndexOf = arrayList.indexOf(aVar);
                if (iIndexOf < 0 || (i10 = aVar.f47029c) <= 0 || aVar.d <= 0) {
                    iB = org.telegram.messenger.y1.b(10.0f, (int) Math.ceil(paint.measureText(a9.p.k(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                } else {
                    int i13 = iIndexOf;
                    while (i13 > 0) {
                        a aVar3 = (a) arrayList.get(i13 - 1);
                        int i14 = aVar3.f47029c;
                        if (i14 < i10 || (i14 == i10 && aVar3.d <= 0)) {
                            break;
                        } else {
                            i13--;
                        }
                    }
                    int i15 = iIndexOf + 1;
                    while (i15 < arrayList.size() && (i11 = (aVar2 = (a) arrayList.get(i15)).f47029c) >= i10 && (i11 != i10 || aVar2.d > 0)) {
                        i15++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float fMax = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.f47029c == i10 && aVar4.d > 0) {
                            fMax = Math.max(fMax, paint2.measureText(aVar4.d + "."));
                        }
                        i13++;
                    }
                    iB = org.telegram.messenger.y1.b(10.0f, (int) Math.ceil(fMax), AndroidUtilities.dp(28.0f));
                }
            } else {
                iB = org.telegram.messenger.y1.b(10.0f, (int) Math.ceil(e1Var.getPaint().measureText(aVar.d + ".")), AndroidUtilities.dp(28.0f));
            }
        }
        if (layoutParams2.width != iB) {
            layoutParams2.width = iB;
            e1Var.setLayoutParams(layoutParams2);
        }
        e1Var.setText(aVar.d == 0 ? "" : a9.p.k(aVar.d, ".", new StringBuilder()));
    }

    @Override
    public final void d() {
        this.f47482f.t();
        d1 d1Var = this.h;
        if (d1Var != null) {
            d1Var.t();
        }
        int i10 = g6.G6;
        c6 c6Var = this.f47478a;
        this.d.setTextColor(g6.v0(i10, c6Var));
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Oh, c6Var), PorterDuff.Mode.SRC_IN));
        }
        gl0 gl0Var = this.F;
        if (gl0Var != null) {
            z6.a(gl0Var, c6Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d1 d1Var;
        Canvas canvas2;
        float fMax;
        float fMax2;
        float fMax3;
        int i10;
        a aVar = this.f47487x;
        LinearLayout linearLayout = this.f47479b;
        Paint paint = this.Q;
        c6 c6Var = this.f47478a;
        d1 d1Var2 = this.f47482f;
        if (aVar == null || !(aVar.f47028b instanceof TL_iv.pageBlockPreformatted)) {
            d1Var = d1Var2;
            if (aVar == null || !(aVar.f47028b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.f47028b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.F == null) {
                        gl0 gl0Var = new gl0(this);
                        this.F = gl0Var;
                        gl0Var.a(null, null, null, this.f47478a, 1);
                        z6.a(this.F, c6Var);
                    }
                    if (this.G == null) {
                        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.G = drawableMutate;
                        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Oh, c6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = d1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        fMax = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            width = Math.min(width, layout.getLineLeft(i11) + d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft());
                            fMax = Math.max(fMax, layout.getLineRight(i11) + d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (d1Var.getHint() != null) {
                        float fMeasureText = d1Var.getPaint().measureText(d1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - fMeasureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        fMax = Math.max(0.0f, ((getWidth() + fMeasureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        fMax = 0.0f;
                    }
                    d1 d1Var3 = this.h;
                    if (d1Var3.getVisibility() == 0) {
                        Layout layout2 = d1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                width = Math.min(width, layout2.getLineLeft(i12) + d1Var3.getPaddingLeft() + d1Var3.getLeft());
                                fMax = Math.max(fMax, layout2.getLineRight(i12) + d1Var3.getPaddingLeft() + d1Var3.getLeft());
                            }
                        } else if (d1Var3.getHint() != null) {
                            float fMeasureText2 = d1Var3.getPaint().measureText(d1Var3.getHint().toString());
                            width = Math.min(width, ((getWidth() - fMeasureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                            fMax = Math.max(fMax, ((getWidth() + fMeasureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                        }
                    }
                    if (width < fMax) {
                        float fDp = width - AndroidUtilities.dp(30.0f);
                        float fDp2 = AndroidUtilities.dp(30.0f) + fMax;
                        float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                        int iDp = AndroidUtilities.dp(8.0f);
                        int height = getHeight() - AndroidUtilities.dp(8.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(fDp, iDp, fDp2, height);
                        this.F.b(canvas2, rectF, fFloor, fFloor, fFloor, 1.0f);
                        canvas2.save();
                        int i13 = (int) fDp;
                        this.G.setBounds(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(7.0f) + iDp, this.G.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i13, this.G.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + iDp);
                        canvas2.scale(-1.0f, -1.0f, this.G.getBounds().centerX(), this.G.getBounds().centerY());
                        this.G.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i14 = (int) fDp2;
                        this.G.setBounds((i14 - AndroidUtilities.dp(8.0f)) - this.G.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.G.getIntrinsicHeight(), i14 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.G.getBounds().centerX(), this.G.getBounds().centerY());
                        this.G.draw(canvas2);
                        canvas2.restore();
                    }
                }
            } else {
                if (this.F == null) {
                    gl0 gl0Var2 = new gl0(this);
                    this.F = gl0Var2;
                    gl0Var2.a(null, null, null, this.f47478a, 1);
                    z6.a(this.F, c6Var);
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float fFloor2 = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.F.b(canvas2, rectF2, fFloor2, fFloor2, fFloor2, 1.0f);
                this.F.e(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(g6.v0(g6.xk, c6Var));
            int iC = z6.c(this.f47487x);
            int iD = z6.d(this.f47487x);
            int width2 = getWidth();
            if (iC > 0 || iD > 0) {
                int iDp2 = AndroidUtilities.dp(16.0f) + iC;
                int iDp3 = AndroidUtilities.dp(16.0f) + iD;
                i10 = LocaleController.isRTL ? iDp3 : iDp2;
                int width3 = getWidth();
                if (!LocaleController.isRTL) {
                    iDp2 = iDp3;
                }
                width2 = width3 - iDp2;
            } else {
                i10 = 0;
            }
            float fDp3 = (i10 > 0 || width2 < getWidth()) ? AndroidUtilities.dp(8.0f) : 0;
            d1Var = d1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width2, getHeight() - AndroidUtilities.dp(7.0f), fDp3, fDp3, paint);
            canvas2 = canvas;
        }
        if (this.P) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = d1Var.getLayout();
            if (layout3 != null) {
                fMax2 = 0.0f;
                fMax3 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + d1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft());
                    fMax2 = Math.max(fMax2, layout3.getLineRight(i15) + d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft());
                    fMax3 = Math.max(height2, layout3.getLineBottom(i15) + d1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                fMax2 = 0.0f;
                fMax3 = 0.0f;
            }
            if (width4 < fMax2 && height2 < fMax3) {
                float fDp4 = height2 - AndroidUtilities.dp(2.0f);
                float fDp5 = width4 - AndroidUtilities.dp(4.0f);
                float fDp6 = fMax2 + AndroidUtilities.dp(4.0f);
                float fDp7 = fMax3 + AndroidUtilities.dp(2.0f);
                paint.setColor(g6.l1(0.05f, g6.v0(g6.G6, c6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(fDp5, fDp4, fDp6, fDp7, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        q5 q5Var = this.f47488y;
        j9 textSelectionHelper = q5Var != null ? ((y2) q5Var).f47605a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.f47484r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                u9 u9Var = (u9) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(u9Var.getX(), u9Var.getY());
                textSelectionHelper.a0(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (o()) {
            if (this.H == null) {
                this.H = new zh0(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f47487x.f47028b;
            int iV0 = g6.v0(g6.Oh, c6Var);
            int iDp4 = AndroidUtilities.dp(3.333f);
            this.H.a(canvas2, this.I, org.telegram.messenger.y1.B(16.0f, getWidth(), iDp4), org.telegram.messenger.y1.B(8.0f, getHeight(), iDp4), iV0, pageblockblockquote.collapsed, l());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.H != null) {
            boolean zContains = this.I.contains(motionEvent.getX(), motionEvent.getY());
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
                        this.H.b(zContains);
                        return true;
                    }
                } else if (this.J) {
                    this.J = false;
                    this.H.b(false);
                    if (zContains && o()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f47487x.f47028b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        q5 q5Var = this.f47488y;
                        if (q5Var != null) {
                            p3 p3Var = ((y2) q5Var).f47605a;
                            b2 b2Var = p3Var.F3;
                            if (b2Var != null) {
                                b2Var.g();
                            }
                            p3Var.f47340d3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (zContains) {
                this.J = true;
                this.H.b(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        d1 d1Var = this.f47482f;
        Layout layout2 = d1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f47479b;
            arrayList.add(new v4(layout2, d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft(), d1Var.getPaddingTop() + d1Var.getTop() + linearLayout.getTop(), 1));
        }
        d1 d1Var2 = this.h;
        if (d1Var2.getVisibility() != 0 || (layout = d1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new v4(layout, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop(), 2));
    }

    public final void g(a aVar, q5 q5Var, boolean z10) {
        float f10;
        float f11;
        a aVar2;
        int iC;
        int iD;
        boolean z11;
        int paddingTop;
        int paddingBottom;
        int i10;
        int i11;
        int iDp;
        int iDp2;
        TL_iv.PageBlock pageBlock;
        boolean zP;
        d1 d1Var;
        Spanned spannedA;
        float f12;
        this.f47487x = aVar;
        this.f47488y = q5Var;
        this.A = z10;
        this.N = -1;
        this.M = -1;
        TL_iv.PageBlock pageBlock2 = aVar.f47028b;
        d1 d1Var2 = this.f47482f;
        d1Var2.setBlock(pageBlock2);
        TL_iv.PageBlock pageBlock3 = aVar.f47028b;
        int i12 = SharedConfig.fontSize;
        d1Var2.setCenterEmptyHint(false);
        d1Var2.setHint(getHint());
        d1Var2.setTextColorKey(g6.G6);
        d1Var2.setLineSpacing(0.0f, 1.0f);
        if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
            f10 = 8.0f;
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(19.0f));
            d1Var2.setInputType(655505);
            d1Var2.setAllowNewlines(true);
            d1Var2.setSoftEnterNewline(false);
            d1Var2.setGravity(8388659);
            d1Var2.setTextSize(1, i12 - 1);
            d1Var2.setTypeface(Typeface.MONOSPACE);
            d1Var2.setLineSpacing(d1Var2.getPaint().getFontSpacing() * 0.3f, 1.0f);
            d1Var2.setAccentHint(false);
        } else {
            f10 = 8.0f;
            if (!(pageBlock3 instanceof TL_iv.pageBlockBlockquote)) {
                if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    d1Var2.setInputType(147457);
                    d1Var2.setAllowNewlines(false);
                    d1Var2.setSoftEnterNewline(true);
                    d1Var2.setGravity(49);
                    d1Var2.setCenterEmptyHint(true);
                    setPadding(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f));
                    d1Var2.setTextSize(1, Math.max(8, i12 - 2));
                    d1Var2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                    d1Var2.setAccentHint(true);
                } else {
                    d1Var2.setInputType(147457);
                    d1Var2.setAllowNewlines(false);
                    d1Var2.setSoftEnterNewline(false);
                    d1Var2.setGravity(8388659);
                    boolean z12 = pageBlock3 instanceof TL_iv.pageBlockHeading1;
                    boolean z13 = z12 || (pageBlock3 instanceof TL_iv.pageBlockHeading2) || (pageBlock3 instanceof TL_iv.pageBlockHeading3) || (pageBlock3 instanceof TL_iv.pageBlockHeading4) || (pageBlock3 instanceof TL_iv.pageBlockHeading5) || (pageBlock3 instanceof TL_iv.pageBlockHeading6);
                    f11 = 24.0f;
                    setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z13 ? 11.0f : 5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z13 ? 7.0f : 4.66f));
                    a aVar3 = this.f47487x;
                    if (aVar3 != null && aVar3.f47029c > 0) {
                        int iDp3 = AndroidUtilities.dp(16.0f);
                        q5 q5Var2 = this.f47488y;
                        int iB = q5Var2 != null ? ((y2) q5Var2).b(this.f47487x) : AndroidUtilities.dp(8.0f);
                        int iDp4 = AndroidUtilities.dp(16.0f);
                        q5 q5Var3 = this.f47488y;
                        setPadding(iDp3, iB, iDp4, q5Var3 != null ? ((y2) q5Var3).a(this.f47487x) : AndroidUtilities.dp(11.0f));
                    }
                    if (z12) {
                        d1Var2.setTextSize(1, i12 + 3);
                        d1Var2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                        d1Var2.setTextSize(1, i12 + 2);
                        d1Var2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                        d1Var2.setTextSize(1, i12 + 1);
                        d1Var2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                        d1Var2.setTextSize(1, i12);
                        d1Var2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                        d1Var2.setTextSize(1, i12 - 1);
                        d1Var2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                        d1Var2.setTextSize(1, i12 - 2);
                        d1Var2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                        d1Var2.setTextSize(1, i12 - 2);
                        d1Var2.setTypeface(null);
                        d1Var2.setTextColorKey(g6.Yc);
                    } else {
                        d1Var2.setTextSize(1, (!(pageBlock3 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.f47487x) == null || aVar2.f47035k.isEmpty()) ? i12 : Math.max(8, i12 - 2));
                        d1Var2.setTypeface(null);
                    }
                    d1Var2.setAccentHint(false);
                }
                iC = z6.c(aVar);
                iD = z6.d(aVar);
                if (iC <= 0 || iD > 0) {
                    z11 = aVar.f47028b instanceof TL_iv.pageBlockPreformatted;
                    paddingTop = getPaddingTop();
                    paddingBottom = getPaddingBottom();
                    if (aVar.f47038n) {
                        i11 = aVar.f47036l;
                        if (i11 <= 0) {
                            iDp = 0;
                        } else {
                            iDp = AndroidUtilities.dp(i0.a.e(i11, 1, 16, 10));
                        }
                        if (z11) {
                            iDp2 = AndroidUtilities.dp(f11);
                        } else {
                            iDp2 = 0;
                        }
                        paddingTop = iDp + iDp2;
                    }
                    if (aVar.f47039o) {
                        i10 = aVar.f47037m;
                        if (i10 <= 0) {
                            paddingBottom = 0;
                        } else {
                            paddingBottom = AndroidUtilities.dp(i0.a.e(i10, 1, 16, 10));
                        }
                    }
                    if (z11) {
                        iC += AndroidUtilities.dp(f10);
                        iD += AndroidUtilities.dp(f10);
                    }
                    if (LocaleController.isRTL) {
                        setPadding(getPaddingLeft() + iD, paddingTop, getPaddingRight() + iC, paddingBottom);
                    } else {
                        setPadding(getPaddingLeft() + iC, paddingTop, getPaddingRight() + iD, paddingBottom);
                    }
                }
                c(aVar);
                I(aVar.f47028b, false);
                if (!String.valueOf(d1Var2.getText()).equals(z(aVar.f47028b))) {
                    spannedA = A(aVar.f47028b);
                    if (p3.C3(aVar.f47028b)) {
                        SpannableString spannableString = new SpannableString(spannedA);
                        v5.o(spannableString, 0, spannableString.length(), 1, false, null);
                        v5.o(spannableString, 0, spannableString.length(), 2, false, null);
                        spannedA = spannableString;
                    }
                    Paint.FontMetricsInt fontMetricsInt = d1Var2.getPaint().getFontMetricsInt();
                    if (p3.C3(aVar.f47028b)) {
                        f12 = 0.85f;
                    } else {
                        f12 = 1.0f;
                    }
                    d1Var2.setTextSilently(Emoji.replaceEmoji((CharSequence) spannedA, fontMetricsInt, false, f12));
                    E(d1Var2.getText());
                    d1Var2.invalidateEffects();
                    this.D = null;
                }
                E(d1Var2.getText());
                J();
                pageBlock = aVar.f47028b;
                zP = p(pageBlock);
                d1Var = this.h;
                if (zP) {
                    j(pageBlock);
                    d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
                    d1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                    d1Var.setTextColorKey(g6.Oh);
                    d1Var.setAccentHint(true);
                    d1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
                    if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        d1Var.setGravity(49);
                    } else {
                        d1Var.setGravity(8388659);
                    }
                    if (!String.valueOf(d1Var.getText()).equals(v5.l(k(pageBlock)))) {
                        d1Var.setTextSilently(Emoji.replaceEmoji(v5.r(k(pageBlock), null, true), d1Var.getPaint().getFontMetricsInt(), false));
                        d1Var.invalidateEffects();
                    }
                    G();
                } else {
                    d1Var.setVisibility(8);
                }
                C();
            }
            d1Var2.setInputType(147457);
            d1Var2.setAllowNewlines(false);
            d1Var2.setSoftEnterNewline(false);
            d1Var2.setGravity(8388659);
            setPadding(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(16.0f));
            d1Var2.setTextSize(1, Math.max(8, i12 - 2));
            d1Var2.setTypeface(null);
            d1Var2.setAccentHint(true);
        }
        f11 = 24.0f;
        iC = z6.c(aVar);
        iD = z6.d(aVar);
        if (iC <= 0) {
            z11 = aVar.f47028b instanceof TL_iv.pageBlockPreformatted;
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            if (aVar.f47038n) {
                i11 = aVar.f47036l;
                if (i11 <= 0) {
                    iDp = 0;
                } else {
                    iDp = AndroidUtilities.dp(i0.a.e(i11, 1, 16, 10));
                }
                if (z11) {
                    iDp2 = AndroidUtilities.dp(f11);
                } else {
                    iDp2 = 0;
                }
                paddingTop = iDp + iDp2;
            }
            if (aVar.f47039o) {
                i10 = aVar.f47037m;
                if (i10 <= 0) {
                    paddingBottom = 0;
                } else {
                    paddingBottom = AndroidUtilities.dp(i0.a.e(i10, 1, 16, 10));
                }
            }
            if (z11) {
                iC += AndroidUtilities.dp(f10);
                iD += AndroidUtilities.dp(f10);
            }
            if (LocaleController.isRTL) {
                setPadding(getPaddingLeft() + iD, paddingTop, getPaddingRight() + iC, paddingBottom);
            } else {
                setPadding(getPaddingLeft() + iC, paddingTop, getPaddingRight() + iD, paddingBottom);
            }
        } else {
            z11 = aVar.f47028b instanceof TL_iv.pageBlockPreformatted;
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            if (aVar.f47038n) {
                i11 = aVar.f47036l;
                if (i11 <= 0) {
                    iDp = 0;
                } else {
                    iDp = AndroidUtilities.dp(i0.a.e(i11, 1, 16, 10));
                }
                if (z11) {
                    iDp2 = AndroidUtilities.dp(f11);
                } else {
                    iDp2 = 0;
                }
                paddingTop = iDp + iDp2;
            }
            if (aVar.f47039o) {
                i10 = aVar.f47037m;
                if (i10 <= 0) {
                    paddingBottom = 0;
                } else {
                    paddingBottom = AndroidUtilities.dp(i0.a.e(i10, 1, 16, 10));
                }
            }
            if (z11) {
                iC += AndroidUtilities.dp(f10);
                iD += AndroidUtilities.dp(f10);
            }
            if (LocaleController.isRTL) {
                setPadding(getPaddingLeft() + iD, paddingTop, getPaddingRight() + iC, paddingBottom);
            } else {
                setPadding(getPaddingLeft() + iC, paddingTop, getPaddingRight() + iD, paddingBottom);
            }
        }
        c(aVar);
        I(aVar.f47028b, false);
        if (!String.valueOf(d1Var2.getText()).equals(z(aVar.f47028b))) {
            spannedA = A(aVar.f47028b);
            if (p3.C3(aVar.f47028b)) {
                SpannableString spannableString2 = new SpannableString(spannedA);
                v5.o(spannableString2, 0, spannableString2.length(), 1, false, null);
                v5.o(spannableString2, 0, spannableString2.length(), 2, false, null);
                spannedA = spannableString2;
            }
            Paint.FontMetricsInt fontMetricsInt2 = d1Var2.getPaint().getFontMetricsInt();
            if (p3.C3(aVar.f47028b)) {
                f12 = 0.85f;
            } else {
                f12 = 1.0f;
            }
            d1Var2.setTextSilently(Emoji.replaceEmoji((CharSequence) spannedA, fontMetricsInt2, false, f12));
            E(d1Var2.getText());
            d1Var2.invalidateEffects();
            this.D = null;
        }
        E(d1Var2.getText());
        J();
        pageBlock = aVar.f47028b;
        zP = p(pageBlock);
        d1Var = this.h;
        if (zP) {
            d1Var.setVisibility(8);
        } else {
            j(pageBlock);
            d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
            d1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            d1Var.setTextColorKey(g6.Oh);
            d1Var.setAccentHint(true);
            d1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                d1Var.setGravity(49);
            } else {
                d1Var.setGravity(8388659);
            }
            if (!String.valueOf(d1Var.getText()).equals(v5.l(k(pageBlock)))) {
                d1Var.setTextSilently(Emoji.replaceEmoji(v5.r(k(pageBlock), null, true), d1Var.getPaint().getFontMetricsInt(), false));
                d1Var.invalidateEffects();
            }
            G();
        }
        C();
    }

    public d1 getAuthorEditText() {
        return this.h;
    }

    public int[] getColorKeys() {
        return null;
    }

    public d1 getEditText() {
        return this.f47482f;
    }

    public a getRow() {
        return this.f47487x;
    }

    public org.telegram.ui.ActionBar.u4 getStyleDelegate() {
        return this.f47482f;
    }

    public final int h(int i10, int i11) {
        Layout layout;
        if (l()) {
            d1 d1Var = this.h;
            if (d1Var.getVisibility() == 0 && (layout = d1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.H == null) {
                    this.H = new zh0(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f47479b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + d1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + d1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + d1Var.getPaddingTop() + measuredHeight;
                int iDp = AndroidUtilities.dp(3.333f);
                float fB = org.telegram.messenger.y1.B(16.0f, i10, iDp);
                zh0 zh0Var = this.H;
                zh0Var.getClass();
                float fD = fB - org.telegram.messenger.y1.D(3.333f, 2, AndroidUtilities.dp(23.66f) + zh0Var.f35242c);
                this.H.getClass();
                int iDp2 = AndroidUtilities.dp(17.66f);
                int i12 = i11 - iDp;
                float f10 = i12 - iDp2;
                float f11 = i12;
                boolean z10 = lineRight > fD;
                boolean z11 = lineBottom > f10 && lineTop < f11;
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + iDp2) + iDp) - i11));
                }
            }
        }
        return 0;
    }

    public final void i() {
        a aVar = this.f47487x;
        if (aVar != null) {
            j(aVar.f47028b);
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
        return o() && (layout = this.f47482f.getLayout()) != null && layout.getLineCount() > 3;
    }

    public final boolean n() {
        return this.h.getVisibility() == 0;
    }

    public final boolean o() {
        a aVar = this.f47487x;
        return aVar != null && (aVar.f47028b instanceof TL_iv.pageBlockBlockquote);
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
        LinearLayout linearLayout = this.f47479b;
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
        int iMax = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f47479b;
        linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        d1Var.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + d1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int iH = h(size, paddingBottom);
        this.K = iH;
        setMeasuredDimension(size, paddingBottom + iH);
    }

    public void setLocked(boolean z10) {
        this.f47482f.setLocked(z10);
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
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        zh0 zh0Var = this.H;
        if (zh0Var != null) {
            return drawable == zh0Var.f35241b || drawable == zh0Var.f35243e;
        }
        return false;
    }

    public final void w() {
        a aVar = this.f47487x;
        if (aVar == null || !p(aVar.f47028b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.f47487x.f47028b;
        TL_iv.RichText richTextF = v5.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = richTextF;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = richTextF;
        }
    }

    public final void x() {
        a aVar = this.f47487x;
        if (aVar != null) {
            e(aVar.f47028b, this.f47482f.getText());
        }
    }
}
