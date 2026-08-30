package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_chatlists;
public abstract class u00 extends FrameLayout {
    public final org.telegram.ui.ActionBar.p2 f38789a;
    public final int f38790b;
    public final int f38791c;
    public final Drawable d;
    public final Drawable e;
    public final org.telegram.ui.Components.k6 f38792f;
    public final org.telegram.ui.Components.k6 h;
    public final Paint f38793n;
    public final Paint f38794r;
    public float f38795s;
    public boolean v;
    public ValueAnimator f38796w;
    public String f38797x;
    public TL_chatlists.TL_exportedChatlistInvite f38798y;

    public u00(Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11) {
        super(context);
        int i12;
        float f10;
        float f11;
        int i13;
        float f12;
        float f13;
        float f14;
        float f15;
        this.f38789a = p2Var;
        this.f38790b = i10;
        this.f38791c = i11;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, false);
        this.f38792f = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(15.66f));
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        k6Var.setGravity(i12);
        k6Var.setEllipsizeByGradient(true);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            f10 = 56.0f;
        } else {
            f10 = 64.0f;
        }
        if (z4) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        addView(k6Var, k7.b6.d(-1, 20.0f, 55, f10, 10.33f, f11, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.h = k6Var2;
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20298z6, false));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        k6Var2.setGravity(i13);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f12 = 56.0f;
        } else {
            f12 = 64.0f;
        }
        if (z10) {
            f13 = 64.0f;
        } else {
            f13 = 56.0f;
        }
        addView(k6Var2, k7.b6.d(-1, 16.0f, 55, f12, 33.33f, f13, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), 1, -1));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setOnClickListener(new a(this, 25));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        boolean z11 = LocaleController.isRTL;
        int i14 = (z11 ? 3 : 5) | 16;
        if (z11) {
            f14 = 8.0f;
        } else {
            f14 = 4.0f;
        }
        if (z11) {
            f15 = 4.0f;
        } else {
            f15 = 8.0f;
        }
        addView(imageView, k7.b6.d(40, 40.0f, i14, f14, 4.0f, f15, 4.0f));
        Paint paint = new Paint();
        this.f38793n = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
        Paint paint2 = new Paint();
        this.f38794r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.wj, false));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String substring;
        String str = this.f38797x;
        if (str == null) {
            substring = null;
        } else {
            substring = str.substring(str.lastIndexOf(47) + 1);
        }
        if (substring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.f38791c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        t00 t00Var = new t00(this, 2);
        ConnectionsManager.getInstance(this.f38790b).sendRequest(tL_chatlists_deleteExportedInvite, new lo(21, this, t00Var));
        AndroidUtilities.runOnUIThread(t00Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f38789a;
        if (!(p2Var instanceof b10)) {
            return;
        }
        lh.e1 e1Var = ((b10) p2Var).f32759a;
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(p2Var, this);
        H.W(e1Var.V0(this, false));
        H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new t00(this, 0), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new t00(this, 1), true);
        if (LocaleController.isRTL) {
            H.f27471i = 3;
        }
        H.Z();
    }

    public final void d() {
        if (this.f38797x == null) {
            return;
        }
        org.telegram.ui.Components.qi0 qi0Var = new org.telegram.ui.Components.qi0(getContext(), LocaleController.getString(R.string.InviteByQRCode), this.f38797x, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
        qi0Var.m(R.raw.qr_code_logo);
        qi0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z4) {
        boolean z10;
        if (this.f38798y == tL_exportedChatlistInvite) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38798y = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.f38797x = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.k6 k6Var = this.f38792f;
        if (isEmpty) {
            k6Var.c(str, z10, true);
        } else {
            k6Var.c(tL_exportedChatlistInvite.title, z10, true);
        }
        this.h.c(LocaleController.formatPluralString("FilterInviteChats", tL_exportedChatlistInvite.peers.size(), new Object[0]), z10, true);
        if (this.v != z4) {
            this.v = z4;
            invalidate();
        }
        boolean z11 = tL_exportedChatlistInvite.revoked;
        if ((z11 ? 1.0f : 0.0f) != this.f38795s) {
            ValueAnimator valueAnimator = this.f38796w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f38796w = null;
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f38795s;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f38796w = ofFloat;
                ofFloat.addUpdateListener(new e3(this, 13));
                this.f38796w.addListener(new org.telegram.ui.Components.l00(20, this, z11));
                this.f38796w.setInterpolator(org.telegram.ui.Components.nr.h);
                this.f38796w.setDuration(350L);
                this.f38796w.start();
                return;
            }
            if (z11) {
                f10 = 1.0f;
            }
            this.f38795s = f10;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        float dp2;
        int i10;
        super.onDraw(canvas);
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(32.0f);
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        float f10 = dp;
        canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.f38793n);
        if (this.f38795s > 0.0f) {
            canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f) * this.f38795s, this.f38794r);
        }
        float f11 = this.f38795s;
        if (f11 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f11) * 255.0f));
            drawable.setBounds(dp - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + dp, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f12 = this.f38795s;
        if (f12 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f12 * 255.0f));
            drawable2.setBounds(dp - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + dp, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.v) {
            if (LocaleController.isRTL) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(64.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(dp2, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.f38798y;
        String str2 = "";
        if (tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
            str = "";
        } else {
            str = android.support.v4.media.a.r(new StringBuilder(), this.f38798y.title, "\n ");
        }
        sb.append(str);
        b.i(R.string.InviteLink, ", ", sb);
        sb.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.f38798y;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str2 = "\n\n" + this.f38798y.url;
        }
        sb.append(str2);
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }
}
