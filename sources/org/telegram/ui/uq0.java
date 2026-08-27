package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class uq0 implements View.OnClickListener {

    public final int f43273a;

    public final PhotoViewer f43274b;

    public uq0(PhotoViewer photoViewer, int i10) {
        this.f43273a = i10;
        this.f43274b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        au0 au0Var;
        org.telegram.ui.Components.b70 b70VarJ;
        int iDp;
        int iDp2;
        ArrayList arrayList;
        String str;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.Message message;
        int i14 = this.f43273a;
        float f12 = 0.0f;
        final PhotoViewer photoViewer = this.f43274b;
        final int i15 = 0;
        int i16 = 1;
        switch (i14) {
            case 0:
                if (!photoViewer.a2 && !photoViewer.H1()) {
                    photoViewer.M2();
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!photoViewer.H1() && (au0Var = photoViewer.d) != null && au0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.p3(!photoViewer.G, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.T1(true);
                photoViewer.B0(0, true);
                break;
            case 3:
                MessageObject messageObject = photoViewer.P4;
                if (messageObject == null || !messageObject.isSponsored()) {
                    if (photoViewer.B.f23590q0.a()) {
                        photoViewer.f35675k0.M(null, null);
                    }
                    break;
                } else {
                    MessageObject messageObject2 = photoViewer.P4;
                    if (messageObject2 != null && messageObject2.isSponsored() && photoViewer.f35675k0.getAlpha() > 0.5f) {
                        final int i17 = photoViewer.P4.currentAccount;
                        final jh.b bVar = new jh.b();
                        org.telegram.ui.Components.b70 b70VarG = org.telegram.ui.Components.b70.G(photoViewer.f35583a0, bVar, photoViewer.f35675k0, true);
                        b70VarG.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        b70VarG.V(5);
                        MessageObject messageObject3 = photoViewer.P4;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str2 = messageObject3.sponsoredUrl;
                            if (str2 != null) {
                                if (!str2.startsWith("https://" + MessagesController.getInstance(photoViewer.P).linkPrefix)) {
                                    b70VarJ = b70VarG.J();
                                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, photoViewer.A, bVar, true, false);
                                    f1Var.setItemHeight(44);
                                    f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    org.telegram.ui.Components.s5 textView = f1Var.getTextView();
                                    if (LocaleController.isRTL) {
                                        iDp = 0;
                                    } else {
                                        iDp = AndroidUtilities.dp(40.0f);
                                    }
                                    if (LocaleController.isRTL) {
                                        iDp2 = AndroidUtilities.dp(40.0f);
                                    } else {
                                        iDp2 = 0;
                                    }
                                    textView.setPadding(iDp, 0, iDp2, 0);
                                    f1Var.setOnClickListener(new ch(b70VarG, 1));
                                    b70VarJ.r(f1Var, h7.z5.n(-1, -2));
                                    b70VarJ.r(new org.telegram.ui.ActionBar.k1(photoViewer.A, bVar), h7.z5.n(-1, 8));
                                    arrayList = new ArrayList();
                                    str = photoViewer.P4.sponsoredUrl;
                                    if (str != null) {
                                        f10 = 300.0f;
                                        if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(photoViewer.P).linkPrefix)) {
                                            TextView textView2 = new TextView(photoViewer.A);
                                            textView2.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.gc));
                                            textView2.setTextSize(1, 14.0f);
                                            f11 = 10.0f;
                                            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                            textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
                                            Uri uri = Uri.parse(photoViewer.P4.sponsoredUrl);
                                            textView2.setText(we.e.v(uri, null, null, we.e.a(uri.getHost()), null));
                                            int iZ1 = photoViewer.z1(org.telegram.ui.ActionBar.g6.I5);
                                            if (photoViewer.P4.sponsoredAdditionalInfo == null) {
                                                i13 = 6;
                                            } else {
                                                i13 = 0;
                                            }
                                            textView2.setBackground(org.telegram.ui.ActionBar.g6.Y(iZ1, 0, i13));
                                            textView2.setOnClickListener(new u70(13, photoViewer, b70VarG));
                                            textView2.setOnLongClickListener(new jh.f2(4, photoViewer, bVar));
                                            arrayList.add(textView2);
                                        }
                                        if (photoViewer.P4.sponsoredInfo != null) {
                                            TextView textView3 = new TextView(photoViewer.A);
                                            textView3.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                            textView3.setTextSize(1, 14.0f);
                                            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                            textView3.setMaxWidth(AndroidUtilities.dp(f10));
                                            textView3.setText(photoViewer.P4.sponsoredInfo);
                                            int iZ2 = photoViewer.z1(org.telegram.ui.ActionBar.g6.I5);
                                            if (photoViewer.P4.sponsoredAdditionalInfo == null) {
                                                i12 = 6;
                                            } else {
                                                i12 = 0;
                                            }
                                            textView3.setBackground(org.telegram.ui.ActionBar.g6.Y(iZ2, 0, i12));
                                            textView3.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public final void onClick(View view2) {
                                                    switch (i15) {
                                                        case 0:
                                                            PhotoViewer photoViewer2 = photoViewer;
                                                            if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                                org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                            }
                                                            break;
                                                        default:
                                                            PhotoViewer photoViewer3 = photoViewer;
                                                            if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                                org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            arrayList.add(textView3);
                                        }
                                        if (photoViewer.P4.sponsoredAdditionalInfo != null) {
                                            TextView textView4 = new TextView(photoViewer.A);
                                            textView4.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                            textView4.setTextSize(1, 14.0f);
                                            textView4.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                            textView4.setMaxWidth(AndroidUtilities.dp(f10));
                                            textView4.setText(photoViewer.P4.sponsoredAdditionalInfo);
                                            textView4.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, 6));
                                            final int i18 = 1;
                                            textView4.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public final void onClick(View view2) {
                                                    switch (i18) {
                                                        case 0:
                                                            PhotoViewer photoViewer2 = photoViewer;
                                                            if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                                org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                            }
                                                            break;
                                                        default:
                                                            PhotoViewer photoViewer3 = photoViewer;
                                                            if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                                org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            arrayList.add(textView4);
                                        }
                                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                                            View view2 = (View) arrayList.get(i10);
                                            if (i10 > 0) {
                                                FrameLayout frameLayout = new FrameLayout(photoViewer.A);
                                                frameLayout.setBackgroundColor(bVar.N0(org.telegram.ui.ActionBar.g6.f23054d7));
                                                i11 = -1;
                                                LinearLayout.LayoutParams layoutParamsN = h7.z5.n(-1, 1);
                                                layoutParamsN.height = 1;
                                                b70VarJ.r(frameLayout, layoutParamsN);
                                            } else {
                                                i11 = -1;
                                            }
                                            b70VarJ.r(view2, h7.z5.n(i11, -2));
                                        }
                                        b70VarG.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gh.f3(b70VarG, b70VarJ, 9), false);
                                    } else {
                                        f10 = 300.0f;
                                    }
                                    f11 = 10.0f;
                                    if (photoViewer.P4.sponsoredInfo != null) {
                                        TextView textView5 = new TextView(photoViewer.A);
                                        textView5.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                        textView5.setTextSize(1, 14.0f);
                                        textView5.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                        textView5.setMaxWidth(AndroidUtilities.dp(f10));
                                        textView5.setText(photoViewer.P4.sponsoredInfo);
                                        int iZ3 = photoViewer.z1(org.telegram.ui.ActionBar.g6.I5);
                                        if (photoViewer.P4.sponsoredAdditionalInfo == null) {
                                            i12 = 6;
                                        } else {
                                            i12 = 0;
                                        }
                                        textView5.setBackground(org.telegram.ui.ActionBar.g6.Y(iZ3, 0, i12));
                                        textView5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view3) {
                                                switch (i15) {
                                                    case 0:
                                                        PhotoViewer photoViewer2 = photoViewer;
                                                        if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                            org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                        }
                                                        break;
                                                    default:
                                                        PhotoViewer photoViewer3 = photoViewer;
                                                        if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                            org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        arrayList.add(textView5);
                                    }
                                    if (photoViewer.P4.sponsoredAdditionalInfo != null) {
                                        TextView textView6 = new TextView(photoViewer.A);
                                        textView6.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                        textView6.setTextSize(1, 14.0f);
                                        textView6.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                        textView6.setMaxWidth(AndroidUtilities.dp(f10));
                                        textView6.setText(photoViewer.P4.sponsoredAdditionalInfo);
                                        textView6.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, 6));
                                        final int i19 = 1;
                                        textView6.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view3) {
                                                switch (i19) {
                                                    case 0:
                                                        PhotoViewer photoViewer2 = photoViewer;
                                                        if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                            org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                        }
                                                        break;
                                                    default:
                                                        PhotoViewer photoViewer3 = photoViewer;
                                                        if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                            org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        arrayList.add(textView6);
                                    }
                                    while (i10 < arrayList.size()) {
                                        View view3 = (View) arrayList.get(i10);
                                        if (i10 > 0) {
                                            FrameLayout frameLayout2 = new FrameLayout(photoViewer.A);
                                            frameLayout2.setBackgroundColor(bVar.N0(org.telegram.ui.ActionBar.g6.f23054d7));
                                            i11 = -1;
                                            LinearLayout.LayoutParams layoutParamsN2 = h7.z5.n(-1, 1);
                                            layoutParamsN2.height = 1;
                                            b70VarJ.r(frameLayout2, layoutParamsN2);
                                        } else {
                                            i11 = -1;
                                        }
                                        b70VarJ.r(view3, h7.z5.n(i11, -2));
                                    }
                                    b70VarG.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gh.f3(b70VarG, b70VarJ, 9), false);
                                }
                            }
                        } else {
                            b70VarJ = b70VarG.J();
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, photoViewer.A, bVar, true, false);
                            f1Var2.setItemHeight(44);
                            f1Var2.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            org.telegram.ui.Components.s5 textView7 = f1Var2.getTextView();
                            if (LocaleController.isRTL) {
                                iDp = 0;
                            } else {
                                iDp = AndroidUtilities.dp(40.0f);
                            }
                            if (LocaleController.isRTL) {
                                iDp2 = AndroidUtilities.dp(40.0f);
                            } else {
                                iDp2 = 0;
                            }
                            textView7.setPadding(iDp, 0, iDp2, 0);
                            f1Var2.setOnClickListener(new ch(b70VarG, 1));
                            b70VarJ.r(f1Var2, h7.z5.n(-1, -2));
                            b70VarJ.r(new org.telegram.ui.ActionBar.k1(photoViewer.A, bVar), h7.z5.n(-1, 8));
                            arrayList = new ArrayList();
                            str = photoViewer.P4.sponsoredUrl;
                            if (str != null) {
                                f10 = 300.0f;
                                if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(photoViewer.P).linkPrefix)) {
                                    TextView textView8 = new TextView(photoViewer.A);
                                    textView8.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.gc));
                                    textView8.setTextSize(1, 14.0f);
                                    f11 = 10.0f;
                                    textView8.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                    textView8.setMaxWidth(AndroidUtilities.dp(300.0f));
                                    Uri uri2 = Uri.parse(photoViewer.P4.sponsoredUrl);
                                    textView8.setText(we.e.v(uri2, null, null, we.e.a(uri2.getHost()), null));
                                    int iZ4 = photoViewer.z1(org.telegram.ui.ActionBar.g6.I5);
                                    if (photoViewer.P4.sponsoredAdditionalInfo == null) {
                                        i13 = 6;
                                    } else {
                                        i13 = 0;
                                    }
                                    textView8.setBackground(org.telegram.ui.ActionBar.g6.Y(iZ4, 0, i13));
                                    textView8.setOnClickListener(new u70(13, photoViewer, b70VarG));
                                    textView8.setOnLongClickListener(new jh.f2(4, photoViewer, bVar));
                                    arrayList.add(textView8);
                                }
                                if (photoViewer.P4.sponsoredInfo != null) {
                                    TextView textView9 = new TextView(photoViewer.A);
                                    textView9.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                    textView9.setTextSize(1, 14.0f);
                                    textView9.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                    textView9.setMaxWidth(AndroidUtilities.dp(f10));
                                    textView9.setText(photoViewer.P4.sponsoredInfo);
                                    int iZ5 = photoViewer.z1(org.telegram.ui.ActionBar.g6.I5);
                                    if (photoViewer.P4.sponsoredAdditionalInfo == null) {
                                        i12 = 6;
                                    } else {
                                        i12 = 0;
                                    }
                                    textView9.setBackground(org.telegram.ui.ActionBar.g6.Y(iZ5, 0, i12));
                                    textView9.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view4) {
                                            switch (i15) {
                                                case 0:
                                                    PhotoViewer photoViewer2 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                        org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                    }
                                                    break;
                                                default:
                                                    PhotoViewer photoViewer3 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                        org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView9);
                                }
                                if (photoViewer.P4.sponsoredAdditionalInfo != null) {
                                    TextView textView10 = new TextView(photoViewer.A);
                                    textView10.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                    textView10.setTextSize(1, 14.0f);
                                    textView10.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                    textView10.setMaxWidth(AndroidUtilities.dp(f10));
                                    textView10.setText(photoViewer.P4.sponsoredAdditionalInfo);
                                    textView10.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, 6));
                                    final int i110 = 1;
                                    textView10.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view4) {
                                            switch (i110) {
                                                case 0:
                                                    PhotoViewer photoViewer2 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                        org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                    }
                                                    break;
                                                default:
                                                    PhotoViewer photoViewer3 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                        org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView10);
                                }
                                while (i10 < arrayList.size()) {
                                    View view4 = (View) arrayList.get(i10);
                                    if (i10 > 0) {
                                        FrameLayout frameLayout3 = new FrameLayout(photoViewer.A);
                                        frameLayout3.setBackgroundColor(bVar.N0(org.telegram.ui.ActionBar.g6.f23054d7));
                                        i11 = -1;
                                        LinearLayout.LayoutParams layoutParamsN3 = h7.z5.n(-1, 1);
                                        layoutParamsN3.height = 1;
                                        b70VarJ.r(frameLayout3, layoutParamsN3);
                                    } else {
                                        i11 = -1;
                                    }
                                    b70VarJ.r(view4, h7.z5.n(i11, -2));
                                }
                                b70VarG.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gh.f3(b70VarG, b70VarJ, 9), false);
                            } else {
                                f10 = 300.0f;
                            }
                            f11 = 10.0f;
                            if (photoViewer.P4.sponsoredInfo != null) {
                                TextView textView11 = new TextView(photoViewer.A);
                                textView11.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                textView11.setTextSize(1, 14.0f);
                                textView11.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                textView11.setMaxWidth(AndroidUtilities.dp(f10));
                                textView11.setText(photoViewer.P4.sponsoredInfo);
                                int iZ6 = photoViewer.z1(org.telegram.ui.ActionBar.g6.I5);
                                if (photoViewer.P4.sponsoredAdditionalInfo == null) {
                                    i12 = 6;
                                } else {
                                    i12 = 0;
                                }
                                textView11.setBackground(org.telegram.ui.ActionBar.g6.Y(iZ6, 0, i12));
                                textView11.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view5) {
                                        switch (i15) {
                                            case 0:
                                                PhotoViewer photoViewer2 = photoViewer;
                                                if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                    org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                }
                                                break;
                                            default:
                                                PhotoViewer photoViewer3 = photoViewer;
                                                if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                    org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                }
                                                break;
                                        }
                                    }
                                });
                                arrayList.add(textView11);
                            }
                            if (photoViewer.P4.sponsoredAdditionalInfo != null) {
                                TextView textView12 = new TextView(photoViewer.A);
                                textView12.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                textView12.setTextSize(1, 14.0f);
                                textView12.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                textView12.setMaxWidth(AndroidUtilities.dp(f10));
                                textView12.setText(photoViewer.P4.sponsoredAdditionalInfo);
                                textView12.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, 6));
                                final int i111 = 1;
                                textView12.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view5) {
                                        switch (i111) {
                                            case 0:
                                                PhotoViewer photoViewer2 = photoViewer;
                                                if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                    org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                }
                                                break;
                                            default:
                                                PhotoViewer photoViewer3 = photoViewer;
                                                if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                    org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                }
                                                break;
                                        }
                                    }
                                });
                                arrayList.add(textView12);
                            }
                            while (i10 < arrayList.size()) {
                                View view5 = (View) arrayList.get(i10);
                                if (i10 > 0) {
                                    FrameLayout frameLayout4 = new FrameLayout(photoViewer.A);
                                    frameLayout4.setBackgroundColor(bVar.N0(org.telegram.ui.ActionBar.g6.f23054d7));
                                    i11 = -1;
                                    LinearLayout.LayoutParams layoutParamsN4 = h7.z5.n(-1, 1);
                                    layoutParamsN4.height = 1;
                                    b70VarJ.r(frameLayout4, layoutParamsN4);
                                } else {
                                    i11 = -1;
                                }
                                b70VarJ.r(view5, h7.z5.n(i11, -2));
                            }
                            b70VarG.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gh.f3(b70VarG, b70VarJ, 9), false);
                        }
                        if (!UserConfig.getInstance(i17).isPremium() && !MessagesController.getInstance(photoViewer.P).premiumFeaturesBlocked() && !photoViewer.P4.sponsoredCanReport) {
                            b70VarG.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() {
                                @Override
                                public final void run() {
                                    int i20 = i15;
                                    jh.b bVar2 = bVar;
                                    int i21 = i17;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i20) {
                                        case 0:
                                            Drawable[] drawableArr3 = PhotoViewer.P8;
                                            if (!UserConfig.getInstance(i21).isPremium()) {
                                                new ag.g2(photoViewer2.f35661i4, 3, true).show();
                                            } else {
                                                new org.telegram.ui.Components.mc(photoViewer2.f35583a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i21).disableAds(true);
                                                org.telegram.ui.ActionBar.n2 n2Var = photoViewer2.f35661i4;
                                                if (n2Var instanceof rn) {
                                                    rn rnVar = (rn) n2Var;
                                                    rnVar.Fa(photoViewer2.P4);
                                                    rnVar.Ha(photoViewer2.P4);
                                                }
                                            }
                                            break;
                                        default:
                                            Drawable[] drawableArr4 = PhotoViewer.P8;
                                            if (!UserConfig.getInstance(i21).isPremium()) {
                                                new ag.g2(photoViewer2.f35661i4, 3, true).show();
                                            } else {
                                                new org.telegram.ui.Components.mc(photoViewer2.f35583a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i21).disableAds(true);
                                                org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer2.f35661i4;
                                                if (n2Var2 instanceof rn) {
                                                    rn rnVar2 = (rn) n2Var2;
                                                    rnVar2.Fa(photoViewer2.P4);
                                                    rnVar2.Ha(photoViewer2.P4);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (photoViewer.P4.sponsoredCanReport) {
                            b70VarG.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ff0(22, photoViewer, bVar), false);
                            if ((photoViewer.f35661i4 instanceof rn) && !MessagesController.getInstance(i17).premiumFeaturesBlocked()) {
                                b70VarG.k();
                                final int i20 = 1;
                                b70VarG.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i21 = i20;
                                        jh.b bVar2 = bVar;
                                        int i22 = i17;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i21) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.P8;
                                                if (!UserConfig.getInstance(i22).isPremium()) {
                                                    new ag.g2(photoViewer2.f35661i4, 3, true).show();
                                                } else {
                                                    new org.telegram.ui.Components.mc(photoViewer2.f35583a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i22).disableAds(true);
                                                    org.telegram.ui.ActionBar.n2 n2Var = photoViewer2.f35661i4;
                                                    if (n2Var instanceof rn) {
                                                        rn rnVar = (rn) n2Var;
                                                        rnVar.Fa(photoViewer2.P4);
                                                        rnVar.Ha(photoViewer2.P4);
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.P8;
                                                if (!UserConfig.getInstance(i22).isPremium()) {
                                                    new ag.g2(photoViewer2.f35661i4, 3, true).show();
                                                } else {
                                                    new org.telegram.ui.Components.mc(photoViewer2.f35583a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i22).disableAds(true);
                                                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer2.f35661i4;
                                                    if (n2Var2 instanceof rn) {
                                                        rn rnVar2 = (rn) n2Var2;
                                                        rnVar2.Fa(photoViewer2.P4);
                                                        rnVar2.Ha(photoViewer2.P4);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        if (b70VarG.x() > 0) {
                            b70VarG.Z();
                            break;
                        }
                    }
                }
                break;
            case 4:
                MessageObject messageObject4 = photoViewer.P4;
                if (messageObject4 != null && messageObject4.hasVideoQualities()) {
                    nr nrVar = photoViewer.F0;
                    MessageObject messageObject5 = photoViewer.P4;
                    LinearLayout linearLayout = nrVar.f40905b;
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i21 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList arrayListT = org.telegram.ui.Components.m61.t(i21, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i22 = 0;
                        while (i22 < arrayListT.size()) {
                            org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) arrayListT.get(i22);
                            org.telegram.ui.Components.k61 k61VarA = i61Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            int i23 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i16];
                            objArr[0] = Integer.valueOf(i61Var.b());
                            sb2.append(LocaleController.formatString(i23, objArr));
                            sb2.append(i61Var.f29261a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String string = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (k61VarA.b()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(k61VarA.f30012g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_mini_arrow_mediabold, 0);
                                cqVar.rotate(90.0f);
                                cqVar.translate(f12, AndroidUtilities.dp(1.0f));
                                cqVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(cqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(k61VarA.f30012g.size));
                            }
                            org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, linearLayout, 0, string, false, null);
                            f1VarC.setSubtext(spannableStringBuilder);
                            f1VarC.c(-328966, -328966);
                            f1VarC.f22912b.setPadding(0, 0, 0, 0);
                            f1VarC.setOnClickListener(new c0(nrVar, messageObject5, i61Var, 9));
                            f1VarC.setSelectorColor(268435455);
                            i22++;
                            f12 = 0.0f;
                            i16 = 1;
                        }
                        photoViewer.f35719p0.b();
                    }
                }
                ag.d2 d2Var = photoViewer.B;
                if (d2Var != null && d2Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.B.getActionBarMenuOnItemClick().b(2);
                    photoViewer.f35675k0.M(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.f35800y;
                if (activity != null) {
                    photoViewer.V3 = false;
                    photoViewer.U3 = 1;
                    if (photoViewer.T3 == -10) {
                        photoViewer.T3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.f35800y.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.f35800y.setRequestedOrientation(8);
                    } else {
                        photoViewer.f35800y.setRequestedOrientation(0);
                    }
                    photoViewer.j3(false, false);
                    break;
                }
                break;
            case 6:
                Activity activity2 = photoViewer.f35800y;
                if (activity2 != null) {
                    photoViewer.V3 = false;
                    photoViewer.U3 = 2;
                    if (photoViewer.T3 == -10) {
                        photoViewer.T3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.f35800y.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                MessageObject messageObject6 = photoViewer.P4;
                if (messageObject6 != null && messageObject6.isSponsored()) {
                    org.telegram.ui.ActionBar.n2 n2Var = photoViewer.f35661i4;
                    if (n2Var instanceof rn) {
                        ((rn) n2Var).J9(photoViewer.P4, false, true);
                    }
                    photoViewer.G0(true, false);
                    String str3 = photoViewer.P4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.C1;
                        if (context == null) {
                            context = photoViewer.A;
                        }
                        we.e.r(context, Uri.parse(str3), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.P).sponsoredLinksInappAllow, false);
                    }
                    break;
                }
                break;
        }
    }
}
