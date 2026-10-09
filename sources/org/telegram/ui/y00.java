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
public abstract class y00 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n2 f44177a;
    public final int f44178b;
    public final int f44179c;
    public final Drawable d;
    public final Drawable f44180e;
    public final org.telegram.ui.Components.r6 f44181f;
    public final org.telegram.ui.Components.r6 h;
    public final Paint f44182n;
    public final Paint f44183r;
    public float f44184s;
    public boolean v;
    public ValueAnimator f44185w;
    public String f44186x;
    public TL_chatlists.TL_exportedChatlistInvite f44187y;

    public y00(Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11) {
        super(context);
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        float f12;
        float f13;
        float f14;
        this.f44177a = n2Var;
        this.f44178b = i10;
        this.f44179c = i11;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, false);
        this.f44181f = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(15.66f));
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        r6Var.setGravity(i12);
        r6Var.setEllipsizeByGradient(true);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f7 = 56.0f;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        addView(r6Var, w7.x5.a(20.0f, f7, 10.33f, f10, 0.0f, -1, 55));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, false, false, false);
        this.h = r6Var2;
        r6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21199z6, false));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        r6Var2.setGravity(i13);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f11 = 56.0f;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 56.0f;
        }
        addView(r6Var2, w7.x5.a(16.0f, f11, 33.33f, f12, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 1, -1));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Uh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setOnClickListener(new a(this, 24));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        boolean z12 = LocaleController.isRTL;
        int i14 = (z12 ? 3 : 5) | 16;
        if (z12) {
            f13 = 8.0f;
        } else {
            f13 = 4.0f;
        }
        if (z12) {
            f14 = 4.0f;
        } else {
            f14 = 8.0f;
        }
        addView(imageView, w7.x5.a(40.0f, f13, 4.0f, f14, 4.0f, 40, i14));
        Paint paint = new Paint();
        this.f44182n = paint;
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
        Paint paint2 = new Paint();
        this.f44183r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.wj, false));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
        this.f44180e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String substring;
        String str = this.f44186x;
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
        tL_inputChatlistDialogFilter.filter_id = this.f44179c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        x00 x00Var = new x00(this, 2);
        ConnectionsManager.getInstance(this.f44178b).sendRequest(tL_chatlists_deleteExportedInvite, new oo(21, this, x00Var));
        AndroidUtilities.runOnUIThread(x00Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f44177a;
        if (!(n2Var instanceof f10)) {
            return;
        }
        ai.w0 w0Var = ((f10) n2Var).f37410a;
        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(n2Var, this);
        H.W(w0Var.V0(this, false));
        H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new x00(this, 0), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new x00(this, 1), true);
        if (LocaleController.isRTL) {
            H.f29771i = 3;
        }
        H.Z();
    }

    public final void d() {
        if (this.f44186x == null) {
            return;
        }
        org.telegram.ui.Components.oj0 oj0Var = new org.telegram.ui.Components.oj0(getContext(), LocaleController.getString(R.string.InviteByQRCode), this.f44186x, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
        oj0Var.o(R.raw.qr_code_logo);
        oj0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z10) {
        boolean z11;
        if (this.f44187y == tL_exportedChatlistInvite) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44187y = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.f44186x = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.r6 r6Var = this.f44181f;
        if (isEmpty) {
            r6Var.c(str, z11, true);
        } else {
            r6Var.c(tL_exportedChatlistInvite.title, z11, true);
        }
        this.h.c(LocaleController.formatPluralString("FilterInviteChats", tL_exportedChatlistInvite.peers.size(), new Object[0]), z11, true);
        if (this.v != z10) {
            this.v = z10;
            invalidate();
        }
        boolean z12 = tL_exportedChatlistInvite.revoked;
        if ((z12 ? 1.0f : 0.0f) != this.f44184s) {
            ValueAnimator valueAnimator = this.f44185w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f44185w = null;
            }
            float f7 = 0.0f;
            if (z11) {
                float f10 = this.f44184s;
                if (z12) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f44185w = ofFloat;
                ofFloat.addUpdateListener(new c3(this, 13));
                this.f44185w.addListener(new org.telegram.ui.Components.fa(28, this, z12));
                this.f44185w.setInterpolator(org.telegram.ui.Components.hs.h);
                this.f44185w.setDuration(350L);
                this.f44185w.start();
                return;
            }
            if (z12) {
                f7 = 1.0f;
            }
            this.f44184s = f7;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        int i10;
        super.onDraw(canvas);
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(32.0f);
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        float f7 = dp;
        canvas.drawCircle(f7, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.f44182n);
        float f10 = 0.0f;
        if (this.f44184s > 0.0f) {
            canvas.drawCircle(f7, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f) * this.f44184s, this.f44183r);
        }
        float f11 = this.f44184s;
        if (f11 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f11) * 255.0f));
            drawable.setBounds(dp - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + dp, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f12 = this.f44184s;
        if (f12 > 0.0f) {
            Drawable drawable2 = this.f44180e;
            drawable2.setAlpha((int) (f12 * 255.0f));
            drawable2.setBounds(dp - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + dp, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.v) {
            if (!LocaleController.isRTL) {
                f10 = AndroidUtilities.dp(64.0f);
            }
            float f13 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f13, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f20919k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.f44187y;
        String str2 = "";
        if (tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
            str = "";
        } else {
            str = a1.g.t(new StringBuilder(), this.f44187y.title, "\n ");
        }
        sb2.append(str);
        org.telegram.ui.Cells.c1.l(R.string.InviteLink, ", ", sb2);
        sb2.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.f44187y;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str2 = "\n\n" + this.f44187y.url;
        }
        sb2.append(str2);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }
}
