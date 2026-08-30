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
public final class ux extends yt0 {
    public final boolean[] f39015a;
    public final oy f39016b;

    public ux(oy oyVar, boolean[] zArr) {
        this.f39016b = oyVar;
        this.f39015a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        oy oyVar = this.f39016b;
        if (i10 >= 0 && i10 < oyVar.A2.size() && ((MediaController.PhotoEntry) oyVar.A2.get(i10)).isVideo) {
            return null;
        }
        return oy.s2(oyVar);
    }

    @Override
    public final void D() {
        int i10;
        oy oyVar = this.f39016b;
        org.telegram.ui.Components.qq0 qq0Var = oyVar.D2;
        if (qq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
            qq0Var.i(i10, oyVar.A2);
        }
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var;
        oy oyVar = this.f39016b;
        org.telegram.ui.Components.qq0 qq0Var = oyVar.D2;
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
        ju0 ju0Var = new ju0();
        ju0Var.f35496b = iArr[0];
        ju0Var.f35497c = iArr[1];
        ju0Var.d = oyVar.D2;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        ju0Var.f35495a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        ju0Var.f35502k = p9Var.getScaleX();
        ju0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return ju0Var;
    }

    @Override
    public final long a() {
        oy oyVar = this.f39016b;
        if (oyVar.F2.isEmpty()) {
            return 0L;
        }
        return ((Long) oyVar.F2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ux.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        oy oyVar = this.f39016b;
        ArrayList arrayList = oyVar.A2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = oyVar.A2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) oyVar.A2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = oyVar.A2;
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
        oy oyVar = this.f39016b;
        zw zwVar = oyVar.f37126y1;
        if (zwVar != null) {
            zwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = oyVar.A2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ux.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.p9 p9Var;
        org.telegram.ui.Components.qq0 qq0Var = this.f39016b.D2;
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
        oy oyVar = this.f39016b;
        ArrayList arrayList2 = oyVar.F2;
        if (oyVar.f37126y1 != null && (arrayList = oyVar.A2) != null && !arrayList.isEmpty()) {
            zw zwVar = oyVar.f37126y1;
            CharSequence charSequence = ((MediaController.PhotoEntry) oyVar.A2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            zwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.qq0 qq0Var = oyVar.D2;
        if (qq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
            qq0Var.i(i13, oyVar.A2);
        }
        if ((!z4 || i11 != 0) && oyVar.f37131z2 != null && !arrayList2.isEmpty()) {
            oyVar.G2 = z4;
            oyVar.H2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            oyVar.f37131z2.w(oyVar, arrayList3, oyVar.f37126y1.getFieldText(), false, z4, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        zw zwVar;
        org.telegram.ui.Components.bd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        oy oyVar = this.f39016b;
        if (charSequence != null && (zwVar = oyVar.f37126y1) != null) {
            zwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = oyVar.A2;
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
        return this.f39015a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
