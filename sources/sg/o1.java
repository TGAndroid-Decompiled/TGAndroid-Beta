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
import bi.l3;
import bi.r4;
import di.ec;
import java.util.ArrayList;
import ji.m4;
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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.cc1;
import org.telegram.ui.eg0;
import org.telegram.ui.kx0;
import org.telegram.ui.uw0;
import w7.x5;
public class o1 extends bb implements NotificationCenter.NotificationCenterDelegate {
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
    public d90[] O0;
    public d90 P0;
    public final ArrayList X;
    public int Y;
    public final TLRPC.User Z;
    public final k f46194a0;
    public final TL_stars.StarGift f46195b0;
    public boolean f46196c0;
    public final uw0 f46197d0;
    public int f46198e0;
    public int f46199f0;
    public int f46200g0;
    public int f46201h0;
    public int f46202i0;
    public int f46203j0;
    public int f46204k0;
    public int f46205l0;
    public int m0;
    public int f46206n0;
    public final r00 f46207o0;
    public final c1 f46208p0;
    public fi.g f46209q0;
    public eg0 f46210r0;
    public cc1 f46211s0;
    public final n2 f46212t0;
    public Integer f46213u0;
    public float f46214v0;
    public float f46215w0;
    public float f46216x0;
    public float f46217y0;
    public float f46218z0;

    public o1(n2 n2Var, int i10, TLRPC.User user, f6 f6Var) {
        this(n2Var, i10, user, null, null, f6Var);
    }

