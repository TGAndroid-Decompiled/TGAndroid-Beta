package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class w81 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.w9 f37748a;
    public final uk f37749b;
    public final org.telegram.ui.Components.voip.h f37750c;
    public final SessionsActivity d;

    public w81(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.d = sessionsActivity;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f37750c = hVar;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f37748a = w9Var;
        addView(w9Var, w7.a6.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        hVar.f28150j = false;
        hVar.f28154n = 1.2f;
        w9Var.setOnClickListener(new y7(this, 2));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.f17928d6;
        org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(context, null);
        addView(m90Var, w7.a6.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        m90Var.setGravity(1);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        m90Var.setTextSize(1, 15.0f);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        m90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
        String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int i13 = indexOf + 1;
        int indexOf2 = string.indexOf(42, i13);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            m90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.z51(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.b11) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i14 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i14);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            m90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i14, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.z51(LocaleController.getString(R.string.AuthAnotherWebClientUrl), (org.telegram.ui.Components.b11) null), indexOf3, indexOf4 - 1, 33);
        }
        m90Var.setText(spannableStringBuilder);
        uk ukVar = new uk(this, context, 3);
        this.f37749b = ukVar;
        ukVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        ukVar.setGravity(17);
        ukVar.setTextSize(1, 14.0f);
        ukVar.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.uq(0, getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
        ukVar.setText(spannableStringBuilder3);
        ukVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        ukVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, w03, w03));
        ukVar.setOnClickListener(new m41(this, 5));
        addView(ukVar, w7.a6.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        b();
    }

    public static void a(w81 w81Var) {
        SessionsActivity sessionsActivity = w81Var.d;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
            return;
        }
        u9.e0(sessionsActivity.getParentActivity(), 2, new u81(sessionsActivity));
    }

    public final void b() {
        int i10;
        TLRPC.Document document;
        int i11;
        boolean z10;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i10 = ((org.telegram.ui.ActionBar.p2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            i12 = ((org.telegram.ui.ActionBar.p2) sessionsActivity).currentAccount;
            stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        SvgHelper.SvgDrawable svgDrawable = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            svgDrawable = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f17911c7, 0.2f);
        }
        SvgHelper.SvgDrawable svgDrawable2 = svgDrawable;
        if (svgDrawable2 != null) {
            svgDrawable2.overrideWidthAndHeight(512, 512);
        }
        if (document == null) {
            i11 = ((org.telegram.ui.ActionBar.p2) sessionsActivity).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
            return;
        }
        ImageLocation forDocument = ImageLocation.getForDocument(document);
        org.telegram.ui.Components.w9 w9Var = this.f37748a;
        w9Var.i(forDocument, "130_130", "tgs", svgDrawable2, tL_messages_stickerSet);
        w9Var.getImageReceiver().setAutoRepeat(2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        b();
        i10 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), 1073741824));
    }
}
