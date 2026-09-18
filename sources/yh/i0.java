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
import org.telegram.messenger.wh;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.np;
import org.telegram.ui.nj0;
public final class i0 extends org.telegram.ui.ActionBar.f3 {
    public zf.a E;
    public int F;
    public final id0 f47495b;
    public final EditTextBoldCursor f47496c;
    public final TextView d;
    public final org.telegram.ui.Components.p6 e;
    public final ci.d f47497f;
    public final org.telegram.ui.Components.p6 h;
    public final x8 f47498n;
    public final ImageView f47499r;
    public final ImageView f47500s;
    public final zf.a v;
    public final zf.a f47501w;
    public final zf.a f47502x;
    public final zf.a f47503y;

    public i0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, zf.a aVar, nj0 nj0Var) {
        super(1, context, e6Var, true);
        boolean z10;
        float f7;
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        zf.b bVar = zf.b.f49209b;
        this.f47502x = zf.a.i(max, bVar);
        this.f47503y = zf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        zf.b bVar2 = zf.b.f49208a;
        this.v = zf.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), bVar2);
        this.f47501w = zf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = wh.e(context, 0);
        linearLayout.addView(e, w7.y5.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
        this.e = p6Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        p6Var.setTextSize(AndroidUtilities.dp(20.0f));
        p6Var.setGravity(8388627);
        p6Var.setTypeface(AndroidUtilities.bold());
        e.addView(p6Var, w7.y5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.y5.l(1.0f, -1, -2));
        id0 id0Var = new id0(context, null);
        this.f47495b = id0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f47496c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        id0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        id0Var.e(editTextBoldCursor);
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
        id0Var.b(1.0f, f7, false);
        id0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.v5(this, 6));
        id0Var.addView(editTextBoldCursor, w7.y5.e(-1, -2, 48));
        linearLayout2.addView(id0Var, w7.y5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f47499r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        id0Var.addView(imageView, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f47500s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        id0Var.addView(imageView2, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, false, false);
        this.h = p6Var2;
        int i12 = org.telegram.ui.ActionBar.j6.f19445y6;
        p6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setGravity(5);
        id0Var.addView(p6Var2, w7.y5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.y5.t(-1, -2, 55, 33, 4, 33, 0));
        x8 x8Var = new x8(context);
        this.f47498n = x8Var;
        x8Var.f21817c.setLayoutParams(w7.y5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        x8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        x8Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 20));
        linearLayout2.addView(x8Var, w7.y5.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.y5.q(-1, -2, 80));
        ci.d f10 = wh.f(24, context, e6Var, true);
        this.f47497f = f10;
        f10.setOnClickListener(new w(1, this, nj0Var));
        f10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(f10, w7.y5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(zf.a.i(aVar.f49207b, aVar.f49206a), !aVar.k(), true, false);
        } else {
            n(zf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new h0(this));
    }

    public final zf.a m() {
        if (this.E.f49206a == zf.b.f49209b) {
            return this.f47503y;
        }
        return this.f47501w;
    }

    public final void n(zf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j3;
        boolean z13;
        boolean z14;
        boolean z15;
        zf.a aVar2;
        char c10;
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
            this.E = zf.a.i(0L, aVar5.f49206a);
            this.F |= 1;
        }
        long j10 = m().f49207b;
        zf.a aVar6 = this.E;
        if (j10 < aVar6.f49207b) {
            this.F |= 4;
        }
        boolean k10 = aVar6.k();
        zf.a aVar7 = this.v;
        zf.a aVar8 = this.f47502x;
        zf.b bVar = zf.b.f49209b;
        if (!k10) {
            zf.a aVar9 = this.E;
            if (aVar9.f49206a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j3 = 0;
            if (aVar4.f49207b > aVar9.f49207b) {
                this.F |= 2;
            }
        } else {
            j3 = 0;
        }
        if (!z11 && aVar5.f49206a == this.E.f49206a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f49207b == this.E.f49207b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.F) {
            z15 = false;
        } else {
            z15 = true;
        }
        id0 id0Var = this.f47495b;
        if (z15) {
            if ((this.F & (-9)) == 0) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            id0Var.a(f19);
        }
        zf.b bVar2 = zf.b.f49208a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.f47496c;
        if (z13) {
            c10 = 0;
            zf.b bVar3 = this.E.f49206a;
            org.telegram.ui.Components.p6 p6Var = this.e;
            if (bVar3 == bVar2) {
                p6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                p6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            np npVar = this.f47498n.f21817c;
            if (this.E.f49206a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            npVar.a(z17, z12);
            ImageView imageView = this.f47500s;
            ImageView imageView2 = this.f47499r;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.E.f49206a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (this.E.f49206a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (this.E.f49206a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f15).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.E.f49206a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f16);
                if (this.E.f49206a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f17);
                if (this.E.f49206a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                scaleX2.scaleY(f18).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.E.f49206a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView2.setAlpha(f11);
                if (this.E.f49206a == bVar) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView.setAlpha(f12);
            }
        } else {
            aVar2 = aVar7;
            c10 = 0;
        }
        if (z13 || z15) {
            int i12 = this.F;
            if ((i12 & 4) != 0) {
                int i13 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = m().f();
                id0Var.setText(LocaleController.formatString(i13, objArr));
            } else if ((i12 & 2) != 0) {
                int i14 = R.string.ResellGiftPriceTooSmall;
                if (this.E.f49206a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f20 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c10] = f20;
                id0Var.setText(LocaleController.formatString(i14, objArr2));
            } else {
                if (this.E.f49206a == bVar2) {
                    i10 = R.string.ResellGiftPriceTitle;
                } else {
                    i10 = R.string.ResellGiftPriceTitleTON;
                }
                id0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            if (this.F == 0 && this.E.f49207b > j11) {
                z16 = true;
            } else {
                z16 = false;
            }
            ci.d dVar = this.f47497f;
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
                    wh.q(animate3, f10, 180L);
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
            zf.b bVar4 = aVar10.f49206a;
            zf.b bVar5 = aVar10.f49206a;
            long j12 = aVar10.f49207b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) zf.a.i((j12 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                wh.p(R.string.ResellGiftInfoTON, new Object[]{zf.a.i((j12 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.E.f49206a == bVar) {
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
        AndroidUtilities.runOnUIThread(new rg.w1(this, 25), 50L);
    }
}
