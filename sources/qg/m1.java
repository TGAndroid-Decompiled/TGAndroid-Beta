package qg;

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
import bi.pd;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.eg0;
import org.telegram.ui.gc1;
import org.telegram.ui.mx0;
import org.telegram.ui.ww0;
import w7.a6;
public class m1 extends ab implements NotificationCenter.NotificationCenterDelegate {
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
    public m90[] O0;
    public m90 P0;
    public final ArrayList X;
    public int Y;
    public final TLRPC.User Z;
    public final k f40812a0;
    public final TL_stars.StarGift f40813b0;
    public boolean f40814c0;
    public final ww0 f40815d0;
    public int f40816e0;
    public int f40817f0;
    public int f40818g0;
    public int f40819h0;
    public int f40820i0;
    public int f40821j0;
    public int f40822k0;
    public int f40823l0;
    public int m0;
    public int f40824n0;
    public final y00 f40825o0;
    public final c1 f40826p0;
    public di.f f40827q0;
    public eg0 f40828r0;
    public gc1 f40829s0;
    public final p2 f40830t0;
    public Integer f40831u0;
    public float f40832v0;
    public float f40833w0;
    public float f40834x0;
    public float f40835y0;
    public float f40836z0;

    public m1(p2 p2Var, int i10, TLRPC.User user, f6 f6Var) {
        this(p2Var, i10, user, null, null, f6Var);
    }

