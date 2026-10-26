package tg;

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
import bi.cb;
import bi.qd;
import bi.v4;
import fi.hb;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.z90;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.d3;
import org.telegram.ui.gw0;
import org.telegram.ui.ww0;
import org.telegram.ui.xa1;
public class m1 extends bb implements NotificationCenter.NotificationCenterDelegate {
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
    public z90[] O0;
    public z90 P0;
    public final ArrayList X;
    public int Y;
    public final TLRPC.User Z;
    public final k f48933a0;
    public final TL_stars.StarGift f48934b0;
    public boolean f48935c0;
    public final gw0 f48936d0;
    public int f48937e0;
    public int f48938f0;
    public int f48939g0;
    public int f48940h0;
    public int f48941i0;
    public int f48942j0;
    public int f48943k0;
    public int f48944l0;
    public int m0;
    public int f48945n0;
    public final z00 f48946o0;
    public final a1 f48947p0;
    public hi.e f48948q0;
    public qd f48949r0;
    public xa1 f48950s0;
    public final r2 f48951t0;
    public Integer f48952u0;
    public float f48953v0;
    public float f48954w0;
    public float f48955x0;
    public float f48956y0;
    public float f48957z0;

    public m1(r2 r2Var, int i10, TLRPC.User user, u6 u6Var) {
        this(r2Var, i10, user, null, null, u6Var);
    }

