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
public final class vx extends au0 {
    public final boolean[] f42313a;
    public final py f42314b;

    public vx(py pyVar, boolean[] zArr) {
        this.f42314b = pyVar;
        this.f42313a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        py pyVar = this.f42314b;
        if (i10 >= 0 && i10 < pyVar.A2.size() && ((MediaController.PhotoEntry) pyVar.A2.get(i10)).isVideo) {
            return null;
        }
        return py.s2(pyVar);
    }

    @Override
    public final void D() {
        int i10;
        py pyVar = this.f42314b;
        org.telegram.ui.Components.rq0 rq0Var = pyVar.D2;
        if (rq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            rq0Var.i(i10, pyVar.A2);
        }
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var;
        py pyVar = this.f42314b;
        org.telegram.ui.Components.rq0 rq0Var = pyVar.D2;
        if (rq0Var != null) {
            p9Var = rq0Var.f(i10);
        } else {
            p9Var = null;
        }
        if (p9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.f38865b = iArr[0];
        lu0Var.f38866c = iArr[1];
        lu0Var.d = pyVar.D2;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        lu0Var.f38864a = imageReceiver;
        lu0Var.f38867e = imageReceiver.getBitmapSafe();
        lu0Var.f38872k = p9Var.getScaleX();
        lu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return lu0Var;
    }

    @Override
    public final long a() {
        py pyVar = this.f42314b;
        if (pyVar.F2.isEmpty()) {
            return 0L;
        }
        return ((Long) pyVar.F2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        py pyVar = this.f42314b;
        ArrayList arrayList = pyVar.A2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = pyVar.A2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) pyVar.A2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = pyVar.A2;
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
        py pyVar = this.f42314b;
        ax axVar = pyVar.f40303y1;
        if (axVar != null) {
            axVar.setFieldText(charSequence);
        }
        ArrayList arrayList = pyVar.A2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.p9 p9Var;
        org.telegram.ui.Components.rq0 rq0Var = this.f42314b.D2;
        if (rq0Var != null) {
            p9Var = rq0Var.f(i10);
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
        py pyVar = this.f42314b;
        ArrayList arrayList2 = pyVar.F2;
        if (pyVar.f40303y1 != null && (arrayList = pyVar.A2) != null && !arrayList.isEmpty()) {
            ax axVar = pyVar.f40303y1;
            CharSequence charSequence = ((MediaController.PhotoEntry) pyVar.A2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            axVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.rq0 rq0Var = pyVar.D2;
        if (rq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            rq0Var.i(i13, pyVar.A2);
        }
        if ((!z4 || i11 != 0) && pyVar.f40308z2 != null && !arrayList2.isEmpty()) {
            pyVar.G2 = z4;
            pyVar.H2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            pyVar.f40308z2.v(pyVar, arrayList3, pyVar.f40303y1.getFieldText(), false, z4, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        ax axVar;
        org.telegram.ui.Components.bd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        py pyVar = this.f42314b;
        if (charSequence != null && (axVar = pyVar.f40303y1) != null) {
            axVar.setFieldText(charSequence);
        }
        ArrayList arrayList = pyVar.A2;
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
        return this.f42313a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
