package qh;

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
import g7.e6;
import g7.v6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.yi0;
public final class s5 extends FrameLayout implements org.telegram.ui.ActionBar.w5, m9 {
    public static final int R = 0;
    public boolean A;
    public boolean B;
    public e2 C;
    public String D;
    public int E;
    public dl0 F;
    public Drawable G;
    public xh0 H;
    public final RectF I;
    public boolean J;
    public int K;
    public ba0 L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public final Paint Q;
    public final b6 f46700a;
    public final LinearLayout f46701b;
    public final View f46702c;
    public final bh.e d;
    public final yi0 f46703e;
    public final d1 f46704f;
    public final d1 h;
    public boolean f46705n;
    public final ArrayList f46706r;
    public LinearLayout f46707s;
    public TextView v;
    public ImageView f46708w;
    public a f46709x;
    public p5 f46710y;

    public s5(Context context, b6 b6Var) {
        super(context);
        this.f46706r = new ArrayList();
        this.I = new RectF();
        this.M = -1;
        this.N = -1;
        this.Q = new Paint(1);
        this.f46700a = b6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46701b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f46702c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        bh.e eVar = new bh.e(this, context);
        this.d = eVar;
        eVar.setGravity(8388627);
        eVar.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        eVar.setSingleLine(true);
        eVar.setIncludeFontPadding(false);
        eVar.setTextSize(1, 16.0f);
        linearLayout.addView(eVar, e6.n(18, -2));
        yi0 yi0Var = new yi0(context, b6Var);
        this.f46703e = yi0Var;
        yi0Var.setVisibility(8);
        yi0Var.setOnClickListener(new k5(this, 0));
        linearLayout.addView(yi0Var, e6.n(18, -2));
        d1 d1Var = new d1(context, b6Var);
        this.f46704f = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        d1Var.setListener(new n5(this));
        d1Var.setDelegate(new kt(this) {
            public final s5 f46516b;

            {
                this.f46516b = this;
            }

            @Override
            public final void m1() {
                switch (r2) {
                    case 0:
                        s5 s5Var = this.f46516b;
                        if (!s5Var.O && s5Var.f46709x != null) {
                            s5Var.J();
                            s5.e(s5Var.f46709x.f46269b, s5Var.f46704f.getText());
                            p5 p5Var = s5Var.f46710y;
                            if (p5Var != null) {
                                o3.O1(((x2) p5Var).f46827a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        s5 s5Var2 = this.f46516b;
                        if (s5Var2.f46709x != null) {
                            s5Var2.w();
                            p5 p5Var2 = s5Var2.f46710y;
                            if (p5Var2 != null) {
                                o3.O1(((x2) p5Var2).f46827a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        d1Var.setOnFocusChangeListener(new gh.j(this, 5));
        linearLayout.addView(d1Var, e6.l(1.0f, 0, -2));
        addView(linearLayout, e6.e(-1, -2, 51));
        d1 d1Var2 = new d1(context, b6Var);
        this.h = d1Var2;
        d1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var2.setAllowNewlines(false);
        d1Var2.setInputType(147457);
        d1Var2.setListener(new o5(this));
        d1Var2.setDelegate(new kt(this) {
            public final s5 f46516b;

            {
                this.f46516b = this;
            }

            @Override
            public final void m1() {
                switch (r2) {
                    case 0:
                        s5 s5Var = this.f46516b;
                        if (!s5Var.O && s5Var.f46709x != null) {
                            s5Var.J();
                            s5.e(s5Var.f46709x.f46269b, s5Var.f46704f.getText());
                            p5 p5Var = s5Var.f46710y;
                            if (p5Var != null) {
                                o3.O1(((x2) p5Var).f46827a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        s5 s5Var2 = this.f46516b;
                        if (s5Var2.f46709x != null) {
                            s5Var2.w();
                            p5 p5Var2 = s5Var2.f46710y;
                            if (p5Var2 != null) {
                                o3.O1(((x2) p5Var2).f46827a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        d1Var2.setVisibility(8);
        addView(d1Var2, e6.e(-1, -2, 51));
        d();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return u5.r(pageBlock.text, pageBlock, true);
    }

    public static void a(s5 s5Var, boolean z10) {
        p5 p5Var;
        s5Var.f46704f.setHint(s5Var.getHint());
        if (!z10 && (p5Var = s5Var.f46710y) != null) {
            ((x2) p5Var).f46827a.f46565d3.c2(s5Var, null);
        }
    }

    public static String b(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i9 = 0; i9 < str.length(); i9++) {
                    char charAt = str.charAt(i9);
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

    public static void e(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = u5.f(charSequence);
    }

    public static void f(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i9;
        a aVar = this.f46709x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f46269b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f46281p) {
                i9 = R.string.ArticleHintTitle;
            } else {
                i9 = R.string.ArticleHeading1;
            }
            return LocaleController.getString(i9);
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
            if (!aVar.f46282q) {
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

    public static boolean m(d1 d1Var, int i9, int i10, int i11, int i12) {
        if (d1Var.length() != 0 || i11 < i9 || i11 > d1Var.getWidth() + i9 || i12 < i10 || i12 > d1Var.getHeight() + i10) {
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

    public static r5 r(String str, a aVar) {
        int i9;
        int i10;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i11 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new r5(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new r5(v(charAt - '0'), aVar.f46270c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new r5(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new r5(pageblockpullquote, 0, 0);
                    } else if (lowerCase.equals("/table") || lowerCase.startsWith("/table ")) {
                        if (lowerCase.length() > 7) {
                            String trim2 = lowerCase.substring(7).trim();
                            int indexOf = trim2.indexOf(120);
                            if (indexOf < 0) {
                                indexOf = trim2.indexOf(88);
                            }
                            if (indexOf > 0) {
                                try {
                                    i10 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                                } catch (NumberFormatException unused) {
                                    i10 = 2;
                                }
                                try {
                                    i9 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                                    i11 = i10;
                                } catch (NumberFormatException unused2) {
                                    i11 = i10;
                                    i9 = 2;
                                    return new r5(u(i11, i9), 0, 0);
                                }
                                return new r5(u(i11, i9), 0, 0);
                            }
                        }
                        i9 = 2;
                        return new r5(u(i11, i9), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new r5(pageblockblockquote, 0, 0);
            }
            return new r5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static r5 s(String str, a aVar) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i9 = length - 1;
            if (str.charAt(i9) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f46269b;
                boolean z11 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (str.charAt(0) == '#' && (z11 || z10)) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < i9; i11++) {
                        if (str.charAt(i11) == '#') {
                            i10++;
                        } else {
                            return null;
                        }
                    }
                    if (i10 >= 1 && i10 <= 6) {
                        return new r5(v(i10), aVar.f46270c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f46270c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new r5(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            f(pageblockparagraph, "");
                            return new r5(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f46270c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f46270c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f46270c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        f(pageblockparagraph2, "");
                        return new r5(pageblockparagraph2, 1, 1);
                    } else if (aVar.f46270c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new r5(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new r5(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static r5 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f(pageblockparagraph, "");
        return new r5(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable u(int i9, int i10) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i11 = 0; i11 < i9; i11++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i12 = 0; i12 < i10; i12++) {
                pagetablerow.cells.add(w5.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i9) {
        switch (i9) {
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

    public static boolean y(d1 d1Var, int i9, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = d1Var.getLayout();
        if (layout != null && d1Var.length() != 0) {
            int paddingLeft = i11 - (d1Var.getPaddingLeft() + i9);
            int paddingTop = i12 - (d1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (d1Var.getWidth() - d1Var.getPaddingLeft()) - d1Var.getPaddingRight());
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
        return u5.l(pageBlock.text);
    }

    public final void B() {
        this.f46704f.r();
    }

    public final void C() {
        Runnable runnable = this.C;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.C = null;
        }
        a aVar = this.f46709x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                e2 e2Var = new e2(this, 1);
                this.C = e2Var;
                postDelayed(e2Var, 100L);
                return;
            }
        }
        this.E++;
        Editable text = this.f46704f.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.D = null;
    }

    public final void D(k0 k0Var) {
        if (this.f46710y != null && this.f46709x != null && k0Var != null) {
            List<String> list = k0Var.f46474c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q10 = q(str);
                    if (q10 != 0) {
                        ((x2) this.f46710y).c(this.f46709x, q10);
                        return;
                    }
                    r5 r10 = r(str, this.f46709x);
                    if (r10 == null) {
                        r10 = s(ta.b.j(str, " "), this.f46709x);
                        continue;
                    }
                    if (r10 != null) {
                        ((x2) this.f46710y).d(this.f46709x, r10.f46664a, r10.f46665b, r10.f46666c, r10.d, r10.f46667e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.t5[] t5VarArr;
        a aVar = this.f46709x;
        if (aVar != null && o3.C3(aVar.f46269b) && e2.c.v(editable)) {
            d1 d1Var = this.f46704f;
            Paint.FontMetricsInt fontMetricsInt = d1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((d1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.t5.class)) {
                t5Var.replaceFontMetrics(fontMetricsInt);
                t5Var.setSize(max);
            }
        }
    }

    public final void F() {
        p5 p5Var;
        a aVar = this.f46709x;
        if (aVar != null && aVar.f46270c > 0 && (p5Var = this.f46710y) != null) {
            int b10 = ((x2) p5Var).b(aVar);
            int a2 = ((x2) this.f46710y).a(this.f46709x);
            a aVar2 = this.f46709x;
            if (aVar2.f46279n) {
                int i9 = aVar2.f46277l;
                if (i9 <= 0) {
                    b10 = 0;
                } else {
                    b10 = AndroidUtilities.dp(e2.c.e(i9, 1, 16, 10));
                }
            }
            a aVar3 = this.f46709x;
            if (aVar3.f46280o) {
                int i10 = aVar3.f46278m;
                if (i10 <= 0) {
                    a2 = 0;
                } else {
                    a2 = AndroidUtilities.dp(e2.c.e(i10, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a2 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
            }
        }
    }

    public final void G() {
        a aVar = this.f46709x;
        d1 d1Var = this.f46704f;
        d1 d1Var2 = this.h;
        if (aVar != null && p(aVar.f46269b) && (d1Var.length() > 0 || d1Var2.length() > 0)) {
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
        int i9;
        Layout layout;
        int lineStart;
        d1 d1Var = this.f46704f;
        if (d1Var.getText() != null) {
            Editable text = d1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f46709x.f46269b).collapsed || (layout = d1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i9 = text.length())) {
                i9 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.M && i9 == this.N) {
                return;
            }
            this.O = true;
            try {
                ba0 ba0Var = this.L;
                if (ba0Var != null) {
                    text.removeSpan(ba0Var);
                }
                if (i10 >= 0) {
                    if (this.L == null) {
                        this.L = new ba0(2, this);
                    }
                    text.setSpan(this.L, i10, i9, 33);
                }
                this.O = false;
                this.M = i10;
                this.N = i9;
            } catch (Throwable th) {
                this.O = false;
                throw th;
            }
        }
    }

    public final void I(TL_iv.PageBlock pageBlock, boolean z10) {
        float f10;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f46707s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f46707s;
        if (linearLayout2 != null && z10) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.f46707s = null;
        }
        LinearLayout linearLayout3 = this.f46707s;
        b6 b6Var = this.f46700a;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.f46707s = linearLayout4;
            linearLayout4.setOrientation(0);
            this.f46707s.setBackground(f6.Y(f6.v0(f6.f23092i6, b6Var), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.f46707s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.f46707s, e6.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.f46707s.addView(this.v, e6.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f46708w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.f46707s.addView(this.f46708w, e6.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.f46707s.setOnClickListener(new k5(this, 1));
            this.f46707s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int v02 = f6.v0(f6.G6, b6Var);
        if (TextUtils.isEmpty(str)) {
            f10 = 0.5f;
        } else {
            f10 = 0.75f;
        }
        int l1 = f6.l1(f10, v02);
        this.f46708w.setColorFilter(new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(l1);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.f46707s.setVisibility(0);
    }

    public final void J() {
        Typeface typeface;
        a aVar = this.f46709x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            d1 d1Var = this.f46704f;
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
        a aVar2 = this.f46709x;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    public final void c(a aVar) {
        int i9;
        int z10;
        int i10;
        a aVar2;
        int i11;
        String l10;
        int i12 = aVar.f46270c;
        yi0 yi0Var = this.f46703e;
        View view = this.f46702c;
        bh.e eVar = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            eVar.setVisibility(8);
            yi0Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i12 - 1);
        view.setLayoutParams(layoutParams);
        if (i12 > 1) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view.setVisibility(i9);
        if (aVar.f46271e) {
            eVar.setVisibility(8);
            yi0Var.setVisibility(0);
            ((CheckBoxBase) yi0Var.f44884b).f(-1, aVar.f46272f, false);
            return;
        }
        yi0Var.setVisibility(8);
        eVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) eVar.getLayoutParams();
        if (aVar.d == 0) {
            z10 = AndroidUtilities.dp(18.0f);
        } else {
            p5 p5Var = this.f46710y;
            if (p5Var != null) {
                TextPaint paint = eVar.getPaint();
                ArrayList arrayList = ((x2) p5Var).f46827a.f46573h3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i10 = aVar.f46270c) > 0 && aVar.d > 0) {
                    int i13 = indexOf;
                    while (i13 > 0) {
                        a aVar3 = (a) arrayList.get(i13 - 1);
                        int i14 = aVar3.f46270c;
                        if (i14 < i10 || (i14 == i10 && aVar3.d <= 0)) {
                            break;
                        }
                        i13--;
                    }
                    int i15 = indexOf + 1;
                    while (i15 < arrayList.size() && (i11 = (aVar2 = (a) arrayList.get(i15)).f46270c) >= i10 && (i11 != i10 || aVar2.d > 0)) {
                        i15++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f10 = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.f46270c == i10 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i13++;
                    }
                    z10 = org.telegram.messenger.l0.z(10.0f, (int) Math.ceil(f10), AndroidUtilities.dp(28.0f));
                } else {
                    z10 = org.telegram.messenger.l0.z(10.0f, (int) Math.ceil(paint.measureText(aa.d.l(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = eVar.getPaint();
                z10 = org.telegram.messenger.l0.z(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != z10) {
            layoutParams2.width = z10;
            eVar.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            l10 = "";
        } else {
            l10 = aa.d.l(aVar.d, ".", new StringBuilder());
        }
        eVar.setText(l10);
    }

    @Override
    public final void d() {
        this.f46704f.t();
        d1 d1Var = this.h;
        if (d1Var != null) {
            d1Var.t();
        }
        int i9 = f6.G6;
        b6 b6Var = this.f46700a;
        this.d.setTextColor(f6.v0(i9, b6Var));
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.Oh, b6Var), PorterDuff.Mode.SRC_IN));
        }
        dl0 dl0Var = this.F;
        if (dl0Var != null) {
            v6.a(dl0Var, b6Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d1 d1Var;
        Canvas canvas2;
        float f10;
        n9 n9Var;
        int dp;
        float f11;
        float f12;
        int i9;
        int dp2;
        a aVar = this.f46709x;
        LinearLayout linearLayout = this.f46701b;
        Paint paint = this.Q;
        b6 b6Var = this.f46700a;
        d1 d1Var2 = this.f46704f;
        if (aVar != null && (aVar.f46269b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(f6.v0(f6.xk, b6Var));
            int c10 = v6.c(this.f46709x);
            int d = v6.d(this.f46709x);
            int width = getWidth();
            if (c10 <= 0 && d <= 0) {
                i9 = 0;
            } else {
                int dp3 = AndroidUtilities.dp(16.0f) + c10;
                int dp4 = AndroidUtilities.dp(16.0f) + d;
                if (LocaleController.isRTL) {
                    i9 = dp4;
                } else {
                    i9 = dp3;
                }
                int width2 = getWidth();
                if (!LocaleController.isRTL) {
                    dp3 = dp4;
                }
                width = width2 - dp3;
            }
            if (i9 <= 0 && width >= getWidth()) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(8.0f);
            }
            float f13 = dp2;
            d1Var = d1Var2;
            canvas.drawRoundRect(i9, AndroidUtilities.dp(7.0f), width, getHeight() - AndroidUtilities.dp(7.0f), f13, f13, paint);
            canvas2 = canvas;
        } else {
            d1Var = d1Var2;
            if (aVar != null && (aVar.f46269b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.F == null) {
                    dl0 dl0Var = new dl0(this);
                    this.F = dl0Var;
                    dl0Var.a(null, null, null, this.f46700a, 1);
                    v6.a(this.F, b6Var);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.F.b(canvas2, rectF, floor, floor, floor, 1.0f);
                this.F.e(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f46269b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.F == null) {
                        dl0 dl0Var2 = new dl0(this);
                        this.F = dl0Var2;
                        dl0Var2.a(null, null, null, this.f46700a, 1);
                        v6.a(this.F, b6Var);
                    }
                    if (this.G == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.G = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.Oh, b6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = d1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            int left = d1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i10) + d1Var.getPaddingLeft() + left);
                            int left2 = d1Var.getLeft() + linearLayout.getLeft();
                            f10 = Math.max(f10, layout.getLineRight(i10) + d1Var.getPaddingLeft() + left2);
                        }
                    } else if (d1Var.getHint() != null) {
                        float measureText = d1Var.getPaint().measureText(d1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    d1 d1Var3 = this.h;
                    if (d1Var3.getVisibility() == 0) {
                        Layout layout2 = d1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                int left3 = d1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i11) + d1Var3.getPaddingLeft() + left3);
                                int left4 = d1Var3.getLeft();
                                f10 = Math.max(f10, layout2.getLineRight(i11) + d1Var3.getPaddingLeft() + left4);
                            }
                        } else if (d1Var3.getHint() != null) {
                            float measureText2 = d1Var3.getPaint().measureText(d1Var3.getHint().toString());
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
                        this.F.b(canvas2, rectF2, floor2, floor2, floor2, 1.0f);
                        canvas2.save();
                        int i12 = (int) dp5;
                        this.G.setBounds(AndroidUtilities.dp(8.0f) + i12, AndroidUtilities.dp(7.0f) + dp7, this.G.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i12, this.G.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + dp7);
                        canvas2.scale(-1.0f, -1.0f, this.G.getBounds().centerX(), this.G.getBounds().centerY());
                        this.G.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i13 = (int) dp6;
                        this.G.setBounds((i13 - AndroidUtilities.dp(8.0f)) - this.G.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.G.getIntrinsicHeight(), i13 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
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
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + d1Var.getPaddingTop() + getPaddingTop());
                    int left5 = d1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + d1Var.getPaddingLeft() + left5);
                    int left6 = d1Var.getLeft() + linearLayout.getLeft();
                    f11 = Math.max(f11, layout3.getLineRight(i14) + d1Var.getPaddingLeft() + left6);
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + d1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                paint.setColor(f6.l1(0.05f, f6.v0(f6.G6, b6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(width4 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(2.0f), f11 + AndroidUtilities.dp(4.0f), f12 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        p5 p5Var = this.f46710y;
        if (p5Var != null) {
            n9Var = ((x2) p5Var).f46827a.getTextSelectionHelper();
        } else {
            n9Var = null;
        }
        if (n9Var != null) {
            ArrayList arrayList = this.f46706r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                y9 y9Var = (y9) arrayList.get(i15);
                canvas2.save();
                canvas2.translate(y9Var.getX(), y9Var.getY());
                n9Var.a0(canvas2, this, i15);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (!o()) {
            return;
        }
        if (this.H == null) {
            this.H = new xh0(this);
        }
        int v02 = f6.v0(f6.Oh, b6Var);
        float B = org.telegram.messenger.l0.B(8.0f, getHeight(), AndroidUtilities.dp(3.333f));
        this.H.a(canvas2, this.I, org.telegram.messenger.l0.B(16.0f, getWidth(), dp), B, v02, ((TL_iv.pageBlockBlockquote) this.f46709x.f46269b).collapsed, l());
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
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f46709x.f46269b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        p5 p5Var = this.f46710y;
                        if (p5Var != null) {
                            o3 o3Var = ((x2) p5Var).f46827a;
                            b2 b2Var = o3Var.F3;
                            if (b2Var != null) {
                                b2Var.g();
                            }
                            o3Var.f46565d3.onContentChanged();
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
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        d1 d1Var = this.f46704f;
        Layout layout2 = d1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f46701b;
            arrayList.add(new u4(layout2, d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft(), d1Var.getPaddingTop() + d1Var.getTop() + linearLayout.getTop(), 1));
        }
        d1 d1Var2 = this.h;
        if (d1Var2.getVisibility() == 0 && (layout = d1Var2.getLayout()) != null) {
            arrayList.add(new u4(layout, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop(), 2));
        }
    }

    public final void g(qh.a r25, qh.p5 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: qh.s5.g(qh.a, qh.p5, boolean):void");
    }

    public d1 getAuthorEditText() {
        return this.h;
    }

    public int[] getColorKeys() {
        return null;
    }

    public d1 getEditText() {
        return this.f46704f;
    }

    public a getRow() {
        return this.f46709x;
    }

    public org.telegram.ui.ActionBar.u4 getStyleDelegate() {
        return this.f46704f;
    }

    public final int h(int i9, int i10) {
        Layout layout;
        xh0 xh0Var;
        int dp;
        boolean z10;
        if (l()) {
            d1 d1Var = this.h;
            if (d1Var.getVisibility() == 0 && (layout = d1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.H == null) {
                    this.H = new xh0(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f46701b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + d1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + d1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + d1Var.getPaddingTop() + measuredHeight;
                int dp2 = AndroidUtilities.dp(3.333f);
                this.H.getClass();
                float B = org.telegram.messenger.l0.B(16.0f, i9, dp2) - org.telegram.messenger.l0.D(3.333f, 2, AndroidUtilities.dp(23.66f) + xh0Var.f34677c);
                this.H.getClass();
                int i11 = i10 - dp2;
                float dp3 = i11 - AndroidUtilities.dp(17.66f);
                float f10 = i11;
                if (lineRight > B) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = (lineBottom <= dp3 || lineTop >= f10) ? false : false;
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + dp) + dp2) - i10));
                }
            }
        }
        return 0;
    }

    public final void i() {
        a aVar = this.f46709x;
        if (aVar != null) {
            j(aVar.f46269b);
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
        if (!o() || (layout = this.f46704f.getLayout()) == null || layout.getLineCount() <= 3) {
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
        a aVar = this.f46709x;
        if (aVar != null && (aVar.f46269b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        H();
        d1 d1Var = this.h;
        if (d1Var.getVisibility() == 8) {
            super.onLayout(z10, i9, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f46701b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        d1Var.layout(paddingLeft, measuredHeight, d1Var.getMeasuredWidth() + paddingLeft, d1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i9);
        d1 d1Var = this.h;
        if (d1Var.getVisibility() == 8) {
            this.K = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f46701b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        d1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + d1Var.getMeasuredHeight() + measuredHeight;
        int h = h(size, paddingBottom);
        this.K = h;
        setMeasuredDimension(size, paddingBottom + h);
    }

    public void setLocked(boolean z10) {
        this.f46704f.setLocked(z10);
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
            xh0 xh0Var = this.H;
            if (xh0Var != null) {
                if (drawable != xh0Var.f34676b && drawable != xh0Var.f34678e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f46709x;
        if (aVar != null && p(aVar.f46269b)) {
            TL_iv.PageBlock pageBlock = this.f46709x.f46269b;
            TL_iv.RichText f10 = u5.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
            }
        }
    }

    public final void x() {
        a aVar = this.f46709x;
        if (aVar != null) {
            e(aVar.f46269b, this.f46704f.getText());
        }
    }
}
