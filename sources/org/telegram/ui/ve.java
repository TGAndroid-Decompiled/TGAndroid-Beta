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
public final class ve implements RequestDelegate {
    public final int f40681a;
    public final fo f40682b;

    public ve(fo foVar, int i10) {
        this.f40681a = i10;
        this.f40682b = foVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40681a) {
            case 0:
                final fo foVar = this.f40682b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                fo.l1(foVar, tLObject);
                                return;
                            case 1:
                                fo.V0(foVar, tLObject);
                                return;
                            case 2:
                                fo foVar2 = foVar;
                                TLObject tLObject2 = tLObject;
                                foVar2.f35752o5 = 0;
                                if (tLObject2 == null && foVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar2.getParentActivity(), 0, foVar2.f35633ea);
                                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    foVar2.showDialog(alertDialog$Builder.f19248a);
                                    sk skVar = foVar2.Y;
                                    if (skVar != null) {
                                        skVar.Z0(null, null, false);
                                        foVar2.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                fo foVar3 = foVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(foVar3)) {
                                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar3);
                                            if (!foVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final fo foVar2 = this.f40682b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                fo.l1(foVar2, tLObject);
                                return;
                            case 1:
                                fo.V0(foVar2, tLObject);
                                return;
                            case 2:
                                fo foVar22 = foVar2;
                                TLObject tLObject2 = tLObject;
                                foVar22.f35752o5 = 0;
                                if (tLObject2 == null && foVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar22.getParentActivity(), 0, foVar22.f35633ea);
                                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    foVar22.showDialog(alertDialog$Builder.f19248a);
                                    sk skVar = foVar22.Y;
                                    if (skVar != null) {
                                        skVar.Z0(null, null, false);
                                        foVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                fo foVar3 = foVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(foVar3)) {
                                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar3);
                                            if (!foVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final fo foVar3 = this.f40682b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                fo.l1(foVar3, tLObject);
                                return;
                            case 1:
                                fo.V0(foVar3, tLObject);
                                return;
                            case 2:
                                fo foVar22 = foVar3;
                                TLObject tLObject2 = tLObject;
                                foVar22.f35752o5 = 0;
                                if (tLObject2 == null && foVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar22.getParentActivity(), 0, foVar22.f35633ea);
                                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    foVar22.showDialog(alertDialog$Builder.f19248a);
                                    sk skVar = foVar22.Y;
                                    if (skVar != null) {
                                        skVar.Z0(null, null, false);
                                        foVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                fo foVar32 = foVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(foVar32)) {
                                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar32);
                                            if (!foVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                final fo foVar4 = this.f40682b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                fo.l1(foVar4, tLObject);
                                return;
                            case 1:
                                fo.V0(foVar4, tLObject);
                                return;
                            case 2:
                                fo foVar22 = foVar4;
                                TLObject tLObject2 = tLObject;
                                foVar22.f35752o5 = 0;
                                if (tLObject2 == null && foVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar22.getParentActivity(), 0, foVar22.f35633ea);
                                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    foVar22.showDialog(alertDialog$Builder.f19248a);
                                    sk skVar = foVar22.Y;
                                    if (skVar != null) {
                                        skVar.Z0(null, null, false);
                                        foVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                fo foVar32 = foVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(foVar32)) {
                                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar32);
                                            if (!foVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                fo foVar5 = this.f40682b;
                if (tL_error != null) {
                    foVar5.getClass();
                    return;
                } else {
                    foVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                fo.e1(this.f40682b, tLObject);
                return;
        }
    }
}
