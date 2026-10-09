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
public final class zx extends uu0 {
    public final boolean[] f45086a;
    public final ty f45087b;

    public zx(ty tyVar, boolean[] zArr) {
        this.f45087b = tyVar;
        this.f45086a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        ty tyVar = this.f45087b;
        if (i10 >= 0 && i10 < tyVar.D2.size() && ((MediaController.PhotoEntry) tyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return ty.p2(tyVar);
    }

    @Override
    public final void D() {
        int i10;
        ty tyVar = this.f45087b;
        org.telegram.ui.Components.rr0 rr0Var = tyVar.G2;
        if (rr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            rr0Var.i(i10, tyVar.D2);
        }
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var;
        ty tyVar = this.f45087b;
        org.telegram.ui.Components.rr0 rr0Var = tyVar.G2;
        if (rr0Var != null) {
            y9Var = rr0Var.f(i10);
        } else {
            y9Var = null;
        }
        if (y9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.f37355b = iArr[0];
        ev0Var.f37356c = iArr[1];
        ev0Var.d = tyVar.G2;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        ev0Var.f37354a = imageReceiver;
        ev0Var.f37357e = imageReceiver.getBitmapSafe();
        ev0Var.f37362k = y9Var.getScaleX();
        ev0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return ev0Var;
    }

    @Override
    public final long a() {
        ty tyVar = this.f45087b;
        if (tyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) tyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        ty tyVar = this.f45087b;
        ArrayList arrayList = tyVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = tyVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) tyVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = tyVar.D2;
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
        ty tyVar = this.f45087b;
        dx dxVar = tyVar.B1;
        if (dxVar != null) {
            dxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = tyVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.y9 y9Var;
        org.telegram.ui.Components.rr0 rr0Var = this.f45087b.G2;
        if (rr0Var != null) {
            y9Var = rr0Var.f(i10);
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
        ty tyVar = this.f45087b;
        ArrayList arrayList2 = tyVar.I2;
        if (tyVar.B1 != null && (arrayList = tyVar.D2) != null && !arrayList.isEmpty()) {
            dx dxVar = tyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) tyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            dxVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.rr0 rr0Var = tyVar.G2;
        if (rr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            rr0Var.i(i13, tyVar.D2);
        }
        if ((!z10 || i11 != 0) && tyVar.C2 != null && !arrayList2.isEmpty()) {
            tyVar.J2 = z10;
            tyVar.K2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            tyVar.C2.w(tyVar, arrayList3, tyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        dx dxVar;
        org.telegram.ui.Components.od f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.R1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        ty tyVar = this.f45087b;
        if (charSequence != null && (dxVar = tyVar.B1) != null) {
            dxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = tyVar.D2;
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
        return this.f45086a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
