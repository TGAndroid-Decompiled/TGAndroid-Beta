package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public TextView f49278a;
    public TextView f49279b;
    public TextView f49280c;
    public k0 d;
    public LinearLayout f49281e;
    public LinearLayout f49282f;
    public int h;
    public AnimatorSet f49283n;
    public String f49284r;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(2131231240);
        char c11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751132, null));
        this.actionBar.setActionBarMenuOnItemClick(new wx(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, frameLayout, null);
        this.fragmentView.setOnTouchListener(new ei.b(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49282f = linearLayout;
        linearLayout.setOrientation(1);
        this.f49282f.setWeightSum(100.0f);
        frameLayout.addView(this.f49282f, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f49282f.addView(frameLayout2, c8.ha.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, c8.ha.c(-1.0f, -1));
        k0 k0Var = new k0(10, context, this);
        this.d = k0Var;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, k0Var, null);
        this.f49282f.addView(this.d, c8.ha.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f49281e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f49281e.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.d.addView(this.f49281e, c8.ha.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f49279b = textView;
        int i7 = org.telegram.ui.ActionBar.l6.B6;
        org.telegram.ui.ActionBar.s6.U(textView, i7, null);
        this.f49279b.setGravity(17);
        this.f49279b.setTypeface(Typeface.MONOSPACE);
        this.f49279b.setTextSize(1, 16.0f);
        this.f49281e.addView(this.f49279b, c8.ha.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f49278a = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, i7, null);
        org.telegram.ui.ActionBar.s6.G(this.f49278a, org.telegram.ui.ActionBar.l6.J6, null);
        this.f49278a.setTextSize(1, 16.0f);
        this.f49278a.setLinksClickable(true);
        this.f49278a.setClickable(true);
        this.f49278a.setGravity(17);
        this.f49278a.setMovementMethod(new org.telegram.messenger.c0(2));
        this.f49281e.addView(this.f49278a, c8.ha.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f49280c = textView3;
        org.telegram.ui.ActionBar.s6.U(textView3, i7, null);
        this.f49280c.setGravity(17);
        this.f49280c.setTextSize(1, 32.0f);
        this.d.addView(this.f49280c, c8.ha.c(-2.0f, -2));
        TLRPC.EncryptedChat a12 = org.telegram.messenger.qp.s1(this.currentAccount).a1(Integer.valueOf(this.h));
        if (a12 != null) {
            org.telegram.ui.Components.e30 e30Var = new org.telegram.ui.Components.e30();
            imageView.setImageDrawable(e30Var);
            byte[] bArr = a12.key_hash;
            e30Var.f33274a = bArr;
            if (bArr == null) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(Utilities.n(a12.auth_key), 0, bArr2, 0, 16);
                e30Var.f33274a = bArr2;
                a12.key_hash = bArr2;
            }
            e30Var.invalidateSelf();
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(a12.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr3 = a12.key_hash;
            if (bArr3.length > 16) {
                String f10 = Utilities.f(bArr3);
                int i10 = 0;
                while (i10 < 32) {
                    if (i10 != 0) {
                        if (i10 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i10 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i11 = i10 * 2;
                    spannableStringBuilder.append((CharSequence) f10.substring(i11, i11 + 2));
                    spannableStringBuilder.append(' ');
                    i10++;
                    c11 = c11;
                }
                c10 = c11;
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i12 = 0; i12 < 5; i12++) {
                    byte[] bArr4 = a12.key_hash;
                    int i13 = i12 * 4;
                    int i14 = (bArr4[i13 + 19] & 255) | ((bArr4[i13 + 16] & Byte.MAX_VALUE) << 24) | ((bArr4[i13 + 17] & 255) << 16) | ((bArr4[i13 + 18] & 255) << 8);
                    if (i12 != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(org.telegram.messenger.j6.f23503c[i14 % 333]);
                }
                this.f49284r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f49279b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            String str = a22.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("EncryptionKeyDescription", null, 2131751131, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.e41(org.telegram.messenger.id.M0(2131751130, null), null), indexOf, indexOf + 12, 33);
            }
            this.f49278a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f49283n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f49283n = null;
        }
        this.f49280c.setAlpha(0.0f);
        this.f49279b.setAlpha(1.0f);
        this.f49280c.setScaleX(0.0f);
        this.f49280c.setScaleY(0.0f);
        this.f49279b.setScaleX(1.0f);
        this.f49279b.setScaleY(1.0f);
        this.f49280c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.l6.Bf));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        if (i7 == org.telegram.messenger.qs.f25018i4 && (textView = this.f49280c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new e7(this, 2));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new e7(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        String str;
        if (z9 && !z10 && (str = this.f49284r) != null) {
            TextView textView = this.f49280c;
            textView.setText(org.telegram.messenger.i6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }
}