    public static void P(m1 m1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m1Var.C0);
        v4 v4Var = new v4(m1Var, 10);
        r2 r2Var = m1Var.f48951t0;
        if (r2Var != null) {
            v4Var.setParentFragment(r2Var);
        }
        new h1(m1Var, v4Var, m1Var.getContext(), m1Var.resourcesProvider, arrayList).show();
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
                gw0 gw0Var = this.f48936d0;
                gw0Var.a((ww0) arrayList.get(i12), false);
                gw0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((ww0) arrayList.get(i12)).e = i13;
                i13 += gw0Var.getMeasuredHeight();
                i12++;
            } else {
                this.f48937e0 = i13;
                this.container.getLocationOnScreen(this.F0);
                return;
            }
        }
    }

    @Override
    public final void G(vw0 vw0Var) {
        this.Y = UserConfig.selectedAccount;
        p0 p0Var = new p0(getContext(), this.resourcesProvider, false);
        p0Var.a(PremiumPreviewFragment.p0(this.Y, null), new ig.d0(this, 22), false);
        this.L0 = new FrameLayout(getContext());
        View view = new View(getContext());
        f7.i(y6.f23357d7, view, this.resourcesProvider);
        this.L0.addView(view, gb1.g(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.Y).isPremium() && !(this instanceof vg.j0)) {
            this.L0.addView(p0Var, gb1.h(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            f7.i(y6.f23427h5, this.L0, this.resourcesProvider);
            vw0Var.addView(this.L0, gb1.i(-1, 68, 80));
        }
    }

    public void b0(xa1 xa1Var) {
        xa1Var.addView(this.B0, gb1.t(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int c0() {
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.C0) != null && inputStickerSet.f22047id == ((Long) objArr[0]).longValue()) {
            g0(true);
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
        z00 z00Var = this.f48946o0;
        if (z00Var.f35164c) {
            z00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public View e0(Context context, int i10) {
        return null;
    }

    public final SpannableStringBuilder f0(String str) {
        Integer num = this.f48952u0;
        if (num == null) {
            return AndroidUtilities.replaceSingleLinkKey(str, y6.f23673u6, this.resourcesProvider, null);
        }
        return AndroidUtilities.replaceSingleLink(str, num.intValue());
    }

    public void g0(boolean z10) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        z90[] z90VarArr = this.O0;
        if (z90VarArr != null && this.P0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.D0;
            TLRPC.User user = this.Z;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.O0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new e1(this, 0)));
                d3.s(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.C0 != null) {
                CharSequence f02 = f0(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    f02 = Emoji.replaceEmoji(f02, this.O0[0].getPaint().getFontMetricsInt(), false);
                } catch (Exception unused) {
                }
                if (f02 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) f02;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(f02);
                }
                int indexOf = f02.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.Y).getStickerSet(this.C0, false);
                    if (stickerSet != null && !stickerSet.documents.isEmpty()) {
                        document = stickerSet.documents.get(0);
                        if (stickerSet.set != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= stickerSet.documents.size()) {
                                    break;
                                } else if (stickerSet.documents.get(i10).f22033id == stickerSet.set.thumb_document_id) {
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
                        spannableStringBuilder2.setSpan(new c6(document, this.O0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (stickerSet != null && stickerSet.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new ea0(AndroidUtilities.dp(100.0f), this.O0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new hb(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.O0[1].setOnLinkPressListener(new y90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            m1.P(m1.this);
                        }
                    });
                    if (document != null) {
                        z90[] z90VarArr2 = this.O0;
                        if (z90VarArr2 != null) {
                            z90VarArr2[1].setText(spannableStringBuilder);
                            if (this.O0[1].getVisibility() != 0) {
                                if (z10) {
                                    this.O0[1].setAlpha(0.0f);
                                    this.O0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.O0[1].animate().alpha(1.0f);
                                    ds dsVar = ds.f27586f;
                                    vh.q(alpha, dsVar, 200L);
                                    this.O0[0].animate().alpha(0.0f).setInterpolator(dsVar).setDuration(200L).withEndAction(new e1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new g1(this, 1));
                                    ofFloat.setInterpolator(dsVar);
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
                d3.s(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
            } else if (this.E0) {
                z90VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                k kVar = this.f48933a0;
                if (kVar != null) {
                    if (this.f48935c0) {
                        z90 z90Var = z90VarArr[0];
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        z90Var.setText(f0(LocaleController.formatString(i11, str, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]))));
                        z90 z90Var2 = this.P0;
                        int i12 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        z90Var2.setText(f0(LocaleController.formatString(i12, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f22176id != 777000) {
                        this.O0[0].setText(f0(LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]))));
                        d3.s(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    } else {
                        this.O0[0].setText(f0(LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]))));
                        d3.s(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.f48934b0;
                    if (starGift != null) {
                        z90VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.O0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            d3.s(R.string.Gift2PremiumSubtitle, this.P0);
                        }
                        this.P0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        z90VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        d3.s(R.string.TelegramPremiumSubscribedSubtitle, this.P0);
                    } else {
                        z90VarArr[0].setText(f0(LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                        d3.s(R.string.TelegramPremiumUserDialogSubtitle, this.P0);
                    }
                }
            }
            try {
                z90 z90Var3 = this.O0[0];
                z90Var3.setText(Emoji.replaceEmoji(z90Var3.getText(), this.O0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void h0() {
        int i10 = this.f48938f0;
        int i11 = i10 + 1;
        this.f48938f0 = i11;
        this.f48939g0 = i10;
        this.f48942j0 = i11;
        int size = this.X.size() + i11;
        this.f48943k0 = size;
        this.f48938f0 = size + 1;
        this.f48944l0 = size;
        if (!UserConfig.getInstance(this.Y).isPremium() && this.f48933a0 == null) {
            int i12 = this.f48938f0;
            this.f48938f0 = i12 + 1;
            this.m0 = i12;
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
                view = this.f48949r0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f48953v0, this.f48954w0};
            this.A0.getMatrix().mapPoints(fArr);
            View view4 = this.A0;
            if (view4 instanceof b6) {
                drawable = ((b6) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.s1) {
                drawable = ((org.telegram.ui.Cells.s1) view4).f25097fc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.F0;
            float f7 = (-iArr[0]) + this.f48955x0 + fArr[0];
            float f10 = (-iArr[1]) + this.f48956y0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f48951t0.getParentLayout().getView();
                f7 += view5.getX() + view5.getPaddingLeft();
                f10 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f48957z0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f11 = measuredHeight / intrinsicWidth;
            float f12 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f7, measuredWidth, ds.h.getInterpolation(this.G0));
            float lerp2 = AndroidUtilities.lerp(f10, measuredHeight2, this.G0);
            float f13 = this.f48957z0;
            float f14 = this.G0;
            float f15 = (f11 * f14) + ((1.0f - f14) * f13);
            canvas.save();
            canvas.scale(f15, f15, lerp, lerp2);
            int i11 = (int) lerp;
            int i12 = (int) lerp2;
            drawable.setBounds(d3.x(2, i11, drawable), d3.i(2, i12, drawable), d3.C(2, i11, drawable), d3.B(2, i12, drawable));
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
        this.f48950s0.invalidate();
        View view = this.A0;
        if (view instanceof b6) {
            drawable = ((b6) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            r5 r5Var = s1Var.f25097fc;
            s1Var.a3();
            drawable = r5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.A0;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view2).a3();
        } else {
            view2.invalidate();
        }
        qd qdVar = this.f48949r0;
        if (qdVar != null) {
            qdVar.m(100L);
        }
        this.I0.addUpdateListener(new g1(this, 0));
        this.I0.addListener(new ll0(21, this, drawable));
        this.I0.setDuration(600L);
        this.I0.setInterpolator(ds.h);
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
        qd qdVar = this.f48949r0;
        if (qdVar != null) {
            qdVar.setDialogVisible(true);
        }
        this.f48948q0.setPaused(true);
        dialog.setOnDismissListener(new cb(this, 13));
        dialog.show();
        return true;
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        return new l1(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public m1(r2 r2Var, int i10, TLRPC.User user, k kVar, TL_stars.StarGift starGift, u6 u6Var) {
        super(r2Var, false, false, u6Var);
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.F0 = new int[2];
        this.G0 = 0.0f;
        fixNavigationBar();
        this.f48951t0 = r2Var;
        this.v = 0.26f;
        this.Z = user;
        this.Y = i10;
        this.f48933a0 = kVar;
        this.f48934b0 = starGift;
        this.f48936d0 = new gw0(getContext(), null);
        PremiumPreviewFragment.o0(i10, arrayList);
        if (kVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.L0.setVisibility(8);
        }
        a1 a1Var = new a1(y6.Lj, y6.Mj, y6.Nj, y6.Oj, null);
        this.f48947p0 = a1Var;
        a1Var.f48803m = true;
        a1Var.f48805o = 1.0f;
        a1Var.f48806p = 0.0f;
        a1Var.f48807q = 0.0f;
        a1Var.f48795b = 0.0f;
        a1Var.f48796c = 0.0f;
        h0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new go0(this, i10, r2Var, 1));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.s0("profile");
        z00 z00Var = new z00(getContext());
        this.f48946o0 = z00Var;
        this.container.addView(z00Var, gb1.g(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.M0 = frameLayout;
        this.containerView.addView(frameLayout, gb1.i(-1, 140, 87));
    }

    public void d0(View view) {
    }

    public void a0(int i10, View view) {
    }
}
