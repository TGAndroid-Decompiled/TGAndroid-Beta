package yh;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.zd0;
public final class h0 extends org.telegram.ui.ActionBar.f3 {
    public zf.a E;
    public int F;
    public final zd0 f52602b;
    public final EditTextBoldCursor f52603c;
    public final TextView d;
    public final org.telegram.ui.Components.r6 f52604e;
    public final ci.d f52605f;
    public final org.telegram.ui.Components.r6 h;
    public final x8 f52606n;
    public final ImageView f52607r;
    public final ImageView f52608s;
    public final zf.a v;
    public final zf.a f52609w;
    public final zf.a f52610x;
    public final zf.a f52611y;

    public h0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, zf.a aVar, org.telegram.ui.Wallet.z6 z6Var) {
        super(1, context, e6Var, true);
        boolean z10;
        float f7;
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        zf.b bVar = zf.b.f54444b;
        this.f52610x = zf.a.i(max, bVar);
        this.f52611y = zf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        zf.b bVar2 = zf.b.f54443a;
        this.v = zf.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), bVar2);
        this.f52609w = zf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e7 = bi.e(context, 0);
        linearLayout.addView(e7, w7.x5.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, false, false);
        this.f52604e = r6Var;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        r6Var.setTextSize(AndroidUtilities.dp(20.0f));
        r6Var.setGravity(8388627);
        r6Var.setTypeface(AndroidUtilities.bold());
        e7.addView(r6Var, w7.x5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.x5.l(1.0f, -1, -2));
        zd0 zd0Var = new zd0(context, null);
        this.f52602b = zd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f52603c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
        zd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        zd0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        zd0Var.b(1.0f, f7, false);
        zd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.x5(this, 6));
        zd0Var.addView(editTextBoldCursor, w7.x5.e(-1, -2, 48));
        linearLayout2.addView(zd0Var, w7.x5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f52607r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        zd0Var.addView(imageView, w7.x5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView2 = new ImageView(context);
        this.f52608s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        zd0Var.addView(imageView2, w7.x5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, false, false, false);
        this.h = r6Var2;
        int i12 = org.telegram.ui.ActionBar.i6.f21181y6;
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        r6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var2.setGravity(5);
        zd0Var.addView(r6Var2, w7.x5.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.x5.t(-1, -2, 55, 33, 4, 33, 0));
        x8 x8Var = new x8(context);
        this.f52606n = x8Var;
        x8Var.f23732c.setLayoutParams(w7.x5.a(20.0f, 22.0f, 22.0f, 22.0f, 0.0f, 20, (LocaleController.isRTL ? 5 : 3) | 48));
        x8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        x8Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 20));
        linearLayout2.addView(x8Var, w7.x5.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.x5.q(-1, -2, 80));
        ci.d f10 = bi.f(24, context, e6Var, true);
        this.f52605f = f10;
        f10.setOnClickListener(new xh.a(7, this, z6Var));
        f10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(f10, w7.x5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            p(zf.a.i(aVar.f54442b, aVar.f54441a), !aVar.k(), true, false);
        } else {
            p(zf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new g0(this));
    }

    public final zf.a o() {
        if (this.E.f54441a == zf.b.f54444b) {
            return this.f52611y;
        }
        return this.f52609w;
    }

    public final void p(zf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j3;
        boolean z13;
        boolean z14;
        boolean z15;
        zf.a aVar2;
        int i10;
        zf.a aVar3;
        boolean z16;
        float f7;
        float f10;
        double d;
        boolean z17;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        zf.a aVar4;
        zf.a aVar5 = this.E;
        int i11 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = zf.a.i(0L, aVar5.f54441a);
            this.F |= 1;
        }
        long j10 = o().f54442b;
        zf.a aVar6 = this.E;
        if (j10 < aVar6.f54442b) {
            this.F |= 4;
        }
        boolean k10 = aVar6.k();
        zf.a aVar7 = this.v;
        zf.a aVar8 = this.f52610x;
        zf.b bVar = zf.b.f54444b;
        if (!k10) {
            zf.a aVar9 = this.E;
            if (aVar9.f54441a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j3 = 0;
            if (aVar4.f54442b > aVar9.f54442b) {
                this.F |= 2;
            }
        } else {
            j3 = 0;
        }
        if (!z11 && aVar5.f54441a == this.E.f54441a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f54442b == this.E.f54442b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.F) {
            z15 = false;
        } else {
            z15 = true;
        }
        zd0 zd0Var = this.f52602b;
        if (z15) {
            if ((this.F & (-9)) == 0) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            zd0Var.a(f19);
        }
        zf.b bVar2 = zf.b.f54443a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.f52603c;
        if (z13) {
            zf.b bVar3 = this.E.f54441a;
            org.telegram.ui.Components.r6 r6Var = this.f52604e;
            if (bVar3 == bVar2) {
                r6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(o().a()).length())});
            } else if (bVar3 == bVar) {
                r6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(o().a()).length() + 3)});
            }
            dq dqVar = this.f52606n.f23732c;
            if (this.E.f54441a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            dqVar.a(z17, z12);
            ImageView imageView = this.f52608s;
            ImageView imageView2 = this.f52607r;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.E.f54441a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (this.E.f54441a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (this.E.f54441a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f15).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.E.f54441a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f16);
                if (this.E.f54441a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f17);
                if (this.E.f54441a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                scaleX2.scaleY(f18).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.E.f54441a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView2.setAlpha(f11);
                if (this.E.f54441a == bVar) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView.setAlpha(f12);
            }
        } else {
            aVar2 = aVar7;
        }
        if (z13 || z15) {
            int i12 = this.F;
            if ((i12 & 4) != 0) {
                zd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooMuch, o().f()));
            } else if ((i12 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                if (this.E.f54441a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                zd0Var.setText(LocaleController.formatString(i13, aVar3.f()));
            } else {
                if (this.E.f54441a == bVar2) {
                    i10 = R.string.ResellGiftPriceTitle;
                } else {
                    i10 = R.string.ResellGiftPriceTitleTON;
                }
                zd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            if (this.F == 0 && this.E.f54442b > j11) {
                z16 = true;
            } else {
                z16 = false;
            }
            ci.d dVar = this.f52605f;
            if (dVar.W != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    bi.s(animate3, f10, 180L);
                } else {
                    if (z16) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.6f;
                    }
                    dVar.setAlpha(f7);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            zf.a aVar10 = this.E;
            zf.b bVar4 = aVar10.f54441a;
            zf.b bVar5 = aVar10.f54441a;
            long j12 = aVar10.f54442b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) zf.a.i((j12 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                bi.r(R.string.ResellGiftInfoTON, new Object[]{zf.a.i((j12 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.E.f54441a == bVar) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.E.c() * d * 100.0d), "USD", 2));
            this.h.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.E.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new f0(this, 0), 50L);
    }
}
