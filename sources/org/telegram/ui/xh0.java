package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xh0 extends FrameLayout {
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.l21 J;
    public final ai0 K;
    public int f39577a;
    public final LinearLayout f39578b;
    public final TextView f39579c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f39580f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported f39581n;
    public int f39582r;
    public final Paint f39583s;
    public final Paint v;
    public final RectF f39584w;
    public final ImageView f39585x;
    public int f39586y;

    public xh0(ai0 ai0Var, Context context) {
        super(context);
        this.K = ai0Var;
        this.f39583s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f39584w = new RectF();
        this.E = 1.0f;
        this.J = new org.telegram.ui.Components.l21();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39578b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39579c = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, w7.y5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f19477y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        linearLayout.addView(textView2, w7.y5.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.f39585x = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uh, false));
        imageView.setOnClickListener(new k60(this, 9));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184i6, false), 1, -1));
        addView(imageView, w7.y5.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f39580f = textView3;
        textView3.setTextSize(1, 16.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, w7.y5.q(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        com.google.android.gms.internal.vision.e2.p(i11, null, false, textView4, 5);
        linearLayout2.addView(textView4, w7.y5.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, w7.y5.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f7, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39581n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.uj, false);
        }
        if (i10 == 3) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19226ka, false);
        }
        if (i10 == 1) {
            if (f7 > 0.5f) {
                return i0.a.d(1.0f - ((f7 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19283na, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19299oa, false));
            }
            return i0.a.d(1.0f - (f7 / 0.5f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19299oa, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19226ka, false));
        } else if (i10 == 2) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19299oa, false);
        } else {
            if (i10 == 4) {
                return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V8, false);
            }
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        }
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        this.I = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f39581n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.f39577a = -1;
            this.E = 1.0f;
        }
        this.f39581n = tL_chatInviteExported;
        this.f39582r = i10;
        if (tL_chatInviteExported == null) {
            return;
        }
        int dp = AndroidUtilities.dp(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.f39585x;
        LinearLayout linearLayout = this.e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder X0 = yh.w7.X0(false, hg.k0.j(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f39580f;
            textView.setText(X0);
            int i16 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i16 == 2592000) {
                textView2.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
            } else if (i16 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i16 == 60) {
                textView2.setText("each minute");
            }
            dp = AndroidUtilities.dp(28.0f) + ((int) Math.max(ci.f4.g(textView.getText(), textView.getPaint()), ci.f4.g(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.f39578b.getLayoutParams()).rightMargin = dp;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        ai0 ai0Var = this.K;
        TextView textView3 = this.f39579c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i11 = ((org.telegram.ui.ActionBar.n2) ai0Var).currentAccount;
            sb2.append(MessagesController.getInstance(i11).linkPrefix);
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
        int i17 = tL_chatInviteExported.usage;
        if (i17 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            if (tL_chatInviteExported.subscription_pricing != null) {
                i15 = R.string.NoOneSubscribed;
            } else {
                i15 = R.string.NoOneJoined;
            }
            str = LocaleController.getString(i15);
        } else {
            int i18 = tL_chatInviteExported.usage_limit;
            if (i18 > 0 && i17 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                str = LocaleController.formatPluralString("CanJoin", i18, new Object[0]);
            } else if (i18 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                str = LocaleController.formatPluralString("PeopleJoined", tL_chatInviteExported.usage, new Object[0]) + ", " + LocaleController.formatPluralString("PeopleJoinedRemaining", tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, new Object[0]);
            } else {
                if (i17 > 0) {
                    str = LocaleController.formatPluralString("PeopleJoined", i17, new Object[0]);
                } else {
                    str = "";
                }
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        str = v7.j0.s(str, ", ");
                    }
                    StringBuilder u10 = a4.a.u(str);
                    u10.append(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                    str = u10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.bt btVar = new org.telegram.ui.Components.bt();
            btVar.f23048b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(btVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Permanent));
        } else if (!tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.expire_date > 0) {
                org.telegram.ui.Components.bt btVar2 = new org.telegram.ui.Components.bt();
                btVar2.f23048b = AndroidUtilities.dp(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(btVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((ai0Var.f32088n0 * 1000) + System.currentTimeMillis());
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                if (currentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (currentTimeMillis / 86400000), new Object[0]));
                } else {
                    long j3 = currentTimeMillis / 1000;
                    int i19 = (int) (j3 % 60);
                    long j10 = j3 / 60;
                    int i20 = (int) (j10 / 60);
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf(i20))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i19)));
                    this.I = true;
                }
            }
        } else {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i14 = R.string.NoOneSubscribed;
                } else {
                    i14 = R.string.NoOneJoined;
                }
                String string = LocaleController.getString(i14);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) string);
            }
            org.telegram.ui.Components.bt btVar3 = new org.telegram.ui.Components.bt();
            btVar3.f23048b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(btVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (!z10 && (i13 = tL_chatInviteExported.usage_limit) > 0 && tL_chatInviteExported.usage >= i13) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkLimitReached));
            } else {
                if (z10) {
                    i12 = R.string.Revoked;
                } else {
                    i12 = R.string.Expired;
                }
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(i12));
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.bt btVar4 = new org.telegram.ui.Components.bt();
            btVar4.f23048b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(btVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ApprovalRequired));
        }
        this.d.setText(spannableStringBuilder2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xh0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        this.v.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