    public static void P(m1 m1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m1Var.C0);
        bi.o1 o1Var = new bi.o1(m1Var, 7);
        p2 p2Var = m1Var.f40830t0;
        if (p2Var != null) {
            o1Var.setParentFragment(p2Var);
        }
        new j1(m1Var, o1Var, m1Var.getContext(), m1Var.resourcesProvider, arrayList).show();
    }

    @Override
    public final void D(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.X;
            if (i12 < arrayList.size()) {
                ww0 ww0Var = this.f40815d0;
                ww0Var.a((mx0) arrayList.get(i12), false);
                ww0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((mx0) arrayList.get(i12)).e = i13;
                i13 += ww0Var.getMeasuredHeight();
                i12++;
            } else {
                this.f40816e0 = i13;
                this.container.getLocationOnScreen(this.F0);
                return;
            }
        }
    }

    @Override
    public final void F(aw0 aw0Var) {
        this.Y = UserConfig.selectedAccount;
        s0 s0Var = new s0(getContext(), this.resourcesProvider, false);
        s0Var.a(PremiumPreviewFragment.o0(this.Y, null), new org.telegram.ui.web.c(this, 5), false);
        this.L0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(j6.f17929d7));
        this.L0.addView(view, a6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.Y).isPremium() && !(this instanceof sg.k0)) {
            this.L0.addView(s0Var, a6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            this.L0.setBackgroundColor(getThemedColor(j6.f17998h5));
            aw0Var.addView(this.L0, a6.e(-1, 68, 80));
        }
    }

    public void W(gc1 gc1Var) {
        gc1Var.addView(this.B0, a6.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
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
        m90[] m90VarArr = this.O0;
        if (m90VarArr != null && this.P0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.D0;
            TLRPC.User user = this.Z;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.O0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new g1(this, 0)));
                r6.p(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.C0 != null) {
                String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
                Integer num = this.f40831u0;
                if (num == null) {
                    intValue6 = getThemedColor(j6.f18236u6);
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
                                } else if (stickerSet.documents.get(i10).f17201id == stickerSet.set.thumb_document_id) {
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
                        spannableStringBuilder2.setSpan(new y5(document, this.O0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (stickerSet != null && stickerSet.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new r90(AndroidUtilities.dp(100.0f), this.O0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new pd(this, 9), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.O0[1].setOnLinkPressListener(new l90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            m1.P(m1.this);
                        }
                    });
                    if (document != null) {
                        m90[] m90VarArr2 = this.O0;
                        if (m90VarArr2 != null) {
                            m90VarArr2[1].setText(spannableStringBuilder);
                            if (this.O0[1].getVisibility() != 0) {
                                if (z10) {
                                    this.O0[1].setAlpha(0.0f);
                                    this.O0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.O0[1].animate().alpha(1.0f);
                                    wr wrVar = wr.f28819f;
                                    em.q(alpha, wrVar, 200L);
                                    this.O0[0].animate().alpha(0.0f).setInterpolator(wrVar).setDuration(200L).withEndAction(new g1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new i1(this, 1));
                                    ofFloat.setInterpolator(wrVar);
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
                r6.p(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.E0) {
                m90VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                k kVar = this.f40812a0;
                if (kVar != null) {
                    if (this.f40814c0) {
                        m90 m90Var = m90VarArr[0];
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        String formatString2 = LocaleController.formatString(i11, str, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num2 = this.f40831u0;
                        if (num2 == null) {
                            intValue4 = getThemedColor(j6.f18236u6);
                        } else {
                            intValue4 = num2.intValue();
                        }
                        m90Var.setText(AndroidUtilities.replaceSingleLink(formatString2, intValue4));
                        m90 m90Var2 = this.P0;
                        int i12 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        String formatString3 = LocaleController.formatString(i12, str3);
                        Integer num3 = this.f40831u0;
                        if (num3 == null) {
                            intValue5 = getThemedColor(j6.f18236u6);
                        } else {
                            intValue5 = num3.intValue();
                        }
                        m90Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, intValue5));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f17342id != 777000) {
                        m90 m90Var3 = this.O0[0];
                        String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num4 = this.f40831u0;
                        if (num4 == null) {
                            intValue3 = getThemedColor(j6.f18236u6);
                        } else {
                            intValue3 = num4.intValue();
                        }
                        m90Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, intValue3));
                        r6.p(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    } else {
                        m90 m90Var4 = this.O0[0];
                        String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num5 = this.f40831u0;
                        if (num5 == null) {
                            intValue2 = getThemedColor(j6.f18236u6);
                        } else {
                            intValue2 = num5.intValue();
                        }
                        m90Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, intValue2));
                        r6.p(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.f40813b0;
                    if (starGift != null) {
                        m90VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.O0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            r6.p(R.string.Gift2PremiumSubtitle, this.P0);
                        }
                        this.P0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        m90VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        r6.p(R.string.TelegramPremiumSubscribedSubtitle, this.P0);
                    } else {
                        m90 m90Var5 = m90VarArr[0];
                        String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                        Integer num6 = this.f40831u0;
                        if (num6 == null) {
                            intValue = getThemedColor(j6.f18236u6);
                        } else {
                            intValue = num6.intValue();
                        }
                        m90Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, intValue));
                        r6.p(R.string.TelegramPremiumUserDialogSubtitle, this.P0);
                    }
                }
            }
            try {
                m90 m90Var6 = this.O0[0];
                m90Var6.setText(Emoji.replaceEmoji(m90Var6.getText(), this.O0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void b0() {
        int i10 = this.f40817f0;
        int i11 = i10 + 1;
        this.f40817f0 = i11;
        this.f40818g0 = i10;
        this.f40821j0 = i11;
        int size = this.X.size() + i11;
        this.f40822k0 = size;
        this.f40817f0 = size + 1;
        this.f40823l0 = size;
        if (!UserConfig.getInstance(this.Y).isPremium() && this.f40812a0 == null) {
            int i12 = this.f40817f0;
            this.f40817f0 = i12 + 1;
            this.m0 = i12;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.C0) != null && inputStickerSet.f17215id == ((Long) objArr[0]).longValue()) {
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
        y00 y00Var = this.f40825o0;
        if (y00Var.f29209c) {
            y00Var.animate().alpha(0.0f).setDuration(150L).start();
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
                view = this.f40828r0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f40832v0, this.f40833w0};
            this.A0.getMatrix().mapPoints(fArr);
            View view4 = this.A0;
            if (view4 instanceof l5) {
                drawable = ((l5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.t1) {
                drawable = ((org.telegram.ui.Cells.t1) view4).f20136fc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.F0;
            float f7 = (-iArr[0]) + this.f40834x0 + fArr[0];
            float f10 = (-iArr[1]) + this.f40835y0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f40830t0.getParentLayout().getView();
                f7 += view5.getX() + view5.getPaddingLeft();
                f10 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f40836z0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f11 = measuredHeight / intrinsicWidth;
            float f12 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f7, measuredWidth, wr.h.getInterpolation(this.G0));
            float lerp2 = AndroidUtilities.lerp(f10, measuredHeight2, this.G0);
            float f13 = this.f40836z0;
            float f14 = this.G0;
            float f15 = (f11 * f14) + ((1.0f - f14) * f13);
            canvas.save();
            canvas.scale(f15, f15, lerp, lerp2);
            int i11 = (int) lerp;
            int i12 = (int) lerp2;
            drawable.setBounds(em.w(2, i11, drawable), em.e(2, i12, drawable), em.B(2, i11, drawable), em.z(2, i12, drawable));
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
        this.f40829s0.invalidate();
        View view = this.A0;
        if (view instanceof l5) {
            drawable = ((l5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            n5 n5Var = t1Var.f20136fc;
            t1Var.a3();
            drawable = n5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.A0;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view2).a3();
        } else {
            view2.invalidate();
        }
        eg0 eg0Var = this.f40828r0;
        if (eg0Var != null) {
            eg0Var.j(100L);
        }
        this.I0.addUpdateListener(new i1(this, 0));
        this.I0.addListener(new vv0(18, this, drawable));
        this.I0.setDuration(600L);
        this.I0.setInterpolator(wr.h);
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
            AndroidUtilities.runOnUIThread(new g1(this, 1), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        eg0 eg0Var = this.f40828r0;
        if (eg0Var != null) {
            eg0Var.setDialogVisible(true);
        }
        this.f40827q0.setPaused(true);
        dialog.setOnDismissListener(new gg.o(this, 8));
        dialog.show();
        return true;
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        return new l1(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public m1(p2 p2Var, int i10, TLRPC.User user, k kVar, TL_stars.StarGift starGift, f6 f6Var) {
        super(p2Var, false, false, f6Var);
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.F0 = new int[2];
        this.G0 = 0.0f;
        fixNavigationBar();
        this.f40830t0 = p2Var;
        this.v = 0.26f;
        this.Z = user;
        this.Y = i10;
        this.f40812a0 = kVar;
        this.f40813b0 = starGift;
        this.f40815d0 = new ww0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (kVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.L0.setVisibility(8);
        }
        c1 c1Var = new c1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.f40826p0 = c1Var;
        c1Var.f40696m = true;
        c1Var.f40698o = 1.0f;
        c1Var.f40699p = 0.0f;
        c1Var.f40700q = 0.0f;
        c1Var.f40688b = 0.0f;
        c1Var.f40689c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new jn0(this, i10, p2Var, 1));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        y00 y00Var = new y00(getContext());
        this.f40825o0 = y00Var;
        this.container.addView(y00Var, a6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.M0 = frameLayout;
        this.containerView.addView(frameLayout, a6.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
