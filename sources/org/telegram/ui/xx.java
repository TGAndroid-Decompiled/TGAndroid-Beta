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
public final class xx extends mu0 {
    public final boolean[] f39675a;
    public final ry f39676b;

    public xx(ry ryVar, boolean[] zArr) {
        this.f39676b = ryVar;
        this.f39675a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        ry ryVar = this.f39676b;
        if (i10 >= 0 && i10 < ryVar.D2.size() && ((MediaController.PhotoEntry) ryVar.D2.get(i10)).isVideo) {
            return null;
        }
        return ry.s2(ryVar);
    }

    @Override
    public final void D() {
        int i10;
        ry ryVar = this.f39676b;
        org.telegram.ui.Components.mq0 mq0Var = ryVar.G2;
        if (mq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
            mq0Var.i(i10, ryVar.D2);
        }
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var;
        ry ryVar = this.f39676b;
        org.telegram.ui.Components.mq0 mq0Var = ryVar.G2;
        if (mq0Var != null) {
            w9Var = mq0Var.f(i10);
        } else {
            w9Var = null;
        }
        if (w9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        wu0 wu0Var = new wu0();
        wu0Var.f39095b = iArr[0];
        wu0Var.f39096c = iArr[1];
        wu0Var.d = ryVar.G2;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        wu0Var.f39094a = imageReceiver;
        wu0Var.e = imageReceiver.getBitmapSafe();
        wu0Var.f39101k = w9Var.getScaleX();
        wu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return wu0Var;
    }

    @Override
    public final long a() {
        ry ryVar = this.f39676b;
        if (ryVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) ryVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        ry ryVar = this.f39676b;
        ArrayList arrayList = ryVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = ryVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) ryVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = ryVar.D2;
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
        ry ryVar = this.f39676b;
        bx bxVar = ryVar.B1;
        if (bxVar != null) {
            bxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ryVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.w9 w9Var;
        org.telegram.ui.Components.mq0 mq0Var = this.f39676b.G2;
        if (mq0Var != null) {
            w9Var = mq0Var.f(i10);
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
        ry ryVar = this.f39676b;
        ArrayList arrayList2 = ryVar.I2;
        if (ryVar.B1 != null && (arrayList = ryVar.D2) != null && !arrayList.isEmpty()) {
            bx bxVar = ryVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) ryVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            bxVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.mq0 mq0Var = ryVar.G2;
        if (mq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
            mq0Var.i(i13, ryVar.D2);
        }
        if ((!z10 || i11 != 0) && ryVar.C2 != null && !arrayList2.isEmpty()) {
            ryVar.J2 = z10;
            ryVar.K2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            ryVar.C2.u(ryVar, arrayList3, ryVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        bx bxVar;
        org.telegram.ui.Components.ld f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        ry ryVar = this.f39676b;
        if (charSequence != null && (bxVar = ryVar.B1) != null) {
            bxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ryVar.D2;
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
        return this.f39675a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
