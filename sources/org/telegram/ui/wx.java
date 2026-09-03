package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class wx extends fu0 {
    public final boolean[] f39782a;
    public final qy f39783b;

    public wx(qy qyVar, boolean[] zArr) {
        this.f39783b = qyVar;
        this.f39782a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        qy qyVar = this.f39783b;
        if (i10 >= 0 && i10 < qyVar.A2.size() && ((MediaController.PhotoEntry) qyVar.A2.get(i10)).isVideo) {
            return null;
        }
        return qy.s2(qyVar);
    }

    @Override
    public final void D() {
        int i10;
        qy qyVar = this.f39783b;
        org.telegram.ui.Components.qq0 qq0Var = qyVar.D2;
        if (qq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
            qq0Var.i(i10, qyVar.A2);
        }
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var;
        qy qyVar = this.f39783b;
        org.telegram.ui.Components.qq0 qq0Var = qyVar.D2;
        if (qq0Var != null) {
            p9Var = qq0Var.f(i10);
        } else {
            p9Var = null;
        }
        if (p9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.f37488b = iArr[0];
        qu0Var.f37489c = iArr[1];
        qu0Var.d = qyVar.D2;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        qu0Var.f37487a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.f37494k = p9Var.getScaleX();
        qu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return qu0Var;
    }

    @Override
    public final long a() {
        qy qyVar = this.f39783b;
        if (qyVar.F2.isEmpty()) {
            return 0L;
        }
        return ((Long) qyVar.F2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        qy qyVar = this.f39783b;
        ArrayList arrayList = qyVar.A2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = qyVar.A2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) qyVar.A2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = qyVar.A2;
            int size2 = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((MediaController.PhotoEntry) obj).isVideo) {
                    i12++;
                } else {
                    i13++;
                }
            }
            if (i12 == 0) {
                return LocaleController.formatPluralString("ShareSendPhotos", size, new Object[0]);
            }
            if (i13 == 0) {
                return LocaleController.formatPluralString("ShareSendVideos", size, new Object[0]);
            }
            return LocaleController.formatPluralString("ShareSendItems", size, new Object[0]);
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        qy qyVar = this.f39783b;
        bx bxVar = qyVar.f37644y1;
        if (bxVar != null) {
            bxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = qyVar.A2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.p9 p9Var;
        org.telegram.ui.Components.qq0 qq0Var = this.f39783b.D2;
        if (qq0Var != null) {
            p9Var = qq0Var.f(i10);
        } else {
            p9Var = null;
        }
        if (p9Var == null) {
            return null;
        }
        return p9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        int i13;
        ArrayList arrayList;
        qy qyVar = this.f39783b;
        ArrayList arrayList2 = qyVar.F2;
        if (qyVar.f37644y1 != null && (arrayList = qyVar.A2) != null && !arrayList.isEmpty()) {
            bx bxVar = qyVar.f37644y1;
            CharSequence charSequence = ((MediaController.PhotoEntry) qyVar.A2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            bxVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.qq0 qq0Var = qyVar.D2;
        if (qq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
            qq0Var.i(i13, qyVar.A2);
        }
        if ((!z4 || i11 != 0) && qyVar.f37649z2 != null && !arrayList2.isEmpty()) {
            qyVar.G2 = z4;
            qyVar.H2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            qyVar.f37649z2.w(qyVar, arrayList3, qyVar.f37644y1.getFieldText(), false, z4, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        bx bxVar;
        org.telegram.ui.Components.bd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        qy qyVar = this.f39783b;
        if (charSequence != null && (bxVar = qyVar.f37644y1) != null) {
            bxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = qyVar.A2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i10) {
        return this.f39782a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
