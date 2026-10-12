package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te implements RequestDelegate {
    public final int f42168a;
    public final eo f42169b;

    public te(eo eoVar, int i10) {
        this.f42168a = i10;
        this.f42169b = eoVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42168a) {
            case 0:
                final eo eoVar = this.f42169b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                eo.l1(eoVar, tLObject);
                                return;
                            case 1:
                                eo.V0(eoVar, tLObject);
                                return;
                            case 2:
                                eo eoVar2 = eoVar;
                                TLObject tLObject2 = tLObject;
                                eoVar2.f37367o5 = 0;
                                if (tLObject2 == null && eoVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar2.getParentActivity(), 0, eoVar2.f37251ea);
                                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar2.showDialog(alertDialog$Builder.f20141a);
                                    sk skVar = eoVar2.Y;
                                    if (skVar != null) {
                                        skVar.e1(null, null, false);
                                        eoVar2.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                eo eoVar3 = eoVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(eoVar3)) {
                                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(eoVar3);
                                            if (!eoVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final eo eoVar2 = this.f42169b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                eo.l1(eoVar2, tLObject);
                                return;
                            case 1:
                                eo.V0(eoVar2, tLObject);
                                return;
                            case 2:
                                eo eoVar22 = eoVar2;
                                TLObject tLObject2 = tLObject;
                                eoVar22.f37367o5 = 0;
                                if (tLObject2 == null && eoVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar22.getParentActivity(), 0, eoVar22.f37251ea);
                                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar22.showDialog(alertDialog$Builder.f20141a);
                                    sk skVar = eoVar22.Y;
                                    if (skVar != null) {
                                        skVar.e1(null, null, false);
                                        eoVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                eo eoVar3 = eoVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(eoVar3)) {
                                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(eoVar3);
                                            if (!eoVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final eo eoVar3 = this.f42169b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                eo.l1(eoVar3, tLObject);
                                return;
                            case 1:
                                eo.V0(eoVar3, tLObject);
                                return;
                            case 2:
                                eo eoVar22 = eoVar3;
                                TLObject tLObject2 = tLObject;
                                eoVar22.f37367o5 = 0;
                                if (tLObject2 == null && eoVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar22.getParentActivity(), 0, eoVar22.f37251ea);
                                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar22.showDialog(alertDialog$Builder.f20141a);
                                    sk skVar = eoVar22.Y;
                                    if (skVar != null) {
                                        skVar.e1(null, null, false);
                                        eoVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                eo eoVar32 = eoVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(eoVar32)) {
                                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(eoVar32);
                                            if (!eoVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                final eo eoVar4 = this.f42169b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                eo.l1(eoVar4, tLObject);
                                return;
                            case 1:
                                eo.V0(eoVar4, tLObject);
                                return;
                            case 2:
                                eo eoVar22 = eoVar4;
                                TLObject tLObject2 = tLObject;
                                eoVar22.f37367o5 = 0;
                                if (tLObject2 == null && eoVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar22.getParentActivity(), 0, eoVar22.f37251ea);
                                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar22.showDialog(alertDialog$Builder.f20141a);
                                    sk skVar = eoVar22.Y;
                                    if (skVar != null) {
                                        skVar.e1(null, null, false);
                                        eoVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                eo eoVar32 = eoVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(eoVar32)) {
                                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(eoVar32);
                                            if (!eoVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                eo eoVar5 = this.f42169b;
                if (tL_error != null) {
                    eoVar5.getClass();
                    return;
                } else {
                    eoVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                eo.e1(this.f42169b, tLObject);
                return;
        }
    }
}
