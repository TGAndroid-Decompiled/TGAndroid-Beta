package org.telegram.ui;

import android.content.Context;
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
public final class v81 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.y9 f42752a;
    public final tk f42753b;
    public final org.telegram.ui.Components.voip.h f42754c;
    public final SessionsActivity d;

    public v81(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.d = sessionsActivity;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42754c = hVar;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f42752a = y9Var;
        addView(y9Var, w7.x5.a(120.0f, 0.0f, 16.0f, 0.0f, 0.0f, 120, 1));
        hVar.f32023j = false;
        hVar.f32027n = 1.2f;
        y9Var.setOnClickListener(new x7(this, 2));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.i6.f20801d6;
        org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(context, null);
        addView(fa0Var, w7.x5.a(-2.0f, 36.0f, 152.0f, 36.0f, 0.0f, -1, 0));
        fa0Var.setGravity(1);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        fa0Var.setTextSize(1, 15.0f);
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J6, false));
        fa0Var.setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.K6, false));
        String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int i13 = indexOf + 1;
        int indexOf2 = string.indexOf(42, i13);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            fa0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.u11) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i14 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i14);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            fa0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i14, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u61(LocaleController.getString(R.string.AuthAnotherWebClientUrl), (org.telegram.ui.Components.u11) null), indexOf3, indexOf4 - 1, 33);
        }
        fa0Var.setText(spannableStringBuilder);
        tk tkVar = new tk(this, context, 3);
        this.f42753b = tkVar;
        tkVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        tkVar.setGravity(17);
        tkVar.setTextSize(1, 14.0f);
        tkVar.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.er(0, getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
        tkVar.setText(spannableStringBuilder3);
        tkVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        tkVar.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x02, x03, x03));
        tkVar.setOnClickListener(new p41(this, 4));
        addView(tkVar, w7.x5.a(48.0f, 16.0f, 15.0f, 16.0f, 16.0f, -1, 80));
        a();
    }

    public final void a() {
        int i10;
        TLRPC.Document document;
        int i11;
        boolean z10;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i10 = ((org.telegram.ui.ActionBar.n2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            i12 = ((org.telegram.ui.ActionBar.n2) sessionsActivity).currentAccount;
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
            svgDrawable = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f20785c7, 0.2f);
        }
        SvgHelper.SvgDrawable svgDrawable2 = svgDrawable;
        if (svgDrawable2 != null) {
            svgDrawable2.overrideWidthAndHeight(512, 512);
        }
        if (document == null) {
            i11 = ((org.telegram.ui.ActionBar.n2) sessionsActivity).currentAccount;
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
        org.telegram.ui.Components.y9 y9Var = this.f42752a;
        y9Var.i(forDocument, "130_130", "tgs", svgDrawable2, tL_messages_stickerSet);
        y9Var.getImageReceiver().setAutoRepeat(2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        a();
        i10 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), 1073741824));
    }
}
