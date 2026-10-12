package sg;

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
import bi.o3;
import bi.t4;
import di.zb;
import java.util.ArrayList;
import ji.o4;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ax0;
import org.telegram.ui.ic1;
import org.telegram.ui.jg0;
import org.telegram.ui.qx0;
import w7.a6;
public class m1 extends db implements NotificationCenter.NotificationCenterDelegate {
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
    public da0[] O0;
    public da0 P0;
    public final ArrayList X;
    public int Y;
    public final TLRPC.User Z;
    public final k f45252a0;
    public final TL_stars.StarGift f45253b0;
    public boolean f45254c0;
    public final ax0 f45255d0;
    public int f45256e0;
    public int f45257f0;
    public int f45258g0;
    public int f45259h0;
    public int f45260i0;
    public int f45261j0;
    public int f45262k0;
    public int f45263l0;
    public int m0;
    public int f45264n0;
    public final d10 f45265o0;
    public final a1 f45266p0;
    public fi.f f45267q0;
    public jg0 f45268r0;
    public ic1 f45269s0;
    public final m2 f45270t0;
    public Integer f45271u0;
    public float f45272v0;
    public float f45273w0;
    public float f45274x0;
    public float f45275y0;
    public float f45276z0;

    public m1(m2 m2Var, int i10, TLRPC.User user, c6 c6Var) {
        this(m2Var, i10, user, null, null, c6Var);
    }

