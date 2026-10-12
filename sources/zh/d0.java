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
import org.telegram.messenger.yh;
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
    public final a f50362b;
    public final boolean f50363c;
    public final int d;
    public final y40 e;
    public final yd0 f50364f;
    public final EditTextBoldCursor h;
    public final TextView f50365n;
    public final b0 f50366r;
    public final di.d f50367s;
    public final org.telegram.ui.Components.s6 v;
    public final ImageView f50368w;
    public final ImageView f50369x;
    public final ag.a f50370y;

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
        this.f50363c = canManageMonoForum;
        if (!canManageMonoForum && !n5.y(i10, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        ag.b bVar = ag.b.f630b;
        this.F = ag.a.i(j11, bVar);
        this.G = ag.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        ag.b bVar2 = ag.b.f629a;
        this.f50370y = ag.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.E = ag.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            a aVar = new a(context, i10, c6Var);
            this.f50362b = aVar;
            aVar.setScaleX(0.6f);
            aVar.setScaleY(0.6f);
            aVar.setAlpha(0.0f);
            aVar.setEnabled(false);
            aVar.setClickable(false);
            this.container.addView(aVar, w7.a6.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
            w7.c6.a(aVar);
            aVar.setOnClickListener(new View.OnClickListener(this) {
                public final d0 f50251b;

                {
                    this.f50251b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f50251b.H.f627a == ag.b.f629a) {
                                new f7(context, c6Var).show();
                                return;
                            }
                            return;
                        default:
                            d0 d0Var = this.f50251b;
                            org.telegram.ui.Components.g5.S(context, d0Var.I, new rg.b0(d0Var, 25), c6Var, 0).f20838a.show();
                            return;
                    }
                }
            });
        } else {
            this.f50362b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = yh.e(context, 0);
        linearLayout.addView(e, w7.a6.t(-1, 56, 55, 0, 0, 0, 0));
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
        e.addView(textView, w7.a6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.g6.W5;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i14, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        w7.c6.a(imageView);
        imageView.setOnClickListener(new ji.o4(this, 20));
        e.addView(imageView, w7.a6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            y40 y40Var = new y40(context, c6Var);
            this.e = y40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            y40Var.b(arrayList, new v(this, 1));
            linearLayout.addView(y40Var, w7.a6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout e7 = yh.e(context, 1);
        linearLayout.addView(e7, w7.a6.l(1.0f, -1, -2));
        yd0 yd0Var = new yd0(context, null);
        this.f50364f = yd0Var;
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
        yd0Var.addView(editTextBoldCursor, w7.a6.e(-1, -2, 48));
        e7.addView(yd0Var, w7.a6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f50368w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        yd0Var.addView(imageView2, w7.a6.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView3 = new ImageView(context);
        this.f50369x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        yd0Var.addView(imageView3, w7.a6.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.v = s6Var;
        int i15 = org.telegram.ui.ActionBar.g6.f20288y6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(5);
        yd0Var.addView(s6Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView2 = new TextView(context);
        this.f50365n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.a6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f50366r = editTextBoldCursor2;
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
        yd0Var2.addView((View) editTextBoldCursor2, w7.a6.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 48));
        w7.c6.b(yd0Var2, 0.02f, 1.2f);
        yd0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final d0 f50251b;

            {
                this.f50251b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f50251b.H.f627a == ag.b.f629a) {
                            new f7(context, c6Var).show();
                            return;
                        }
                        return;
                    default:
                        d0 d0Var = this.f50251b;
                        org.telegram.ui.Components.g5.S(context, d0Var.I, new rg.b0(d0Var, 25), c6Var, 0).f20838a.show();
                        return;
                }
            }
        });
        e7.addView(yd0Var2, w7.a6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i14, c6Var), mode));
        yd0Var2.addView(imageView4, w7.a6.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        e7.addView(textView3, w7.a6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.a6.q(-1, -2, 80));
        di.d dVar = new di.d(context, c6Var, true);
        this.f50367s = dVar;
        dVar.setOnClickListener(new fi.b1(this, foVar, i10, context, c6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, w7.a6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        ag.a aVar3 = messageSuggestionParams.amount;
        if (aVar3 != null) {
            z12 = false;
            s(ag.a.i(aVar3.f628b, aVar3.f627a), !messageSuggestionParams.amount.k(), true, false);
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
        if (this.K && (aVar = this.f50362b) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    public final void n() {
        boolean z10;
        float f7;
        boolean z11 = this.N;
        a aVar = this.f50362b;
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
                yh.r(scaleY, f11, 180L);
            }
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        if (this.J == 0 && (this.H.f628b >= 0 || this.I > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        di.d dVar = this.f50367s;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                yh.r(animate, f7, 180L);
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
        if (this.H.f627a == ag.b.f630b) {
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
            this.H = ag.a.i(0L, aVar5.f627a);
            this.J |= 1;
        }
        long j10 = r().f628b;
        ag.a aVar6 = this.H;
        if (j10 < aVar6.f628b) {
            this.J |= 4;
        }
        boolean k10 = aVar6.k();
        ag.a aVar7 = this.f50370y;
        ag.a aVar8 = this.F;
        ag.b bVar2 = ag.b.f630b;
        if (!k10) {
            ag.a aVar9 = this.H;
            if (aVar9.f627a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f628b > aVar9.f628b) {
                this.J |= 2;
            }
        }
        if (!z11 && aVar5.f627a == this.H.f627a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f628b == this.H.f628b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.J) {
            z15 = false;
        } else {
            z15 = true;
        }
        yd0 yd0Var = this.f50364f;
        if (z15) {
            if ((this.J & (-9)) == 0) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            yd0Var.a(f17);
        }
        ag.b bVar3 = ag.b.f629a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            y40 y40Var = this.e;
            if (y40Var != null) {
                if (this.H.f627a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                y40Var.a(i11, z12);
            }
            ag.b bVar4 = this.H.f627a;
            TextView textView = this.f50365n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(r().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(r().a()).length() + 3)});
            }
            ImageView imageView = this.f50369x;
            ImageView imageView2 = this.f50368w;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.H.f627a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.H.f627a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.H.f627a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.H.f627a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.H.f627a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.H.f627a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.H.f627a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.H.f627a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar10 = this.f50362b;
            if (aVar10 != null && aVar10.e != (bVar = this.H.f627a)) {
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
                if (this.H.f627a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                yd0Var.setText(LocaleController.formatString(i14, aVar3.f()));
            } else {
                if (this.H.f627a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                yd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            int i15 = this.d;
            di.d dVar = this.f50367s;
            if (i15 == 0) {
                if (!this.H.k()) {
                    ag.a aVar11 = this.H;
                    if (aVar11.f627a == bVar2) {
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
            if (this.H.f627a == bVar2) {
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
