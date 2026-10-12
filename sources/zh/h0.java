package zh;

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
import org.telegram.messenger.yh;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.yd0;
public final class h0 extends org.telegram.ui.ActionBar.e3 {
    public ag.a E;
    public int F;
    public final yd0 f50595b;
    public final EditTextBoldCursor f50596c;
    public final TextView d;
    public final org.telegram.ui.Components.s6 e;
    public final di.d f50597f;
    public final org.telegram.ui.Components.s6 h;
    public final x8 f50598n;
    public final ImageView f50599r;
    public final ImageView f50600s;
    public final ag.a v;
    public final ag.a f50601w;
    public final ag.a f50602x;
    public final ag.a f50603y;

    public h0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, ag.a aVar, org.telegram.ui.Wallet.y6 y6Var) {
        super(1, context, c6Var, true);
        boolean z10;
        float f7;
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        ag.b bVar = ag.b.f630b;
        this.f50602x = ag.a.i(max, bVar);
        this.f50603y = ag.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        ag.b bVar2 = ag.b.f629a;
        this.v = ag.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), bVar2);
        this.f50601w = ag.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = yh.e(context, 0);
        linearLayout.addView(e, w7.a6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.e = s6Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        s6Var.setTextSize(AndroidUtilities.dp(20.0f));
        s6Var.setGravity(8388627);
        s6Var.setTypeface(AndroidUtilities.bold());
        e.addView(s6Var, w7.a6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.a6.l(1.0f, -1, -2));
        yd0 yd0Var = new yd0(context, null);
        this.f50595b = yd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f50596c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
        yd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        yd0Var.e(editTextBoldCursor);
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
        yd0Var.b(1.0f, f7, false);
        yd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 7));
        yd0Var.addView(editTextBoldCursor, w7.a6.e(-1, -2, 48));
        linearLayout2.addView(yd0Var, w7.a6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f50599r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        yd0Var.addView(imageView, w7.a6.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView2 = new ImageView(context);
        this.f50600s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        yd0Var.addView(imageView2, w7.a6.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.h = s6Var2;
        int i12 = org.telegram.ui.ActionBar.g6.f20288y6;
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setGravity(5);
        yd0Var.addView(s6Var2, w7.a6.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.a6.t(-1, -2, 55, 33, 4, 33, 0));
        x8 x8Var = new x8(context);
        this.f50598n = x8Var;
        x8Var.f22747c.setLayoutParams(w7.a6.a(20.0f, 22.0f, 22.0f, 22.0f, 0.0f, 20, (LocaleController.isRTL ? 5 : 3) | 48));
        x8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        x8Var.setOnClickListener(new ji.o4(this, 21));
        linearLayout2.addView(x8Var, w7.a6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.a6.q(-1, -2, 80));
        di.d f10 = yh.f(24, context, c6Var, true);
        this.f50597f = f10;
        f10.setOnClickListener(new yh.a(7, this, y6Var));
        f10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(f10, w7.a6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            o(ag.a.i(aVar.f628b, aVar.f627a), !aVar.k(), true, false);
        } else {
            o(ag.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new g0(this));
    }

    public final ag.a n() {
        if (this.E.f627a == ag.b.f630b) {
            return this.f50603y;
        }
        return this.f50601w;
    }

    public final void o(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        ag.a aVar2;
        int i10;
        ag.a aVar3;
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
        ag.a aVar4;
        ag.a aVar5 = this.E;
        int i11 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = ag.a.i(0L, aVar5.f627a);
            this.F |= 1;
        }
        long j11 = n().f628b;
        ag.a aVar6 = this.E;
        if (j11 < aVar6.f628b) {
            this.F |= 4;
        }
        boolean k10 = aVar6.k();
        ag.a aVar7 = this.v;
        ag.a aVar8 = this.f50602x;
        ag.b bVar = ag.b.f630b;
        if (!k10) {
            ag.a aVar9 = this.E;
            if (aVar9.f627a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f628b > aVar9.f628b) {
                this.F |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z11 && aVar5.f627a == this.E.f627a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f628b == this.E.f628b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.F) {
            z15 = false;
        } else {
            z15 = true;
        }
        yd0 yd0Var = this.f50595b;
        if (z15) {
            if ((this.F & (-9)) == 0) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            yd0Var.a(f19);
        }
        ag.b bVar2 = ag.b.f629a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f50596c;
        if (z13) {
            ag.b bVar3 = this.E.f627a;
            org.telegram.ui.Components.s6 s6Var = this.e;
            if (bVar3 == bVar2) {
                s6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(n().a()).length())});
            } else if (bVar3 == bVar) {
                s6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(n().a()).length() + 3)});
            }
            aq aqVar = this.f50598n.f22747c;
            if (this.E.f627a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            aqVar.a(z17, z12);
            ImageView imageView = this.f50600s;
            ImageView imageView2 = this.f50599r;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.E.f627a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (this.E.f627a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (this.E.f627a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f15).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.E.f627a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f16);
                if (this.E.f627a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f17);
                if (this.E.f627a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                scaleX2.scaleY(f18).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.E.f627a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView2.setAlpha(f11);
                if (this.E.f627a == bVar) {
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
                yd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooMuch, n().f()));
            } else if ((i12 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                if (this.E.f627a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                yd0Var.setText(LocaleController.formatString(i13, aVar3.f()));
            } else {
                if (this.E.f627a == bVar2) {
                    i10 = R.string.ResellGiftPriceTitle;
                } else {
                    i10 = R.string.ResellGiftPriceTitleTON;
                }
                yd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            if (this.F == 0 && this.E.f628b > j12) {
                z16 = true;
            } else {
                z16 = false;
            }
            di.d dVar = this.f50597f;
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
                    yh.r(animate3, f10, 180L);
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
            ag.a aVar10 = this.E;
            ag.b bVar4 = aVar10.f627a;
            ag.b bVar5 = aVar10.f627a;
            long j13 = aVar10.f628b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) ag.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                yh.q(R.string.ResellGiftInfoTON, new Object[]{ag.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.E.f627a == bVar) {
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
        AndroidUtilities.runOnUIThread(new zf.c(this, 7), 50L);
    }
}
