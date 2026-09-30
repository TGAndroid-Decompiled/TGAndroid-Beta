package rg;

import ai.f5;
import ai.y3;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.ac;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bx0;
import org.telegram.ui.lw0;
import org.telegram.ui.ub1;
import org.telegram.ui.yf0;
import w7.y5;
public class k1 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public View A0;
    public View B0;
    public TLRPC.InputStickerSet C0;
    public TLRPC.TL_emojiStatusCollectible D0;
    public boolean E0;
    public final int[] F0;
    public float G0;
    public boolean H0;
    public ValueAnimator I0;
    public boolean J0;
    public boolean K0;
    public FrameLayout L0;
    public final FrameLayout M0;
    public FrameLayout N0;
    public q90[] O0;
    public q90 P0;
    public final ArrayList X;
    public int Y;
    public final TLRPC.User Z;
    public final k f42733a0;
    public final TL_stars.StarGift f42734b0;
    public boolean f42735c0;
    public final lw0 f42736d0;
    public int f42737e0;
    public int f42738f0;
    public int f42739g0;
    public int f42740h0;
    public int f42741i0;
    public int f42742j0;
    public int f42743k0;
    public int f42744l0;
    public int m0;
    public int f42745n0;
    public final u00 f42746o0;
    public final z0 f42747p0;
    public ei.f f42748q0;
    public yf0 f42749r0;
    public ub1 f42750s0;
    public final m2 f42751t0;
    public Integer f42752u0;
    public float f42753v0;
    public float f42754w0;
    public float f42755x0;
    public float f42756y0;
    public float f42757z0;

    public k1(m2 m2Var, int i10, TLRPC.User user, d6 d6Var) {
        this(m2Var, i10, user, null, null, d6Var);
    }

    public static void P(k1 k1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(k1Var.C0);
        y3 y3Var = new y3(k1Var, 9);
        m2 m2Var = k1Var.f42751t0;
        if (m2Var != null) {
            y3Var.setParentFragment(m2Var);
        }
        new g1(k1Var, y3Var, k1Var.getContext(), k1Var.resourcesProvider, arrayList).show();
    }

    @Override
    public final void E(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.X;
            if (i12 < arrayList.size()) {
                lw0 lw0Var = this.f42736d0;
                lw0Var.a((bx0) arrayList.get(i12), false);
                lw0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((bx0) arrayList.get(i12)).e = i13;
                i13 += lw0Var.getMeasuredHeight();
                i12++;
            } else {
                this.f42737e0 = i13;
                this.container.getLocationOnScreen(this.F0);
                return;
            }
        }
    }

    @Override
    public final void G(dw0 dw0Var) {
        this.Y = UserConfig.selectedAccount;
        p0 p0Var = new p0(getContext(), this.resourcesProvider, false);
        p0Var.a(PremiumPreviewFragment.o0(this.Y, null), new org.telegram.ui.Components.voip.o(this, 10), false);
        this.L0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(h6.f19077d7));
        this.L0.addView(view, y5.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.Y).isPremium() && !(this instanceof tg.j0)) {
            this.L0.addView(p0Var, y5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            this.L0.setBackgroundColor(getThemedColor(h6.f19146h5));
            dw0Var.addView(this.L0, y5.e(-1, 68, 80));
        }
    }

    public void W(ub1 ub1Var) {
        ub1Var.addView(this.B0, y5.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int X() {
        return 0;
    }

    public View Z(Context context, int i10) {
        return null;
    }

    public void a0(boolean z10) {
        int intValue;
        int intValue2;
        int intValue3;
        String str;
        int intValue4;
        int intValue5;
        int intValue6;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        q90[] q90VarArr = this.O0;
        if (q90VarArr != null && this.P0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.D0;
            TLRPC.User user = this.Z;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.O0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new d1(this, 0)));
                org.telegram.ui.Cells.c1.q(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.C0 != null) {
                String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
                Integer num = this.f42752u0;
                if (num == null) {
                    intValue6 = getThemedColor(h6.f19389u6);
                } else {
                    intValue6 = num.intValue();
                }
                CharSequence replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, intValue6);
                try {
                    replaceSingleLink = Emoji.replaceEmoji(replaceSingleLink, this.O0[0].getPaint().getFontMetricsInt(), false);
                } catch (Exception unused) {
                }
                if (replaceSingleLink instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) replaceSingleLink;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(replaceSingleLink);
                }
                int indexOf = replaceSingleLink.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.Y).getStickerSet(this.C0, false);
                    if (stickerSet != null && !stickerSet.documents.isEmpty()) {
                        document = stickerSet.documents.get(0);
                        if (stickerSet.set != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= stickerSet.documents.size()) {
                                    break;
                                } else if (stickerSet.documents.get(i10).f18358id == stickerSet.set.thumb_document_id) {
                                    document = stickerSet.documents.get(i10);
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new z5(document, this.O0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (stickerSet != null && stickerSet.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new v90(AndroidUtilities.dp(100.0f), this.O0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new ac(this, 9), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.O0[1].setOnLinkPressListener(new p90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            k1.P(k1.this);
                        }
                    });
                    if (document != null) {
                        q90[] q90VarArr2 = this.O0;
                        if (q90VarArr2 != null) {
                            q90VarArr2[1].setText(spannableStringBuilder);
                            if (this.O0[1].getVisibility() != 0) {
                                if (z10) {
                                    this.O0[1].setAlpha(0.0f);
                                    this.O0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.O0[1].animate().alpha(1.0f);
                                    tr trVar = tr.f28636f;
                                    ok.s(alpha, trVar, 200L);
                                    this.O0[0].animate().alpha(0.0f).setInterpolator(trVar).setDuration(200L).withEndAction(new d1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new f1(this, 1));
                                    ofFloat.setInterpolator(trVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.O0[1].setAlpha(1.0f);
                                    this.O0[1].setVisibility(0);
                                    this.O0[0].setAlpha(0.0f);
                                    this.O0[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.O0[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                org.telegram.ui.Cells.c1.q(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.E0) {
                q90VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                k kVar = this.f42733a0;
                if (kVar != null) {
                    if (this.f42735c0) {
                        q90 q90Var = q90VarArr[0];
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        String formatString2 = LocaleController.formatString(i11, str, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num2 = this.f42752u0;
                        if (num2 == null) {
                            intValue4 = getThemedColor(h6.f19389u6);
                        } else {
                            intValue4 = num2.intValue();
                        }
                        q90Var.setText(AndroidUtilities.replaceSingleLink(formatString2, intValue4));
                        q90 q90Var2 = this.P0;
                        int i12 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        String formatString3 = LocaleController.formatString(i12, str3);
                        Integer num3 = this.f42752u0;
                        if (num3 == null) {
                            intValue5 = getThemedColor(h6.f19389u6);
                        } else {
                            intValue5 = num3.intValue();
                        }
                        q90Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, intValue5));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f18499id != 777000) {
                        q90 q90Var3 = this.O0[0];
                        String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num4 = this.f42752u0;
                        if (num4 == null) {
                            intValue3 = getThemedColor(h6.f19389u6);
                        } else {
                            intValue3 = num4.intValue();
                        }
                        q90Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, intValue3));
                        org.telegram.ui.Cells.c1.q(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    } else {
                        q90 q90Var4 = this.O0[0];
                        String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num5 = this.f42752u0;
                        if (num5 == null) {
                            intValue2 = getThemedColor(h6.f19389u6);
                        } else {
                            intValue2 = num5.intValue();
                        }
                        q90Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, intValue2));
                        org.telegram.ui.Cells.c1.q(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.f42734b0;
                    if (starGift != null) {
                        q90VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.O0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            org.telegram.ui.Cells.c1.q(R.string.Gift2PremiumSubtitle, this.P0);
                        }
                        this.P0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        q90VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        org.telegram.ui.Cells.c1.q(R.string.TelegramPremiumSubscribedSubtitle, this.P0);
                    } else {
                        q90 q90Var5 = q90VarArr[0];
                        String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                        Integer num6 = this.f42752u0;
                        if (num6 == null) {
                            intValue = getThemedColor(h6.f19389u6);
                        } else {
                            intValue = num6.intValue();
                        }
                        q90Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, intValue));
                        org.telegram.ui.Cells.c1.q(R.string.TelegramPremiumUserDialogSubtitle, this.P0);
                    }
                }
            }
            try {
                q90 q90Var6 = this.O0[0];
                q90Var6.setText(Emoji.replaceEmoji(q90Var6.getText(), this.O0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void b0() {
        int i10 = this.f42738f0;
        int i11 = i10 + 1;
        this.f42738f0 = i11;
        this.f42739g0 = i10;
        this.f42742j0 = i11;
        int size = this.X.size() + i11;
        this.f42743k0 = size;
        this.f42738f0 = size + 1;
        this.f42744l0 = size;
        if (!UserConfig.getInstance(this.Y).isPremium() && this.f42733a0 == null) {
            int i12 = this.f42738f0;
            this.f42738f0 = i12 + 1;
            this.m0 = i12;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.C0) != null && inputStickerSet.f18372id == ((Long) objArr[0]).longValue()) {
            a0(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        u00 u00Var = this.f42746o0;
        if (u00Var.f28700c) {
            u00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view;
        Drawable drawable;
        int i10;
        View view2 = this.B0;
        if (view2 != null) {
            if (this.H0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            view2.setVisibility(i10);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.A0 != null && this.H0) {
            View view3 = this.B0;
            if (view3 == null) {
                view = this.f42749r0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f42753v0, this.f42754w0};
            this.A0.getMatrix().mapPoints(fArr);
            View view4 = this.A0;
            if (view4 instanceof h5) {
                drawable = ((h5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.u1) {
                drawable = ((org.telegram.ui.Cells.u1) view4).f21362fc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.F0;
            float f7 = (-iArr[0]) + this.f42755x0 + fArr[0];
            float f10 = (-iArr[1]) + this.f42756y0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f42751t0.getParentLayout().getView();
                f7 += view5.getX() + view5.getPaddingLeft();
                f10 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f42757z0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f11 = measuredHeight / intrinsicWidth;
            float f12 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f7, measuredWidth, tr.h.getInterpolation(this.G0));
            float lerp2 = AndroidUtilities.lerp(f10, measuredHeight2, this.G0);
            float f13 = this.f42757z0;
            float f14 = this.G0;
            float f15 = (f11 * f14) + ((1.0f - f14) * f13);
            canvas.save();
            canvas.scale(f15, f15, lerp, lerp2);
            int i11 = (int) lerp;
            int i12 = (int) lerp2;
            drawable.setBounds(ok.z(2, i11, drawable), ok.d(2, i12, drawable), org.telegram.ui.Cells.c1.t(2, i11, drawable), org.telegram.ui.Cells.c1.d(2, i12, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.clamp(this.G0, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float lerp3 = AndroidUtilities.lerp(f12, 1.0f, this.G0);
            canvas.scale(lerp3, lerp3, lerp, lerp2);
            canvas.translate(lerp - (view.getMeasuredWidth() / 2.0f), lerp2 - (view.getMeasuredHeight() / 2.0f));
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        Drawable drawable;
        if (this.A0 == null) {
            return false;
        }
        this.I0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G0 = 0.0f;
        this.H0 = true;
        this.f42750s0.invalidate();
        View view = this.A0;
        if (view instanceof h5) {
            drawable = ((h5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            o5 o5Var = u1Var.f21362fc;
            u1Var.a3();
            drawable = o5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.A0;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view2).a3();
        } else {
            view2.invalidate();
        }
        yf0 yf0Var = this.f42749r0;
        if (yf0Var != null) {
            yf0Var.j(100L);
        }
        this.I0.addUpdateListener(new f1(this, 0));
        this.I0.addListener(new dl0(21, this, drawable));
        this.I0.setDuration(600L);
        this.I0.setInterpolator(tr.h);
        this.I0.start();
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        if (this.J0) {
            AndroidUtilities.runOnUIThread(new d1(this, 1), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        yf0 yf0Var = this.f42749r0;
        if (yf0Var != null) {
            yf0Var.setDialogVisible(true);
        }
        this.f42748q0.setPaused(true);
        dialog.setOnDismissListener(new f5(this, 10));
        dialog.show();
        return true;
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        return new j1(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public k1(m2 m2Var, int i10, TLRPC.User user, k kVar, TL_stars.StarGift starGift, d6 d6Var) {
        super(m2Var, false, false, d6Var);
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.F0 = new int[2];
        this.G0 = 0.0f;
        fixNavigationBar();
        this.f42751t0 = m2Var;
        this.v = 0.26f;
        this.Z = user;
        this.Y = i10;
        this.f42733a0 = kVar;
        this.f42734b0 = starGift;
        this.f42736d0 = new lw0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (kVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.L0.setVisibility(8);
        }
        z0 z0Var = new z0(h6.Lj, h6.Mj, h6.Nj, h6.Oj, null);
        this.f42747p0 = z0Var;
        z0Var.f42954m = true;
        z0Var.f42956o = 1.0f;
        z0Var.f42957p = 0.0f;
        z0Var.f42958q = 0.0f;
        z0Var.f42946b = 0.0f;
        z0Var.f42947c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new pn0(this, i10, m2Var, 1));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        u00 u00Var = new u00(getContext());
        this.f42746o0 = u00Var;
        this.container.addView(u00Var, y5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.M0 = frameLayout;
        this.containerView.addView(frameLayout, y5.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
