package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v40;
import org.telegram.ui.eo;
public final class e0 extends org.telegram.ui.ActionBar.h3 {
    public final yf.a E;
    public final yf.a F;
    public final yf.a G;
    public yf.a H;
    public long I;
    public int J;
    public boolean K;
    public final uq[] L;
    public final uq[] M;
    public boolean N;
    public final a f45354b;
    public final boolean f45355c;
    public final int d;
    public final v40 e;
    public final hd0 f45356f;
    public final EditTextBoldCursor h;
    public final TextView f45357n;
    public final c0 f45358r;
    public final bi.d f45359s;
    public final org.telegram.ui.Components.o6 v;
    public final ImageView f45360w;
    public final ImageView f45361x;
    public final yf.a f45362y;

    public e0(final Context context, int i10, long j3, MessageSuggestionParams messageSuggestionParams, eo eoVar, final org.telegram.ui.ActionBar.f6 f6Var, int i11, Utilities.Callback callback) {
        super(1, context, f6Var, true);
        boolean z10;
        int i12;
        boolean z11;
        float f7;
        boolean z12;
        this.I = -1L;
        this.L = new uq[1];
        this.M = new uq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j3);
        this.f45355c = canManageMonoForum;
        if (!canManageMonoForum && !v5.y(i10, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j10 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        yf.b bVar = yf.b.f46929b;
        this.F = yf.a.i(j10, bVar);
        this.G = yf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        yf.b bVar2 = yf.b.f46928a;
        this.f45362y = yf.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.E = yf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            a aVar = new a(context, i10, f6Var);
            this.f45354b = aVar;
            aVar.setScaleX(0.6f);
            aVar.setScaleY(0.6f);
            aVar.setAlpha(0.0f);
            aVar.setEnabled(false);
            aVar.setClickable(false);
            this.container.addView(aVar, w7.a6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            w7.c6.a(aVar);
            aVar.setOnClickListener(new View.OnClickListener(this) {
                public final e0 f45257b;

                {
                    this.f45257b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f45257b.H.f46926a == yf.b.f46928a) {
                                new p7(context, f6Var).show();
                                return;
                            }
                            return;
                        default:
                            e0 e0Var = this.f45257b;
                            org.telegram.ui.Components.d5.T(context, e0Var.I, new th.e(e0Var, 9), f6Var, 0).f17571a.show();
                            return;
                    }
                }
            });
        } else {
            this.f45354b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = em.f(context, 0);
        linearLayout.addView(f10, w7.a6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i11 == 0) {
            i12 = R.string.PostSuggestionsOfferTitle;
        } else {
            i12 = R.string.PostSuggestionsOfferChangeTitle;
        }
        textView.setText(LocaleController.getString(i12));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, w7.a6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.j6.W5;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        w7.c6.a(imageView);
        imageView.setOnClickListener(new org.telegram.ui.web.c(this, 14));
        f10.addView(imageView, w7.a6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            v40 v40Var = new v40(context, f6Var);
            this.e = v40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            v40Var.b(arrayList, new v(this, 1));
            linearLayout.addView(v40Var, w7.a6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout f11 = em.f(context, 1);
        linearLayout.addView(f11, w7.a6.l(1.0f, -1, -2));
        hd0 hd0Var = new hd0(context, null);
        this.f45356f = hd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        hd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        hd0Var.e(editTextBoldCursor);
        yf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null && !aVar2.k()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        hd0Var.b(1.0f, f7, false);
        hd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new hi.y5(this, 5));
        hd0Var.addView(editTextBoldCursor, w7.a6.e(-1, -2, 48));
        f11.addView(hd0Var, w7.a6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f45360w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        hd0Var.addView(imageView2, w7.a6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f45361x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        hd0Var.addView(imageView3, w7.a6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.v = o6Var;
        int i15 = org.telegram.ui.ActionBar.j6.f18306y6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(5);
        hd0Var.addView(o6Var, w7.a6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f45357n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, w7.a6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f45358r = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        hd0 hd0Var2 = new hd0(context, null);
        hd0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        hd0Var2.e(editTextBoldCursor2);
        hd0Var2.addView((View) editTextBoldCursor2, w7.a6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.c6.b(hd0Var2, 0.02f, 1.2f);
        hd0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f45257b;

            {
                this.f45257b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f45257b.H.f46926a == yf.b.f46928a) {
                            new p7(context, f6Var).show();
                            return;
                        }
                        return;
                    default:
                        e0 e0Var = this.f45257b;
                        org.telegram.ui.Components.d5.T(context, e0Var.I, new th.e(e0Var, 9), f6Var, 0).f17571a.show();
                        return;
                }
            }
        });
        f11.addView(hd0Var2, w7.a6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
        hd0Var2.addView(imageView4, w7.a6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, w7.a6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.a6.q(-1, -2, 80));
        bi.d dVar = new bi.d(context, f6Var, true);
        this.f45359s = dVar;
        dVar.setOnClickListener(new di.f1(this, eoVar, i10, context, f6Var, j3, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, w7.a6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        yf.a aVar3 = messageSuggestionParams.amount;
        if (aVar3 != null) {
            z12 = false;
            q(yf.a.i(aVar3.f46927b, aVar3.f46926a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z12 = false;
            q(yf.a.i(0L, bVar2), false, true, false);
        }
        long j11 = messageSuggestionParams.time;
        if (this.I != j11) {
            this.I = j11;
            editTextBoldCursor2.setText(o(j11));
        }
        n(z12);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new d0(this));
    }

    public static String o(long j3) {
        if (j3 <= 0) {
            return LocaleController.getString(R.string.PostSuggestionsAnytime);
        }
        String formatDateTime = LocaleController.formatDateTime(j3, true);
        if (!formatDateTime.isEmpty()) {
            return Character.toUpperCase(formatDateTime.charAt(0)) + formatDateTime.substring(1);
        }
        return formatDateTime;
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar;
        if (this.K && (aVar = this.f45354b) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    public final void m() {
        boolean z10;
        float f7;
        boolean z11 = this.N;
        a aVar = this.f45354b;
        if ((z11 && !isDismissed() && aVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.e == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.K != z10) {
            this.K = z10;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                ViewPropertyAnimator animate = aVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                scaleY.alpha(f11).setDuration(180L).start();
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        if (this.J == 0 && (this.H.f46927b >= 0 || this.I > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        bi.d dVar = this.f45359s;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(180L).start();
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        m();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.N = true;
        m();
    }

    public final yf.a p() {
        if (this.H.f46926a == yf.b.f46929b) {
            return this.G;
        }
        return this.E;
    }

    public final void q(yf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        yf.a aVar2;
        char c10;
        int i10;
        yf.a aVar3;
        boolean z16;
        String formatNumber;
        uq[] uqVarArr;
        double d;
        float f7;
        float f10;
        yf.b bVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        float f17;
        yf.a aVar4;
        yf.a aVar5 = this.H;
        int i12 = this.J;
        this.J = 0;
        if (aVar != null) {
            this.H = aVar;
        } else {
            this.H = yf.a.i(0L, aVar5.f46926a);
            this.J |= 1;
        }
        long j3 = p().f46927b;
        yf.a aVar6 = this.H;
        if (j3 < aVar6.f46927b) {
            this.J |= 4;
        }
        boolean k10 = aVar6.k();
        yf.a aVar7 = this.f45362y;
        yf.a aVar8 = this.F;
        yf.b bVar2 = yf.b.f46929b;
        if (!k10) {
            yf.a aVar9 = this.H;
            if (aVar9.f46926a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f46927b > aVar9.f46927b) {
                this.J |= 2;
            }
        }
        if (!z11 && aVar5.f46926a == this.H.f46926a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f46927b == this.H.f46927b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.J) {
            z15 = false;
        } else {
            z15 = true;
        }
        hd0 hd0Var = this.f45356f;
        if (z15) {
            if ((this.J & (-9)) == 0) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            hd0Var.a(f17);
        }
        yf.b bVar3 = yf.b.f46928a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c10 = 0;
            v40 v40Var = this.e;
            if (v40Var != null) {
                if (this.H.f46926a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                v40Var.a(i11, z12);
            }
            yf.b bVar4 = this.H.f46926a;
            TextView textView = this.f45357n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.f45361x;
            ImageView imageView2 = this.f45360w;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.H.f46926a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.H.f46926a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.H.f46926a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.H.f46926a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.H.f46926a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.H.f46926a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.H.f46926a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.H.f46926a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar10 = this.f45354b;
            if (aVar10 != null && aVar10.e != (bVar = this.H.f46926a)) {
                aVar10.e = bVar;
                aVar10.a();
            }
        } else {
            aVar2 = aVar7;
            c10 = 0;
        }
        if (z13 || z15) {
            int i13 = this.J;
            if ((i13 & 4) != 0) {
                int i14 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = p().f();
                hd0Var.setText(LocaleController.formatString(i14, objArr));
            } else if ((i13 & 2) != 0) {
                int i15 = R.string.SuggestAPostTooSmall;
                if (this.H.f46926a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f18 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c10] = f18;
                hd0Var.setText(LocaleController.formatString(i15, objArr2));
            } else {
                if (this.H.f46926a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                hd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            int i16 = this.d;
            bi.d dVar = this.f45359s;
            if (i16 == 0) {
                if (!this.H.k()) {
                    yf.a aVar11 = this.H;
                    if (aVar11.f46926a == bVar2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    int i17 = R.string.PostSuggestionsOfferStars;
                    if (z16) {
                        formatNumber = aVar11.b();
                    } else {
                        formatNumber = LocaleController.formatNumber(aVar11.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[c10] = formatNumber;
                    String formatString = LocaleController.formatString(i17, objArr3);
                    if (z16) {
                        uqVarArr = this.M;
                    } else {
                        uqVarArr = this.L;
                    }
                    dVar.g(z7.V0(z16, formatString, uqVarArr), z12, true);
                } else {
                    dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
                }
            } else {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            }
            n(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.H.f46926a == bVar2) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.H.c() * d * 100.0d), "USD", 2));
            this.v.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.H.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new x(this, 1), 50L);
    }
}