    public static void P(o1 o1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o1Var.C0);
        l3 l3Var = new l3(o1Var, 9);
        n2 n2Var = o1Var.f46212t0;
        if (n2Var != null) {
            l3Var.setParentFragment(n2Var);
        }
        new j1(o1Var, l3Var, o1Var.getContext(), o1Var.resourcesProvider, arrayList).show();
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
                uw0 uw0Var = this.f46197d0;
                uw0Var.a((kx0) arrayList.get(i12), false);
                uw0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((kx0) arrayList.get(i12)).f38150e = i13;
                i13 += uw0Var.getMeasuredHeight();
                i12++;
            } else {
                this.f46198e0 = i13;
                this.container.getLocationOnScreen(this.F0);
                return;
            }
        }
    }

    @Override
    public final void G(ov0 ov0Var) {
        this.Y = UserConfig.selectedAccount;
        r0 r0Var = new r0(getContext(), this.resourcesProvider, false);
        r0Var.a(PremiumPreviewFragment.o0(this.Y, null), new m4(this, 11), false);
        this.L0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(j6.f20664d7));
        this.L0.addView(view, x5.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.Y).isPremium() && !(this instanceof ug.k0)) {
            this.L0.addView(r0Var, x5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            this.L0.setBackgroundColor(getThemedColor(j6.f20734h5));
            ov0Var.addView(this.L0, x5.e(-1, 68, 80));
        }
    }

    public void W(cc1 cc1Var) {
        cc1Var.addView(this.B0, x5.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
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
        d90[] d90VarArr = this.O0;
        if (d90VarArr != null && this.P0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.D0;
            TLRPC.User user = this.Z;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.O0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new g1(this, 0)));
                p6.p(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.C0 != null) {
                String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
                Integer num = this.f46213u0;
                if (num == null) {
                    intValue6 = getThemedColor(j6.f20972u6);
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
                                } else if (stickerSet.documents.get(i10).f19875id == stickerSet.set.thumb_document_id) {
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
                        spannableStringBuilder2.setSpan(new i90(AndroidUtilities.dp(100.0f), this.O0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new ec(this, 9), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.O0[1].setOnLinkPressListener(new c90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            o1.P(o1.this);
                        }
                    });
                    if (document != null) {
                        d90[] d90VarArr2 = this.O0;
                        if (d90VarArr2 != null) {
                            d90VarArr2[1].setText(spannableStringBuilder);
                            if (this.O0[1].getVisibility() != 0) {
                                if (z10) {
                                    this.O0[1].setAlpha(0.0f);
                                    this.O0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.O0[1].animate().alpha(1.0f);
                                    pr prVar = pr.f29466f;
                                    wl.q(alpha, prVar, 200L);
                                    this.O0[0].animate().alpha(0.0f).setInterpolator(prVar).setDuration(200L).withEndAction(new g1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new i1(this, 1));
                                    ofFloat.setInterpolator(prVar);
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
                p6.p(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.E0) {
                d90VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                k kVar = this.f46194a0;
                if (kVar != null) {
                    if (this.f46196c0) {
                        d90 d90Var = d90VarArr[0];
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        String formatString2 = LocaleController.formatString(i11, str, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num2 = this.f46213u0;
                        if (num2 == null) {
                            intValue4 = getThemedColor(j6.f20972u6);
                        } else {
                            intValue4 = num2.intValue();
                        }
                        d90Var.setText(AndroidUtilities.replaceSingleLink(formatString2, intValue4));
                        d90 d90Var2 = this.P0;
                        int i12 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        String formatString3 = LocaleController.formatString(i12, str3);
                        Integer num3 = this.f46213u0;
                        if (num3 == null) {
                            intValue5 = getThemedColor(j6.f20972u6);
                        } else {
                            intValue5 = num3.intValue();
                        }
                        d90Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, intValue5));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f20016id != 777000) {
                        d90 d90Var3 = this.O0[0];
                        String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num4 = this.f46213u0;
                        if (num4 == null) {
                            intValue3 = getThemedColor(j6.f20972u6);
                        } else {
                            intValue3 = num4.intValue();
                        }
                        d90Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, intValue3));
                        p6.p(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    } else {
                        d90 d90Var4 = this.O0[0];
                        String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num5 = this.f46213u0;
                        if (num5 == null) {
                            intValue2 = getThemedColor(j6.f20972u6);
                        } else {
                            intValue2 = num5.intValue();
                        }
                        d90Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, intValue2));
                        p6.p(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.f46195b0;
                    if (starGift != null) {
                        d90VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.O0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            p6.p(R.string.Gift2PremiumSubtitle, this.P0);
                        }
                        this.P0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        d90VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        p6.p(R.string.TelegramPremiumSubscribedSubtitle, this.P0);
                    } else {
                        d90 d90Var5 = d90VarArr[0];
                        String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                        Integer num6 = this.f46213u0;
                        if (num6 == null) {
                            intValue = getThemedColor(j6.f20972u6);
                        } else {
                            intValue = num6.intValue();
                        }
                        d90Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, intValue));
                        p6.p(R.string.TelegramPremiumUserDialogSubtitle, this.P0);
                    }
                }
            }
            try {
                d90 d90Var6 = this.O0[0];
                d90Var6.setText(Emoji.replaceEmoji(d90Var6.getText(), this.O0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void b0() {
        int i10 = this.f46199f0;
        int i11 = i10 + 1;
        this.f46199f0 = i11;
        this.f46200g0 = i10;
        this.f46203j0 = i11;
        int size = this.X.size() + i11;
        this.f46204k0 = size;
        this.f46199f0 = size + 1;
        this.f46205l0 = size;
        if (!UserConfig.getInstance(this.Y).isPremium() && this.f46194a0 == null) {
            int i12 = this.f46199f0;
            this.f46199f0 = i12 + 1;
            this.m0 = i12;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.C0) != null && inputStickerSet.f19889id == ((Long) objArr[0]).longValue()) {
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
        r00 r00Var = this.f46207o0;
        if (r00Var.f29869c) {
            r00Var.animate().alpha(0.0f).setDuration(150L).start();
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
                view = this.f46210r0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f46214v0, this.f46215w0};
            this.A0.getMatrix().mapPoints(fArr);
            View view4 = this.A0;
            if (view4 instanceof j5) {
                drawable = ((j5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.t1) {
                drawable = ((org.telegram.ui.Cells.t1) view4).f22938fc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.F0;
            float f7 = (-iArr[0]) + this.f46216x0 + fArr[0];
            float f10 = (-iArr[1]) + this.f46217y0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f46212t0.getParentLayout().getView();
                f7 += view5.getX() + view5.getPaddingLeft();
                f10 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f46218z0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f11 = measuredHeight / intrinsicWidth;
            float f12 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f7, measuredWidth, pr.h.getInterpolation(this.G0));
            float lerp2 = AndroidUtilities.lerp(f10, measuredHeight2, this.G0);
            float f13 = this.f46218z0;
            float f14 = this.G0;
            float f15 = (f11 * f14) + ((1.0f - f14) * f13);
            canvas.save();
            canvas.scale(f15, f15, lerp, lerp2);
            int i11 = (int) lerp;
            int i12 = (int) lerp2;
            drawable.setBounds(wl.w(2, i11, drawable), wl.e(2, i12, drawable), wl.B(2, i11, drawable), wl.z(2, i12, drawable));
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
        this.f46211s0.invalidate();
        View view = this.A0;
        if (view instanceof j5) {
            drawable = ((j5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            o5 o5Var = t1Var.f22938fc;
            t1Var.a3();
            drawable = o5Var;
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
        eg0 eg0Var = this.f46210r0;
        if (eg0Var != null) {
            eg0Var.j(100L);
        }
        this.I0.addUpdateListener(new i1(this, 0));
        this.I0.addListener(new pk0(21, this, drawable));
        this.I0.setDuration(600L);
        this.I0.setInterpolator(pr.h);
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
        eg0 eg0Var = this.f46210r0;
        if (eg0Var != null) {
            eg0Var.setDialogVisible(true);
        }
        this.f46209q0.setPaused(true);
        dialog.setOnDismissListener(new r4(this, 10));
        dialog.show();
        return true;
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        return new n1(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public o1(n2 n2Var, int i10, TLRPC.User user, k kVar, TL_stars.StarGift starGift, f6 f6Var) {
        super(n2Var, false, false, f6Var);
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.F0 = new int[2];
        this.G0 = 0.0f;
        fixNavigationBar();
        this.f46212t0 = n2Var;
        this.v = 0.26f;
        this.Z = user;
        this.Y = i10;
        this.f46194a0 = kVar;
        this.f46195b0 = starGift;
        this.f46197d0 = new uw0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (kVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.L0.setVisibility(8);
        }
        c1 c1Var = new c1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.f46208p0 = c1Var;
        c1Var.f46041m = true;
        c1Var.f46043o = 1.0f;
        c1Var.f46044p = 0.0f;
        c1Var.f46045q = 0.0f;
        c1Var.f46032b = 0.0f;
        c1Var.f46033c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new zm0(this, i10, n2Var, 1));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        r00 r00Var = new r00(getContext());
        this.f46207o0 = r00Var;
        this.container.addView(r00Var, x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.M0 = frameLayout;
        this.containerView.addView(frameLayout, x5.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
