package yh;

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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.oq;
import org.telegram.ui.zn;
public final class e0 extends org.telegram.ui.ActionBar.f3 {
    public final zf.a E;
    public final zf.a F;
    public final zf.a G;
    public zf.a H;
    public long I;
    public int J;
    public boolean K;
    public final oq[] L;
    public final oq[] M;
    public boolean N;
    public final a f47310b;
    public final boolean f47311c;
    public final int d;
    public final l40 e;
    public final id0 f47312f;
    public final EditTextBoldCursor h;
    public final TextView f47313n;
    public final c0 f47314r;
    public final ci.d f47315s;
    public final org.telegram.ui.Components.p6 v;
    public final ImageView f47316w;
    public final ImageView f47317x;
    public final zf.a f47318y;

    public e0(final Context context, int i10, long j3, MessageSuggestionParams messageSuggestionParams, zn znVar, final org.telegram.ui.ActionBar.e6 e6Var, int i11, Utilities.Callback callback) {
        super(1, context, e6Var, true);
        boolean z10;
        int i12;
        boolean z11;
        float f7;
        boolean z12;
        this.I = -1L;
        this.L = new oq[1];
        this.M = new oq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j3);
        this.f47311c = canManageMonoForum;
        if (!canManageMonoForum && !t5.y(i10, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j10 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        zf.b bVar = zf.b.f49209b;
        this.F = zf.a.i(j10, bVar);
        this.G = zf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        zf.b bVar2 = zf.b.f49208a;
        this.f47318y = zf.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.E = zf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            a aVar = new a(context, i10, e6Var);
            this.f47310b = aVar;
            aVar.setScaleX(0.6f);
            aVar.setScaleY(0.6f);
            aVar.setAlpha(0.0f);
            aVar.setEnabled(false);
            aVar.setClickable(false);
            this.container.addView(aVar, w7.y5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            w7.a6.a(aVar);
            aVar.setOnClickListener(new View.OnClickListener(this) {
                public final e0 f47217b;

                {
                    this.f47217b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f47217b.H.f49206a == zf.b.f49208a) {
                                new l7(context, e6Var).show();
                                return;
                            }
                            return;
                        default:
                            e0 e0Var = this.f47217b;
                            org.telegram.ui.Components.e5.T(context, e0Var.I, new r5.d(e0Var, 19), e6Var, 0).f18627a.show();
                            return;
                    }
                }
            });
        } else {
            this.f47310b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = wh.e(context, 0);
        linearLayout.addView(e, w7.y5.t(-1, 56, 55, 0, 0, 0, 0));
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
        e.addView(textView, w7.y5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.j6.W5;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        w7.a6.a(imageView);
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 19));
        e.addView(imageView, w7.y5.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            l40 l40Var = new l40(context, e6Var);
            this.e = l40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            l40Var.b(arrayList, new v(this, 1));
            linearLayout.addView(l40Var, w7.y5.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout e7 = wh.e(context, 1);
        linearLayout.addView(e7, w7.y5.l(1.0f, -1, -2));
        id0 id0Var = new id0(context, null);
        this.f47312f = id0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        id0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        id0Var.e(editTextBoldCursor);
        zf.a aVar2 = messageSuggestionParams.amount;
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
        id0Var.b(1.0f, f7, false);
        id0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.v5(this, 5));
        id0Var.addView(editTextBoldCursor, w7.y5.e(-1, -2, 48));
        e7.addView(id0Var, w7.y5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f47316w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        id0Var.addView(imageView2, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f47317x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        id0Var.addView(imageView3, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
        this.v = p6Var;
        int i15 = org.telegram.ui.ActionBar.j6.f19445y6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        p6Var.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var.setGravity(5);
        id0Var.addView(p6Var, w7.y5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f47313n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.y5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f47314r = editTextBoldCursor2;
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
        id0 id0Var2 = new id0(context, null);
        id0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        id0Var2.e(editTextBoldCursor2);
        id0Var2.addView((View) editTextBoldCursor2, w7.y5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.a6.b(id0Var2, 0.02f, 1.2f);
        id0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f47217b;

            {
                this.f47217b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f47217b.H.f49206a == zf.b.f49208a) {
                            new l7(context, e6Var).show();
                            return;
                        }
                        return;
                    default:
                        e0 e0Var = this.f47217b;
                        org.telegram.ui.Components.e5.T(context, e0Var.I, new r5.d(e0Var, 19), e6Var, 0).f18627a.show();
                        return;
                }
            }
        });
        e7.addView(id0Var2, w7.y5.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, e6Var), mode));
        id0Var2.addView(imageView4, w7.y5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        e7.addView(textView3, w7.y5.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.y5.q(-1, -2, 80));
        ci.d dVar = new ci.d(context, e6Var, true);
        this.f47315s = dVar;
        dVar.setOnClickListener(new ei.c1(this, znVar, i10, context, e6Var, j3, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, w7.y5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        zf.a aVar3 = messageSuggestionParams.amount;
        if (aVar3 != null) {
            z12 = false;
            q(zf.a.i(aVar3.f49207b, aVar3.f49206a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z12 = false;
            q(zf.a.i(0L, bVar2), false, true, false);
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
        if (this.K && (aVar = this.f47310b) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    public final void m() {
        boolean z10;
        float f7;
        boolean z11 = this.N;
        a aVar = this.f47310b;
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
                wh.q(scaleY, f11, 180L);
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        if (this.J == 0 && (this.H.f49207b >= 0 || this.I > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ci.d dVar = this.f47315s;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                wh.q(animate, f7, 180L);
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

    public final zf.a p() {
        if (this.H.f49206a == zf.b.f49209b) {
            return this.G;
        }
        return this.E;
    }

    public final void q(zf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        zf.a aVar2;
        char c10;
        int i10;
        zf.a aVar3;
        boolean z16;
        String formatNumber;
        oq[] oqVarArr;
        double d;
        float f7;
        float f10;
        zf.b bVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        float f17;
        zf.a aVar4;
        zf.a aVar5 = this.H;
        int i12 = this.J;
        this.J = 0;
        if (aVar != null) {
            this.H = aVar;
        } else {
            this.H = zf.a.i(0L, aVar5.f49206a);
            this.J |= 1;
        }
        long j3 = p().f49207b;
        zf.a aVar6 = this.H;
        if (j3 < aVar6.f49207b) {
            this.J |= 4;
        }
        boolean k10 = aVar6.k();
        zf.a aVar7 = this.f47318y;
        zf.a aVar8 = this.F;
        zf.b bVar2 = zf.b.f49209b;
        if (!k10) {
            zf.a aVar9 = this.H;
            if (aVar9.f49206a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f49207b > aVar9.f49207b) {
                this.J |= 2;
            }
        }
        if (!z11 && aVar5.f49206a == this.H.f49206a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f49207b == this.H.f49207b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.J) {
            z15 = false;
        } else {
            z15 = true;
        }
        id0 id0Var = this.f47312f;
        if (z15) {
            if ((this.J & (-9)) == 0) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            id0Var.a(f17);
        }
        zf.b bVar3 = zf.b.f49208a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c10 = 0;
            l40 l40Var = this.e;
            if (l40Var != null) {
                if (this.H.f49206a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                l40Var.a(i11, z12);
            }
            zf.b bVar4 = this.H.f49206a;
            TextView textView = this.f47313n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.f47317x;
            ImageView imageView2 = this.f47316w;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.H.f49206a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.H.f49206a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.H.f49206a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.H.f49206a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.H.f49206a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.H.f49206a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.H.f49206a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.H.f49206a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar10 = this.f47310b;
            if (aVar10 != null && aVar10.e != (bVar = this.H.f49206a)) {
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
                id0Var.setText(LocaleController.formatString(i14, objArr));
            } else if ((i13 & 2) != 0) {
                int i15 = R.string.SuggestAPostTooSmall;
                if (this.H.f49206a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f18 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c10] = f18;
                id0Var.setText(LocaleController.formatString(i15, objArr2));
            } else {
                if (this.H.f49206a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                id0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            int i16 = this.d;
            ci.d dVar = this.f47315s;
            if (i16 == 0) {
                if (!this.H.k()) {
                    zf.a aVar11 = this.H;
                    if (aVar11.f49206a == bVar2) {
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
                        oqVarArr = this.M;
                    } else {
                        oqVarArr = this.L;
                    }
                    dVar.g(v7.V0(z16, formatString, oqVarArr), z12, true);
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
            if (this.H.f49206a == bVar2) {
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
        AndroidUtilities.runOnUIThread(new rg.w1(this, 24), 50L);
    }
}