    public static void Q(m1 m1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m1Var.C0);
        o3 o3Var = new o3(m1Var, 9);
        m2 m2Var = m1Var.f45270t0;
        if (m2Var != null) {
            o3Var.setParentFragment(m2Var);
        }
        new h1(m1Var, o3Var, m1Var.getContext(), m1Var.resourcesProvider, arrayList).show();
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    @Override
    public final void F(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.X;
            if (i12 < arrayList.size()) {
                ax0 ax0Var = this.f45255d0;
                ax0Var.a((qx0) arrayList.get(i12), false);
                ax0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((qx0) arrayList.get(i12)).e = i13;
                i13 += ax0Var.getMeasuredHeight();
                i12++;
            } else {
                this.f45256e0 = i13;
                this.container.getLocationOnScreen(this.F0);
                return;
            }
        }
    }

    @Override
    public final void H(ow0 ow0Var) {
        this.Y = UserConfig.selectedAccount;
        q0 q0Var = new q0(getContext(), this.resourcesProvider, false);
        q0Var.a(PremiumPreviewFragment.o0(this.Y, null), new o4(this, 11), false);
        this.L0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(g6.f19902d7));
        this.L0.addView(view, a6.d(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.Y).isPremium() && !(this instanceof ug.j0)) {
            this.L0.addView(q0Var, a6.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            this.L0.setBackgroundColor(getThemedColor(g6.f19972h5));
            ow0Var.addView(this.L0, a6.e(-1, 68, 80));
        }
    }

    public void X(ic1 ic1Var) {
        ic1Var.addView(this.B0, a6.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int Y() {
        return 0;
    }

    public View a0(Context context, int i10) {
        return null;
    }

    public void b0(boolean z10) {
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
        da0[] da0VarArr = this.O0;
        if (da0VarArr != null && this.P0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.D0;
            TLRPC.User user = this.Z;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.O0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new e1(this, 0)));
                org.telegram.ui.Cells.d0.q(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.C0 != null) {
                String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
                Integer num = this.f45271u0;
                if (num == null) {
                    intValue6 = getThemedColor(g6.f20216u6);
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
                                } else if (stickerSet.documents.get(i10).f19222id == stickerSet.set.thumb_document_id) {
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
                        spannableStringBuilder2.setSpan(new b6(document, this.O0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (stickerSet != null && stickerSet.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new ia0(AndroidUtilities.dp(100.0f), this.O0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new zb(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.O0[1].setOnLinkPressListener(new ca0() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            m1.Q(m1.this);
                        }
                    });
                    if (document != null) {
                        da0[] da0VarArr2 = this.O0;
                        if (da0VarArr2 != null) {
                            da0VarArr2[1].setText(spannableStringBuilder);
                            if (this.O0[1].getVisibility() != 0) {
                                if (z10) {
                                    this.O0[1].setAlpha(0.0f);
                                    this.O0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.O0[1].animate().alpha(1.0f);
                                    es esVar = es.f24771f;
                                    yh.s(alpha, esVar, 200L);
                                    this.O0[0].animate().alpha(0.0f).setInterpolator(esVar).setDuration(200L).withEndAction(new e1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new g1(this, 1));
                                    ofFloat.setInterpolator(esVar);
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
                org.telegram.ui.Cells.d0.q(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.E0) {
                da0VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                k kVar = this.f45252a0;
                if (kVar != null) {
                    if (this.f45254c0) {
                        da0 da0Var = da0VarArr[0];
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        String formatString2 = LocaleController.formatString(i11, str, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num2 = this.f45271u0;
                        if (num2 == null) {
                            intValue4 = getThemedColor(g6.f20216u6);
                        } else {
                            intValue4 = num2.intValue();
                        }
                        da0Var.setText(AndroidUtilities.replaceSingleLink(formatString2, intValue4));
                        da0 da0Var2 = this.P0;
                        int i12 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        String formatString3 = LocaleController.formatString(i12, str3);
                        Integer num3 = this.f45271u0;
                        if (num3 == null) {
                            intValue5 = getThemedColor(g6.f20216u6);
                        } else {
                            intValue5 = num3.intValue();
                        }
                        da0Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, intValue5));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f19363id != 777000) {
                        da0 da0Var3 = this.O0[0];
                        String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num4 = this.f45271u0;
                        if (num4 == null) {
                            intValue3 = getThemedColor(g6.f20216u6);
                        } else {
                            intValue3 = num4.intValue();
                        }
                        da0Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, intValue3));
                        org.telegram.ui.Cells.d0.q(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    } else {
                        da0 da0Var4 = this.O0[0];
                        String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num5 = this.f45271u0;
                        if (num5 == null) {
                            intValue2 = getThemedColor(g6.f20216u6);
                        } else {
                            intValue2 = num5.intValue();
                        }
                        da0Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, intValue2));
                        org.telegram.ui.Cells.d0.q(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.f45253b0;
                    if (starGift != null) {
                        da0VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.O0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            org.telegram.ui.Cells.d0.q(R.string.Gift2PremiumSubtitle, this.P0);
                        }
                        this.P0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        da0VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        org.telegram.ui.Cells.d0.q(R.string.TelegramPremiumSubscribedSubtitle, this.P0);
                    } else {
                        da0 da0Var5 = da0VarArr[0];
                        String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                        Integer num6 = this.f45271u0;
                        if (num6 == null) {
                            intValue = getThemedColor(g6.f20216u6);
                        } else {
                            intValue = num6.intValue();
                        }
                        da0Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, intValue));
                        org.telegram.ui.Cells.d0.q(R.string.TelegramPremiumUserDialogSubtitle, this.P0);
                    }
                }
            }
            try {
                da0 da0Var6 = this.O0[0];
                da0Var6.setText(Emoji.replaceEmoji(da0Var6.getText(), this.O0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void c0() {
        int i10 = this.f45257f0;
        int i11 = i10 + 1;
        this.f45257f0 = i11;
        this.f45258g0 = i10;
        this.f45261j0 = i11;
        int size = this.X.size() + i11;
        this.f45262k0 = size;
        this.f45257f0 = size + 1;
        this.f45263l0 = size;
        if (!UserConfig.getInstance(this.Y).isPremium() && this.f45252a0 == null) {
            int i12 = this.f45257f0;
            this.f45257f0 = i12 + 1;
            this.m0 = i12;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.C0) != null && inputStickerSet.f19236id == ((Long) objArr[0]).longValue()) {
            b0(true);
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
        d10 d10Var = this.f45265o0;
        if (d10Var.f24263c) {
            d10Var.animate().alpha(0.0f).setDuration(150L).start();
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
                view = this.f45268r0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f45272v0, this.f45273w0};
            this.A0.getMatrix().mapPoints(fArr);
            View view4 = this.A0;
            if (view4 instanceof h5) {
                drawable = ((h5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.u1) {
                drawable = ((org.telegram.ui.Cells.u1) view4).fc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.F0;
            float f7 = (-iArr[0]) + this.f45274x0 + fArr[0];
            float f10 = (-iArr[1]) + this.f45275y0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f45270t0.getParentLayout().getView();
                f7 += view5.getX() + view5.getPaddingLeft();
                f10 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f45276z0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f11 = measuredHeight / intrinsicWidth;
            float f12 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f7, measuredWidth, es.h.getInterpolation(this.G0));
            float lerp2 = AndroidUtilities.lerp(f10, measuredHeight2, this.G0);
            float f13 = this.f45276z0;
            float f14 = this.G0;
            float f15 = (f11 * f14) + ((1.0f - f14) * f13);
            canvas.save();
            canvas.scale(f15, f15, lerp, lerp2);
            int i11 = (int) lerp;
            int i12 = (int) lerp2;
            drawable.setBounds(org.telegram.ui.Cells.d0.u(2, i11, drawable), org.telegram.ui.Cells.d0.d(2, i12, drawable), org.telegram.ui.Cells.d0.y(2, i11, drawable), org.telegram.ui.Cells.d0.x(2, i12, drawable));
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
        this.f45269s0.invalidate();
        View view = this.A0;
        if (view instanceof h5) {
            drawable = ((h5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            q5 q5Var = u1Var.fc;
            u1Var.a3();
            drawable = q5Var;
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
        jg0 jg0Var = this.f45268r0;
        if (jg0Var != null) {
            jg0Var.m(100L);
        }
        this.I0.addUpdateListener(new g1(this, 0));
        this.I0.addListener(new ql0(22, this, drawable));
        this.I0.setDuration(600L);
        this.I0.setInterpolator(es.h);
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
            AndroidUtilities.runOnUIThread(new e1(this, 1), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        jg0 jg0Var = this.f45268r0;
        if (jg0Var != null) {
            jg0Var.setDialogVisible(true);
        }
        this.f45267q0.setPaused(true);
        dialog.setOnDismissListener(new t4(this, 10));
        dialog.show();
        return true;
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        return new l1(this);
    }

    public m1(m2 m2Var, int i10, TLRPC.User user, k kVar, TL_stars.StarGift starGift, c6 c6Var) {
        super(m2Var, false, false, c6Var);
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.F0 = new int[2];
        this.G0 = 0.0f;
        fixNavigationBar();
        this.f45270t0 = m2Var;
        this.v = 0.26f;
        this.Z = user;
        this.Y = i10;
        this.f45252a0 = kVar;
        this.f45253b0 = starGift;
        this.f45255d0 = new ax0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (kVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.L0.setVisibility(8);
        }
        a1 a1Var = new a1(g6.Lj, g6.Mj, g6.Nj, g6.Oj, null);
        this.f45266p0 = a1Var;
        a1Var.f45123m = true;
        a1Var.f45125o = 1.0f;
        a1Var.f45126p = 0.0f;
        a1Var.f45127q = 0.0f;
        a1Var.f45115b = 0.0f;
        a1Var.f45116c = 0.0f;
        c0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new co0(this, i10, m2Var, 1));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        d10 d10Var = new d10(getContext());
        this.f45265o0 = d10Var;
        this.container.addView(d10Var, a6.d(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.M0 = frameLayout;
        this.containerView.addView(frameLayout, a6.e(-1, 140, 87));
    }

    public void Z(View view) {
    }

    public void W(int i10, View view) {
    }
}
