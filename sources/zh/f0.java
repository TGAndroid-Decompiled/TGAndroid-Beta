package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
public final class f0 extends FrameLayout implements v70 {
    public final TextView E;
    public final TextView F;
    public final uq[] G;
    public final uq[] H;
    public int I;
    public ValueAnimator J;
    public k0 K;
    public final Paint L;
    public boolean f48388a;
    public boolean f48389b;
    public final int f48390c;
    public final boolean d;
    public Drawable e;
    public float f48391f;
    public final ci.h h;
    public final LinearLayout f48392n;
    public final uh.o f48393r;
    public final uh.o f48394s;
    public CharSequence v;
    public final w9 f48395w;
    public final g9 f48396x;
    public final uh.o f48397y;

    public f0(int i10, Context context, boolean z10) {
        super(context);
        this.f48388a = false;
        this.f48389b = true;
        this.f48391f = 0.5f;
        this.G = new uq[1];
        this.H = new uq[1];
        this.L = new Paint(1);
        this.f48390c = i10;
        this.d = z10;
        ci.h hVar = new ci.h(this, context);
        this.h = hVar;
        hVar.setOrientation(0);
        addView(hVar, w7.a6.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f48396x = new g9((org.telegram.ui.ActionBar.f6) null);
        w9 w9Var = new w9(context);
        this.f48395w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        hVar.addView(w9Var, w7.a6.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        hVar.addView(linearLayout, w7.a6.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f48392n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.a6.n(-2, -2));
        uh.o oVar = new uh.o(context);
        this.f48393r = oVar;
        oVar.setTextColor(-1);
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(3);
        oVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(oVar, w7.a6.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        uh.o oVar2 = new uh.o(context);
        this.f48394s = oVar2;
        oVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.55f, -1));
        oVar2.setTextSize(1, 12.0f);
        oVar2.setGravity(5);
        linearLayout2.addView(oVar2, w7.a6.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        uh.o oVar3 = new uh.o(context);
        this.f48397y = oVar3;
        oVar3.setTextColor(-1);
        oVar3.setTextSize(1, 14.0f);
        oVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(oVar3);
        linearLayout.addView(oVar3, w7.a6.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        hVar.addView(textView, w7.a6.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        hVar.addView(textView2, w7.a6.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void b() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f48391f * 255.0f));
                this.h.invalidate();
            }
        }
        k0 k0Var = this.K;
        if (k0Var != null && this.e != null) {
            this.I = k0Var.f48575a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new qg.o(this, 18));
            this.J.addListener(new yg.b(this, 5));
            this.J.setDuration(350L);
            this.J.setInterpolator(wr.h);
            this.J.start();
        }
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        ci.h hVar = this.h;
        if (hVar.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(hVar.getX(), hVar.getY(), hVar.getX() + hVar.getWidth(), hVar.getY() + hVar.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(k0 k0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i10;
        CharSequence charSequence;
        int i11;
        boolean z11;
        float f7;
        this.K = k0Var;
        ci.h hVar = this.h;
        if ((k0Var == null || this.I != k0Var.f48575a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f48391f * 255.0f));
                hVar.invalidate();
            }
        }
        long j3 = k0Var.f48577c;
        w9 w9Var = this.f48395w;
        g9 g9Var = this.f48396x;
        int i12 = this.f48390c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(k0Var.f48577c));
            g9Var.r(user);
            w9Var.e(user, g9Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-k0Var.f48577c));
            g9Var.q(chat);
            w9Var.e(chat, g9Var);
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
        }
        int b10 = o.b(i12, (int) k0Var.f48579g, 3);
        int b11 = o.b(i12, (int) k0Var.f48579g, 4);
        int b12 = o.b(i12, (int) k0Var.f48579g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = k0Var.f48576b;
        boolean z13 = this.d;
        uh.o oVar = this.f48397y;
        if (z12 && k0Var.f48579g <= 0) {
            z10 = z13;
        } else {
            if (k0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + k0Var.h));
                z10 = z13;
                uq uqVar = new uq(0, new b0(getContext(), k0Var.h));
                uqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(uqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, oVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i10 = 33;
                spannableStringBuilder.setSpan(new d0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = o.b(i12, (int) k0Var.f48579g, 1);
        int b14 = o.b(i12, (int) k0Var.f48579g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = k0Var.f48578f;
        if (tL_textWithEntities == null) {
            charSequence = " ";
            this.v = "";
        } else {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, oVar.getPaint());
            this.v = formatTextWithEntities;
            CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
            this.v = superTrim;
            if (superTrim.length() > b13 && !k0Var.f48576b) {
                this.v = this.v.subSequence(0, b13);
            }
            CharSequence charSequence2 = this.v;
            if (!(charSequence2 instanceof Spannable)) {
                charSequence = " ";
            } else {
                Spannable spannable = (Spannable) charSequence2;
                org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.y5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (y5VarArr.length + emojiSpanArr.length <= b14 || k0Var.f48576b) {
                    charSequence = " ";
                } else {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i13 = 0;
                    while (i13 < y5VarArr.length) {
                        org.telegram.ui.Components.y5[] y5VarArr2 = y5VarArr;
                        int i14 = i13;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(y5VarArr2[i13])), Integer.valueOf(spannable.getSpanEnd(y5VarArr2[i14]))));
                        i13 = i14 + 1;
                        y5VarArr = y5VarArr2;
                    }
                    int i15 = 0;
                    while (i15 < emojiSpanArr.length) {
                        int i16 = i15;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i15])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i16]))));
                        i15 = i16 + 1;
                    }
                    Collections.sort(arrayList, new sg.p(24));
                    if (!(this.v instanceof SpannableStringBuilder)) {
                        this.v = new SpannableStringBuilder(this.v);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.v).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!k0Var.f48576b) {
                this.v = AndroidUtilities.replaceNewLines(this.v);
            }
            spannableStringBuilder.append(this.v);
        }
        oVar.setText(Emoji.replaceEmoji(spannableStringBuilder, oVar.getPaint().getFontMetricsInt(), false));
        this.e = null;
        if (k0Var.f48576b && k0Var.f48579g <= 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f48392n.setVisibility(i11);
        long j10 = k0Var.f48579g;
        TextView textView = this.F;
        TextView textView2 = this.E;
        if (j10 > 0) {
            if (j10 >= 250) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f48388a = z11;
            hVar.setWillNotDraw(!z11);
            hVar.invalidate();
            oVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i17 = org.telegram.ui.ActionBar.j6.f17865a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.e = gradientDrawable;
            hVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            if (!z10) {
                f7 = 0.65f;
            } else {
                f7 = 1.0f;
            }
            this.f48391f = f7;
            drawable2.setAlpha((int) (f7 * 255.0f));
            if (!k0Var.e) {
                textView.setVisibility(0);
                textView.setText(xh.z7.U0(false, hc.b.l(k0Var.f48579g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.l1(0.25f, b12)));
                textView2.setText(xh.z7.U0(false, hc.b.l(k0Var.f48579g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, AndroidUtilities.dp(0.66f), 1.0f));
                uq uqVar2 = this.G[0];
                if (uqVar2 != null) {
                    uqVar2.draw = this.f48389b;
                }
            }
        } else if (k0Var.f48576b) {
            this.f48388a = false;
            hVar.setWillNotDraw(true);
            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), -16777216);
            this.e = b02;
            hVar.setBackground(b02);
            Drawable drawable3 = this.e;
            this.f48391f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            oVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) DialogObject.getName(i12, k0Var.f48577c));
            spannableStringBuilder2.append(charSequence);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
            spannableStringBuilder2.setSpan(new c0(), length, spannableStringBuilder2.length(), 33);
            this.f48393r.setText(spannableStringBuilder2);
            this.f48394s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f48388a = false;
            hVar.setWillNotDraw(true);
            oVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
            this.e = null;
            hVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        hVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.f48389b = z10;
        uq uqVar = this.G[0];
        if (uqVar != null && uqVar.draw != z10) {
            uqVar.draw = z10;
            this.E.invalidate();
        }
    }
}
