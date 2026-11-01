package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class zh implements org.telegram.messenger.s20 {
    public final int f44003a;

    public zh(int i10) {
        this.f44003a = i10;
    }

    @Override
    public final Object a(Object obj) {
        boolean z10 = true;
        switch (this.f44003a) {
            case 0:
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                if (kjVar == null || kjVar.R0() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj;
                if (kjVar2 == null || kjVar2.M0() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                return org.telegram.messenger.dd.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 3:
                return org.telegram.messenger.dd.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 4:
                View view = (View) obj;
                if ((view instanceof org.telegram.ui.Cells.b9) || (view instanceof org.telegram.ui.Cells.c7) || (view instanceof b10) || (view instanceof org.telegram.ui.Cells.z3) || (view instanceof org.telegram.ui.Cells.d2) || Objects.equals(view.getTag(), -33024)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 5:
                return Boolean.valueOf(org.telegram.ui.Components.q51.K(((Integer) obj).intValue()));
            case 6:
                TL_wallet.exportSecretPhrase exportsecretphrase = new TL_wallet.exportSecretPhrase();
                exportsecretphrase.password = (TLRPC.InputCheckPasswordSRP) obj;
                return exportsecretphrase;
            case 7:
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                replacewallet.wallet = new TL_wallet.inputWalletNew();
                replacewallet.password = (TLRPC.InputCheckPasswordSRP) obj;
                return replacewallet;
            case 8:
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.password = (TLRPC.InputCheckPasswordSRP) obj;
                return disablebackup;
            case 9:
                return Boolean.valueOf(org.telegram.ui.Wallet.b6.C0(org.telegram.ui.Wallet.b6.b1((String) obj)));
            case 10:
                if (org.telegram.ui.Wallet.ba.l0((String) obj) == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 11:
                String str = (String) obj;
                if (TextUtils.isEmpty(str) || (!str.startsWith("tg:") && !gf.f.e(Uri.parse(str), false, null))) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 12:
                String str2 = (String) obj;
                org.telegram.ui.Components.gr grVar = qh.y.f46067z0;
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("tg:") && !gf.f.e(Uri.parse(str2), false, null))) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
        }
    }
}
