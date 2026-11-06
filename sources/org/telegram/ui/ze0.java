package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ze0 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.b01 J;
    public final cf0 K;
    public int f52566a;
    public final LinearLayout f52567b;
    public final TextView f52568c;
    public final TextView d;
    public final LinearLayout f52569e;
    public final TextView f52570f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported f52571n;
    public int f52572r;
    public final Paint f52573s;
    public final Paint f52574w;
    public final RectF f52575x;
    public final ImageView f52576y;

    public ze0(cf0 cf0Var, Context context) {
        super(context);
        this.K = cf0Var;
        this.f52573s = new Paint(1);
        Paint paint = new Paint(1);
        this.f52574w = paint;
        this.f52575x = new RectF();
        this.E = 1.0f;
        this.J = new org.telegram.ui.Components.b01();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52567b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f52568c = textView;
        textView.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i7, null);
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, c8.ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f28240y6;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        linearLayout.addView(textView2, c8.ha.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.f52576y = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231244));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ii, null, PorterDuff.Mode.SRC_ATOP);
        imageView.setOnClickListener(new g40(this, 10));
        int i11 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        addView(imageView, c8.ha.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, this, null);
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f52569e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f52570f = textView3;
        textView3.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, i7, null);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, c8.ha.r(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
        textView4.setGravity(5);
        linearLayout2.addView(textView4, c8.ha.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f10, int i7) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f52571n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ik, false);
        }
        if (i7 == 3) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27981ka, false);
        }
        if (i7 == 1) {
            if (f10 > 0.5f) {
                return i0.a.f(1.0f - ((f10 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28034na, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28052oa, false));
            }
            return i0.a.f(1.0f - (f10 / 0.5f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28052oa, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27981ka, false));
        } else if (i7 == 2) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28052oa, false);
        } else {
            if (i7 == 4) {
                return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V8, false);
            }
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        }
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        this.I = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f52571n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.f52566a = -1;
            this.E = 1.0f;
        }
        this.f52571n = tL_chatInviteExported;
        this.f52572r = i7;
        if (tL_chatInviteExported == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.f52576y;
        LinearLayout linearLayout = this.f52569e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder a12 = bi.dd.a1(false, jg.g.m(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f52570f;
            textView.setText(a12);
            int i14 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i14 == 2592000) {
                textView2.setText(org.telegram.messenger.hd.M0(2131745057, null));
            } else if (i14 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i14 == 60) {
                textView2.setText("each minute");
            }
            L = org.telegram.messenger.g0.L(28.0f) + ((int) Math.max(fi.m3.h(textView.getText(), textView.getPaint()), fi.m3.h(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.f52567b.getLayoutParams()).rightMargin = L;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        cf0 cf0Var = this.K;
        TextView textView3 = this.f52568c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.i6.l(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i10 = ((org.telegram.ui.ActionBar.f2) cf0Var).currentAccount;
            sb2.append(org.telegram.messenger.qp.s1(i10).U2);
            sb2.append("/");
            sb2.append(tL_chatInviteExported.link.substring(14));
            textView3.setText(sb2.toString());
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/joinchat/")) {
            textView3.setText(tL_chatInviteExported.link.substring(22));
        } else if (tL_chatInviteExported.link.startsWith("https://")) {
            textView3.setText(tL_chatInviteExported.link.substring(8));
        } else {
            textView3.setText(tL_chatInviteExported.link);
        }
        int i15 = tL_chatInviteExported.usage;
        int i16 = 2131748186;
        if (i15 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            if (tL_chatInviteExported.subscription_pricing != null) {
                i13 = 2131748184;
            } else {
                i13 = 2131748186;
            }
            str = org.telegram.messenger.hd.M0(i13, null);
        } else {
            int i17 = tL_chatInviteExported.usage_limit;
            if (i17 > 0 && i15 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                str = org.telegram.messenger.hd.G(i17, "CanJoin", new Object[0]);
            } else if (i17 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                str = org.telegram.messenger.hd.G(tL_chatInviteExported.usage, "PeopleJoined", new Object[0]) + ", " + org.telegram.messenger.hd.G(tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, "PeopleJoinedRemaining", new Object[0]);
            } else {
                if (i15 > 0) {
                    str = org.telegram.messenger.hd.G(i15, "PeopleJoined", new Object[0]);
                } else {
                    str = "";
                }
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        str = rf.b.q(str, ", ");
                    }
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
                    m10.append(org.telegram.messenger.hd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                    str = m10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs();
            fsVar.f33623b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131747320, null));
        } else if (!tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.expire_date > 0) {
                org.telegram.ui.Components.fs fsVar2 = new org.telegram.ui.Components.fs();
                fsVar2.f33623b = org.telegram.messenger.g0.L(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((cf0Var.f44811n0 * 1000) + System.currentTimeMillis());
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                if (currentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.G((int) (currentTimeMillis / 86400000), "DaysLeft", new Object[0]));
                } else {
                    long j3 = currentTimeMillis / 1000;
                    int i18 = (int) (j3 % 60);
                    long j10 = j3 / 60;
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j10 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i18)));
                    this.I = true;
                }
            }
        } else {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i16 = 2131748184;
                }
                String M0 = org.telegram.messenger.hd.M0(i16, null);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) M0);
            }
            org.telegram.ui.Components.fs fsVar3 = new org.telegram.ui.Components.fs();
            fsVar3.f33623b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z9 = tL_chatInviteExported.revoked;
            if (!z9 && (i12 = tL_chatInviteExported.usage_limit) > 0 && tL_chatInviteExported.usage >= i12) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131748899, null));
            } else {
                if (z9) {
                    i11 = 2131746016;
                } else {
                    i11 = 2131750877;
                }
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(i11, null));
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.fs fsVar4 = new org.telegram.ui.Components.fs();
            fsVar4.f33623b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131754209, null));
        }
        this.d.setText(spannableStringBuilder2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        this.f52574w.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
