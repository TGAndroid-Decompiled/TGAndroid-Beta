package zf;

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
import g7.e6;
import java.util.ArrayList;
import kh.lb;
import kh.x8;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.qv0;
import org.telegram.ui.ta1;
public class k1 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public final int[] B0;
    public float C0;
    public boolean D0;
    public ValueAnimator E0;
    public boolean F0;
    public boolean G0;
    public FrameLayout H0;
    public final FrameLayout I0;
    public FrameLayout J0;
    public l80[] K0;
    public l80 L0;
    public final ArrayList T;
    public int U;
    public final TLRPC.User V;
    public final k W;
    public final TL_stars.StarGift X;
    public boolean Y;
    public final qv0 Z;
    public int f50567a0;
    public int f50568b0;
    public int f50569c0;
    public int f50570d0;
    public int f50571e0;
    public int f50572f0;
    public int f50573g0;
    public int f50574h0;
    public int f50575i0;
    public int f50576j0;
    public final c00 f50577k0;
    public final z0 f50578l0;
    public mh.f m0;
    public dg.q f50579n0;
    public ta1 f50580o0;
    public final o2 f50581p0;
    public Integer f50582q0;
    public float f50583r0;
    public float f50584s0;
    public float f50585t0;
    public float f50586u0;
    public float f50587v0;
    public View f50588w0;
    public View f50589x0;
    public TLRPC.InputStickerSet f50590y0;
    public TLRPC.TL_emojiStatusCollectible f50591z0;

    public k1(o2 o2Var, int i9, TLRPC.User user, b6 b6Var) {
        this(o2Var, i9, user, null, null, b6Var);
    }

    public static void O(k1 k1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(k1Var.f50590y0);
        bg.i1 i1Var = new bg.i1(k1Var, 12);
        o2 o2Var = k1Var.f50581p0;
        if (o2Var != null) {
            i1Var.setParentFragment(o2Var);
        }
        new g1(k1Var, i1Var, k1Var.getContext(), k1Var.resourcesProvider, arrayList).show();
    }

    @Override
    public final void D(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.T;
            if (i11 < arrayList.size()) {
                qv0 qv0Var = this.Z;
                qv0Var.a((gw0) arrayList.get(i11), false);
                qv0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((gw0) arrayList.get(i11)).f38613e = i12;
                i12 += qv0Var.getMeasuredHeight();
                i11++;
            } else {
                this.f50567a0 = i12;
                this.container.getLocationOnScreen(this.B0);
                return;
            }
        }
    }

    @Override
    public final void F(xu0 xu0Var) {
        this.U = UserConfig.selectedAccount;
        p0 p0Var = new p0(getContext(), this.resourcesProvider, false);
        p0Var.a(PremiumPreviewFragment.n0(this.U, null), new x8(this, 28), false);
        this.H0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(f6.f23002d7));
        this.H0.addView(view, e6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.U).isPremium() && !(this instanceof bg.t1)) {
            this.H0.addView(p0Var, e6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            this.H0.setBackgroundColor(getThemedColor(f6.f23072h5));
            xu0Var.addView(this.H0, e6.e(-1, 68, 80));
        }
    }

    public void V(ta1 ta1Var) {
        ta1Var.addView(this.f50589x0, e6.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int W() {
        return 0;
    }

    public View Y(Context context, int i9) {
        return null;
    }

    public void Z(boolean z10) {
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
        l80[] l80VarArr = this.K0;
        if (l80VarArr != null && this.L0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f50591z0;
            TLRPC.User user = this.V;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.K0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new d1(this, 0)));
                j2.p(R.string.TelegramPremiumUserStatusDialogSubtitle, this.L0);
            } else if (this.f50590y0 != null) {
                String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
                Integer num = this.f50582q0;
                if (num == null) {
                    intValue6 = getThemedColor(f6.f23303u6);
                } else {
                    intValue6 = num.intValue();
                }
                CharSequence replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, intValue6);
                try {
                    replaceSingleLink = Emoji.replaceEmoji(replaceSingleLink, this.K0[0].getPaint().getFontMetricsInt(), false);
                } catch (Exception unused) {
                }
                if (replaceSingleLink instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) replaceSingleLink;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(replaceSingleLink);
                }
                int indexOf = replaceSingleLink.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.U).getStickerSet(this.f50590y0, false);
                    if (stickerSet != null && !stickerSet.documents.isEmpty()) {
                        document = stickerSet.documents.get(0);
                        if (stickerSet.set != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= stickerSet.documents.size()) {
                                    break;
                                } else if (stickerSet.documents.get(i9).f22386id == stickerSet.set.thumb_document_id) {
                                    document = stickerSet.documents.get(i9);
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                        }
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new t5(document, this.K0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (stickerSet != null && stickerSet.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new q80(AndroidUtilities.dp(100.0f), this.K0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new lb(this, 9), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.K0[1].setOnLinkPressListener(new k80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            k1.O(k1.this);
                        }
                    });
                    if (document != null) {
                        l80[] l80VarArr2 = this.K0;
                        if (l80VarArr2 != null) {
                            l80VarArr2[1].setText(spannableStringBuilder);
                            if (this.K0[1].getVisibility() != 0) {
                                if (z10) {
                                    this.K0[1].setAlpha(0.0f);
                                    this.K0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.K0[1].animate().alpha(1.0f);
                                    gr grVar = gr.f28844f;
                                    ll.r(alpha, grVar, 200L);
                                    this.K0[0].animate().alpha(0.0f).setInterpolator(grVar).setDuration(200L).withEndAction(new d1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new f1(this, 1));
                                    ofFloat.setInterpolator(grVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.K0[1].setAlpha(1.0f);
                                    this.K0[1].setVisibility(0);
                                    this.K0[0].setAlpha(0.0f);
                                    this.K0[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.K0[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                j2.p(R.string.TelegramPremiumUserStatusDialogSubtitle, this.L0);
            } else if (this.A0) {
                l80VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.L0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                k kVar = this.W;
                if (kVar != null) {
                    if (this.Y) {
                        l80 l80Var = l80VarArr[0];
                        int i10 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        String formatString2 = LocaleController.formatString(i10, str, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num2 = this.f50582q0;
                        if (num2 == null) {
                            intValue4 = getThemedColor(f6.f23303u6);
                        } else {
                            intValue4 = num2.intValue();
                        }
                        l80Var.setText(AndroidUtilities.replaceSingleLink(formatString2, intValue4));
                        l80 l80Var2 = this.L0;
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        String formatString3 = LocaleController.formatString(i11, str3);
                        Integer num3 = this.f50582q0;
                        if (num3 == null) {
                            intValue5 = getThemedColor(f6.f23303u6);
                        } else {
                            intValue5 = num3.intValue();
                        }
                        l80Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, intValue5));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f22527id != 777000) {
                        l80 l80Var3 = this.K0[0];
                        String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num4 = this.f50582q0;
                        if (num4 == null) {
                            intValue3 = getThemedColor(f6.f23303u6);
                        } else {
                            intValue3 = num4.intValue();
                        }
                        l80Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, intValue3));
                        j2.p(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.L0);
                    } else {
                        l80 l80Var4 = this.K0[0];
                        String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                        Integer num5 = this.f50582q0;
                        if (num5 == null) {
                            intValue2 = getThemedColor(f6.f23303u6);
                        } else {
                            intValue2 = num5.intValue();
                        }
                        l80Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, intValue2));
                        j2.p(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.L0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.X;
                    if (starGift != null) {
                        l80VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.K0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.L0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            j2.p(R.string.Gift2PremiumSubtitle, this.L0);
                        }
                        this.L0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        l80VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        j2.p(R.string.TelegramPremiumSubscribedSubtitle, this.L0);
                    } else {
                        l80 l80Var5 = l80VarArr[0];
                        String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                        Integer num6 = this.f50582q0;
                        if (num6 == null) {
                            intValue = getThemedColor(f6.f23303u6);
                        } else {
                            intValue = num6.intValue();
                        }
                        l80Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, intValue));
                        j2.p(R.string.TelegramPremiumUserDialogSubtitle, this.L0);
                    }
                }
            }
            try {
                l80 l80Var6 = this.K0[0];
                l80Var6.setText(Emoji.replaceEmoji(l80Var6.getText(), this.K0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void a0() {
        int i9 = this.f50568b0;
        int i10 = i9 + 1;
        this.f50568b0 = i10;
        this.f50569c0 = i9;
        this.f50572f0 = i10;
        int size = this.T.size() + i10;
        this.f50573g0 = size;
        this.f50568b0 = size + 1;
        this.f50574h0 = size;
        if (!UserConfig.getInstance(this.U).isPremium() && this.W == null) {
            int i11 = this.f50568b0;
            this.f50568b0 = i11 + 1;
            this.f50575i0 = i11;
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i9 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.f50590y0) != null && inputStickerSet.f22400id == ((Long) objArr[0]).longValue()) {
            Z(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.E0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c00 c00Var = this.f50577k0;
        if (c00Var.f27322c) {
            c00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view;
        Drawable drawable;
        int i9;
        View view2 = this.f50589x0;
        if (view2 != null) {
            if (this.D0) {
                i9 = 4;
            } else {
                i9 = 0;
            }
            view2.setVisibility(i9);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.f50588w0 != null && this.D0) {
            View view3 = this.f50589x0;
            if (view3 == null) {
                view = this.f50579n0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f50583r0, this.f50584s0};
            this.f50588w0.getMatrix().mapPoints(fArr);
            View view4 = this.f50588w0;
            if (view4 instanceof h5) {
                drawable = ((h5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.t1) {
                drawable = ((org.telegram.ui.Cells.t1) view4).f25325bc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.B0;
            float f10 = (-iArr[0]) + this.f50585t0 + fArr[0];
            float f11 = (-iArr[1]) + this.f50586u0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f50581p0.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f50587v0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f10, measuredWidth, gr.h.getInterpolation(this.C0));
            float lerp2 = AndroidUtilities.lerp(f11, measuredHeight2, this.C0);
            float f14 = this.f50587v0;
            float f15 = this.C0;
            float f16 = (f12 * f15) + ((1.0f - f15) * f14);
            canvas.save();
            canvas.scale(f16, f16, lerp, lerp2);
            int i10 = (int) lerp;
            int i11 = (int) lerp2;
            drawable.setBounds(ll.x(2, i10, drawable), ll.e(2, i11, drawable), ll.B(2, i10, drawable), ll.z(2, i11, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.clamp(this.C0, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float lerp3 = AndroidUtilities.lerp(f13, 1.0f, this.C0);
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
        if (this.f50588w0 == null) {
            return false;
        }
        this.E0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C0 = 0.0f;
        this.D0 = true;
        this.f50580o0.invalidate();
        View view = this.f50588w0;
        if (view instanceof h5) {
            drawable = ((h5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            i5 i5Var = t1Var.f25325bc;
            t1Var.a3();
            drawable = i5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f50588w0;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view2).a3();
        } else {
            view2.invalidate();
        }
        dg.q qVar = this.f50579n0;
        if (qVar != null) {
            qVar.j(100L);
        }
        this.E0.addUpdateListener(new f1(this, 0));
        this.E0.addListener(new su0(23, this, drawable));
        this.E0.setDuration(600L);
        this.E0.setInterpolator(gr.h);
        this.E0.start();
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
        if (this.F0) {
            AndroidUtilities.runOnUIThread(new d1(this, 1), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        dg.q qVar = this.f50579n0;
        if (qVar != null) {
            qVar.setDialogVisible(true);
        }
        this.m0.setPaused(true);
        dialog.setOnDismissListener(new eh.l(this, 14));
        dialog.show();
        return true;
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        return new j1(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public k1(o2 o2Var, int i9, TLRPC.User user, k kVar, TL_stars.StarGift starGift, b6 b6Var) {
        super(o2Var, false, false, b6Var);
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.B0 = new int[2];
        this.C0 = 0.0f;
        fixNavigationBar();
        this.f50581p0 = o2Var;
        this.v = 0.26f;
        this.V = user;
        this.U = i9;
        this.W = kVar;
        this.X = starGift;
        this.Z = new qv0(getContext(), null);
        PremiumPreviewFragment.m0(i9, arrayList);
        if (kVar != null || UserConfig.getInstance(i9).isPremium()) {
            this.H0.setVisibility(8);
        }
        z0 z0Var = new z0(f6.Lj, f6.Mj, f6.Nj, f6.Oj, null);
        this.f50578l0 = z0Var;
        z0Var.f50798m = true;
        z0Var.f50800o = 1.0f;
        z0Var.f50801p = 0.0f;
        z0Var.f50802q = 0.0f;
        z0Var.f50789b = 0.0f;
        z0Var.f50790c = 0.0f;
        a0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new km0(this, i9, o2Var, 1));
        MediaDataController.getInstance(i9).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.q0("profile");
        c00 c00Var = new c00(getContext());
        this.f50577k0 = c00Var;
        this.container.addView(c00Var, e6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I0 = frameLayout;
        this.containerView.addView(frameLayout, e6.e(-1, 140, 87));
    }

    public void X(View view) {
    }

    public void U(int i9, View view) {
    }
}
