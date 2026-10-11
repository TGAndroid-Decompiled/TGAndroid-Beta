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
public final class yx extends tu0 {
    public final boolean[] f44553a;
    public final sy f44554b;

    public yx(sy syVar, boolean[] zArr) {
        this.f44554b = syVar;
        this.f44553a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        sy syVar = this.f44554b;
        if (i10 >= 0 && i10 < syVar.D2.size() && ((MediaController.PhotoEntry) syVar.D2.get(i10)).isVideo) {
            return null;
        }
        return sy.p2(syVar);
    }

    @Override
    public final void D() {
        int i10;
        sy syVar = this.f44554b;
        org.telegram.ui.Components.sr0 sr0Var = syVar.G2;
        if (sr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
            sr0Var.i(i10, syVar.D2);
        }
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var;
        sy syVar = this.f44554b;
        org.telegram.ui.Components.sr0 sr0Var = syVar.G2;
        if (sr0Var != null) {
            y9Var = sr0Var.f(i10);
        } else {
            y9Var = null;
        }
        if (y9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f37148b = iArr[0];
        dv0Var.f37149c = iArr[1];
        dv0Var.d = syVar.G2;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        dv0Var.f37147a = imageReceiver;
        dv0Var.f37150e = imageReceiver.getBitmapSafe();
        dv0Var.f37155k = y9Var.getScaleX();
        dv0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return dv0Var;
    }

    @Override
    public final long a() {
        sy syVar = this.f44554b;
        if (syVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) syVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        sy syVar = this.f44554b;
        ArrayList arrayList = syVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = syVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) syVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = syVar.D2;
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
        sy syVar = this.f44554b;
        cx cxVar = syVar.B1;
        if (cxVar != null) {
            cxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = syVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.y9 y9Var;
        org.telegram.ui.Components.sr0 sr0Var = this.f44554b.G2;
        if (sr0Var != null) {
            y9Var = sr0Var.f(i10);
        } else {
            y9Var = null;
        }
        if (y9Var == null) {
            return null;
        }
        return y9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        sy syVar = this.f44554b;
        ArrayList arrayList2 = syVar.I2;
        if (syVar.B1 != null && (arrayList = syVar.D2) != null && !arrayList.isEmpty()) {
            cx cxVar = syVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) syVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            cxVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.sr0 sr0Var = syVar.G2;
        if (sr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
            sr0Var.i(i13, syVar.D2);
        }
        if ((!z10 || i11 != 0) && syVar.C2 != null && !arrayList2.isEmpty()) {
            syVar.J2 = z10;
            syVar.K2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            syVar.C2.w(syVar, arrayList3, syVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        cx cxVar;
        org.telegram.ui.Components.od f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.R1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        sy syVar = this.f44554b;
        if (charSequence != null && (cxVar = syVar.B1) != null) {
            cxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = syVar.D2;
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
        return this.f44553a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
