package zh;

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
import org.telegram.messenger.sk;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.fo;
public final class d0 extends org.telegram.ui.ActionBar.e3 {
    public final ag.a E;
    public final ag.a F;
    public final ag.a G;
    public ag.a H;
    public long I;
    public int J;
    public boolean K;
    public final br[] L;
    public final br[] M;
    public boolean N;
    public final a f50363b;
    public final boolean f50364c;
    public final int d;
    public final y40 e;
    public final yd0 f50365f;
    public final EditTextBoldCursor h;
    public final TextView f50366n;
    public final b0 f50367r;
    public final di.d f50368s;
    public final org.telegram.ui.Components.s6 v;
    public final ImageView f50369w;
    public final ImageView f50370x;
    public final ag.a f50371y;

    public d0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, fo foVar, final org.telegram.ui.ActionBar.c6 c6Var, int i11, Utilities.Callback callback) {
        super(1, context, c6Var, true);
        boolean z10;
        int i12;
        boolean z11;
        float f7;
        boolean z12;
        this.I = -1L;
        this.L = new br[1];
        this.M = new br[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.f50364c = canManageMonoForum;
        if (!canManageMonoForum && !n5.y(i10, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        ag.b bVar = ag.b.f634b;
        this.F = ag.a.i(j11, bVar);
        this.G = ag.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        ag.b bVar2 = ag.b.f633a;
        this.f50371y = ag.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.E = ag.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            a aVar = new a(context, i10, c6Var);
            this.f50363b = aVar;
            aVar.setScaleX(0.6f);
            aVar.setScaleY(0.6f);
            aVar.setAlpha(0.0f);
            aVar.setEnabled(false);
            aVar.setClickable(false);
            this.container.addView(aVar, w7.z5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
            w7.b6.a(aVar);
            aVar.setOnClickListener(new View.OnClickListener(this) {
                public final d0 f50252b;

                {
                    this.f50252b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f50252b.H.f631a == ag.b.f633a) {
                                new f7(context, c6Var).show();
                                return;
                            }
                            return;
                        default:
                            d0 d0Var = this.f50252b;
                            org.telegram.ui.Components.g5.S(context, d0Var.I, new rg.b0(d0Var, 25), c6Var, 0).f20538a.show();
                            return;
                    }
                }
            });
        } else {
            this.f50363b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = sk.e(context, 0);
        linearLayout.addView(e, w7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
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
        e.addView(textView, w7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.g6.W5;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i14, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new ji.o4(this, 20));
        e.addView(imageView, w7.z5.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            y40 y40Var = new y40(context, c6Var);
            this.e = y40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            y40Var.b(arrayList, new v(this, 1));
            linearLayout.addView(y40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout e7 = sk.e(context, 1);
        linearLayout.addView(e7, w7.z5.l(1.0f, -1, -2));
        yd0 yd0Var = new yd0(context, null);
        this.f50365f = yd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
        yd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        yd0Var.e(editTextBoldCursor);
        ag.a aVar2 = messageSuggestionParams.amount;
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
        yd0Var.b(1.0f, f7, false);
        yd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 6));
        yd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e7.addView(yd0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f50369w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        yd0Var.addView(imageView2, w7.z5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView3 = new ImageView(context);
        this.f50370x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        yd0Var.addView(imageView3, w7.z5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.v = s6Var;
        int i15 = org.telegram.ui.ActionBar.g6.f19988y6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(5);
        yd0Var.addView(s6Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView2 = new TextView(context);
        this.f50366n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f50367r = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        yd0 yd0Var2 = new yd0(context, null);
        yd0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        yd0Var2.e(editTextBoldCursor2);
        yd0Var2.addView((View) editTextBoldCursor2, w7.z5.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 48));
        w7.b6.b(yd0Var2, 0.02f, 1.2f);
        yd0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final d0 f50252b;

            {
                this.f50252b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f50252b.H.f631a == ag.b.f633a) {
                            new f7(context, c6Var).show();
                            return;
                        }
                        return;
                    default:
                        d0 d0Var = this.f50252b;
                        org.telegram.ui.Components.g5.S(context, d0Var.I, new rg.b0(d0Var, 25), c6Var, 0).f20538a.show();
                        return;
                }
            }
        });
        e7.addView(yd0Var2, w7.z5.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i14, c6Var), mode));
        yd0Var2.addView(imageView4, w7.z5.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        e7.addView(textView3, w7.z5.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.z5.q(-1, -2, 80));
        di.d dVar = new di.d(context, c6Var, true);
        this.f50368s = dVar;
        dVar.setOnClickListener(new fi.b1(this, foVar, i10, context, c6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, w7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        ag.a aVar3 = messageSuggestionParams.amount;
        if (aVar3 != null) {
            z12 = false;
            s(ag.a.i(aVar3.f632b, aVar3.f631a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z12 = false;
            s(ag.a.i(0L, bVar2), false, true, false);
        }
        long j12 = messageSuggestionParams.time;
        if (this.I != j12) {
            this.I = j12;
            editTextBoldCursor2.setText(q(j12));
        }
        o(z12);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new c0(this));
    }

    public static String q(long j10) {
        if (j10 <= 0) {
            return LocaleController.getString(R.string.PostSuggestionsAnytime);
        }
        String formatDateTime = LocaleController.formatDateTime(j10, true);
        if (!formatDateTime.isEmpty()) {
            return Character.toUpperCase(formatDateTime.charAt(0)) + formatDateTime.substring(1);
        }
        return formatDateTime;
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar;
        if (this.K && (aVar = this.f50363b) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    public final void n() {
        boolean z10;
        float f7;
        boolean z11 = this.N;
        a aVar = this.f50363b;
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
                sk.s(scaleY, f11, 180L);
            }
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        if (this.J == 0 && (this.H.f632b >= 0 || this.I > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        di.d dVar = this.f50368s;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                sk.s(animate, f7, 180L);
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
        n();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.N = true;
        n();
    }

    public final ag.a r() {
        if (this.H.f631a == ag.b.f634b) {
            return this.G;
        }
        return this.E;
    }

    public final void s(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        ag.a aVar2;
        int i10;
        ag.a aVar3;
        boolean z16;
        String formatNumber;
        br[] brVarArr;
        double d;
        float f7;
        float f10;
        ag.b bVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        float f17;
        ag.a aVar4;
        ag.a aVar5 = this.H;
        int i12 = this.J;
        this.J = 0;
        if (aVar != null) {
            this.H = aVar;
        } else {
            this.H = ag.a.i(0L, aVar5.f631a);
            this.J |= 1;
        }
        long j10 = r().f632b;
        ag.a aVar6 = this.H;
        if (j10 < aVar6.f632b) {
            this.J |= 4;
        }
        boolean k10 = aVar6.k();
        ag.a aVar7 = this.f50371y;
        ag.a aVar8 = this.F;
        ag.b bVar2 = ag.b.f634b;
        if (!k10) {
            ag.a aVar9 = this.H;
            if (aVar9.f631a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f632b > aVar9.f632b) {
                this.J |= 2;
            }
        }
        if (!z11 && aVar5.f631a == this.H.f631a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f632b == this.H.f632b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.J) {
            z15 = false;
        } else {
            z15 = true;
        }
        yd0 yd0Var = this.f50365f;
        if (z15) {
            if ((this.J & (-9)) == 0) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            yd0Var.a(f17);
        }
        ag.b bVar3 = ag.b.f633a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            y40 y40Var = this.e;
            if (y40Var != null) {
                if (this.H.f631a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                y40Var.a(i11, z12);
            }
            ag.b bVar4 = this.H.f631a;
            TextView textView = this.f50366n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(r().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(r().a()).length() + 3)});
            }
            ImageView imageView = this.f50370x;
            ImageView imageView2 = this.f50369w;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.H.f631a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.H.f631a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.H.f631a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.H.f631a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.H.f631a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.H.f631a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.H.f631a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.H.f631a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar10 = this.f50363b;
            if (aVar10 != null && aVar10.e != (bVar = this.H.f631a)) {
                aVar10.e = bVar;
                aVar10.a();
            }
        } else {
            aVar2 = aVar7;
        }
        if (z13 || z15) {
            int i13 = this.J;
            if ((i13 & 4) != 0) {
                yd0Var.setText(LocaleController.formatString(R.string.SuggestAPostTooMuch, r().f()));
            } else if ((i13 & 2) != 0) {
                int i14 = R.string.SuggestAPostTooSmall;
                if (this.H.f631a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                yd0Var.setText(LocaleController.formatString(i14, aVar3.f()));
            } else {
                if (this.H.f631a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                yd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            int i15 = this.d;
            di.d dVar = this.f50368s;
            if (i15 == 0) {
                if (!this.H.k()) {
                    ag.a aVar11 = this.H;
                    if (aVar11.f631a == bVar2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    int i16 = R.string.PostSuggestionsOfferStars;
                    if (z16) {
                        formatNumber = aVar11.b();
                    } else {
                        formatNumber = LocaleController.formatNumber(aVar11.a(), ',');
                    }
                    String formatString = LocaleController.formatString(i16, formatNumber);
                    if (z16) {
                        brVarArr = this.M;
                    } else {
                        brVarArr = this.L;
                    }
                    dVar.g(p7.W0(z16, formatString, brVarArr), z12, true);
                } else {
                    dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
                }
            } else {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            }
            o(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.H.f631a == bVar2) {
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
        AndroidUtilities.runOnUIThread(new zf.c(this, 6), 50L);
    }
}
