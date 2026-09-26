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
public final class wx extends lu0 {
    public final boolean[] f39775a;
    public final qy f39776b;

    public wx(qy qyVar, boolean[] zArr) {
        this.f39776b = qyVar;
        this.f39775a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        qy qyVar = this.f39776b;
        if (i10 >= 0 && i10 < qyVar.D2.size() && ((MediaController.PhotoEntry) qyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return qy.s2(qyVar);
    }

    @Override
    public final void D() {
        int i10;
        qy qyVar = this.f39776b;
        org.telegram.ui.Components.zq0 zq0Var = qyVar.G2;
        if (zq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            zq0Var.i(i10, qyVar.D2);
        }
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var;
        qy qyVar = this.f39776b;
        org.telegram.ui.Components.zq0 zq0Var = qyVar.G2;
        if (zq0Var != null) {
            w9Var = zq0Var.f(i10);
        } else {
            w9Var = null;
        }
        if (w9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        vu0 vu0Var = new vu0();
        vu0Var.f38820b = iArr[0];
        vu0Var.f38821c = iArr[1];
        vu0Var.d = qyVar.G2;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        vu0Var.f38819a = imageReceiver;
        vu0Var.e = imageReceiver.getBitmapSafe();
        vu0Var.f38826k = w9Var.getScaleX();
        vu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return vu0Var;
    }

    @Override
    public final long a() {
        qy qyVar = this.f39776b;
        if (qyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) qyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        qy qyVar = this.f39776b;
        ArrayList arrayList = qyVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = qyVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) qyVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = qyVar.D2;
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
        qy qyVar = this.f39776b;
        ax axVar = qyVar.B1;
        if (axVar != null) {
            axVar.setFieldText(charSequence);
        }
        ArrayList arrayList = qyVar.D2;
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
        org.telegram.ui.Components.w9 w9Var;
        org.telegram.ui.Components.zq0 zq0Var = this.f39776b.G2;
        if (zq0Var != null) {
            w9Var = zq0Var.f(i10);
        } else {
            w9Var = null;
        }
        if (w9Var == null) {
            return null;
        }
        return w9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        qy qyVar = this.f39776b;
        ArrayList arrayList2 = qyVar.I2;
        if (qyVar.B1 != null && (arrayList = qyVar.D2) != null && !arrayList.isEmpty()) {
            ax axVar = qyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) qyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            axVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.zq0 zq0Var = qyVar.G2;
        if (zq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            zq0Var.i(i13, qyVar.D2);
        }
        if ((!z10 || i11 != 0) && qyVar.C2 != null && !arrayList2.isEmpty()) {
            qyVar.J2 = z10;
            qyVar.K2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            qyVar.C2.u(qyVar, arrayList3, qyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        ax axVar;
        org.telegram.ui.Components.md f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        qy qyVar = this.f39776b;
        if (charSequence != null && (axVar = qyVar.B1) != null) {
            axVar.setFieldText(charSequence);
        }
        ArrayList arrayList = qyVar.D2;
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
        return this.f39775a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
