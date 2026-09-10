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
public final class re implements RequestDelegate {
    public final int f36345a;
    public final eo f36346b;

    public re(eo eoVar, int i10) {
        this.f36345a = i10;
        this.f36346b = eoVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36345a) {
            case 0:
                final eo eoVar = this.f36346b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                eo.G0(eoVar, tLObject);
                                return;
                            case 1:
                                eo.K0(eoVar, tLObject);
                                return;
                            case 2:
                                eo eoVar2 = eoVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(eoVar2)) {
                                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar2);
                                            if (!eoVar2.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                eo eoVar3 = eoVar;
                                TLObject tLObject3 = tLObject;
                                eoVar3.f32432o5 = 0;
                                if (tLObject3 == null && eoVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar3.getParentActivity(), 0, eoVar3.f32316ea);
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar3.showDialog(alertDialog$Builder.f17528a);
                                    ok okVar = eoVar3.Y;
                                    if (okVar != null) {
                                        okVar.c1(null, null, false);
                                        eoVar3.e9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final eo eoVar2 = this.f36346b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                eo.G0(eoVar2, tLObject);
                                return;
                            case 1:
                                eo.K0(eoVar2, tLObject);
                                return;
                            case 2:
                                eo eoVar22 = eoVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(eoVar22)) {
                                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar22);
                                            if (!eoVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                eo eoVar3 = eoVar2;
                                TLObject tLObject3 = tLObject;
                                eoVar3.f32432o5 = 0;
                                if (tLObject3 == null && eoVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar3.getParentActivity(), 0, eoVar3.f32316ea);
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar3.showDialog(alertDialog$Builder.f17528a);
                                    ok okVar = eoVar3.Y;
                                    if (okVar != null) {
                                        okVar.c1(null, null, false);
                                        eoVar3.e9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final eo eoVar3 = this.f36346b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                eo.G0(eoVar3, tLObject);
                                return;
                            case 1:
                                eo.K0(eoVar3, tLObject);
                                return;
                            case 2:
                                eo eoVar22 = eoVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(eoVar22)) {
                                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar22);
                                            if (!eoVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                eo eoVar32 = eoVar3;
                                TLObject tLObject3 = tLObject;
                                eoVar32.f32432o5 = 0;
                                if (tLObject3 == null && eoVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar32.getParentActivity(), 0, eoVar32.f32316ea);
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar32.showDialog(alertDialog$Builder.f17528a);
                                    ok okVar = eoVar32.Y;
                                    if (okVar != null) {
                                        okVar.c1(null, null, false);
                                        eoVar32.e9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                final eo eoVar4 = this.f36346b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                eo.G0(eoVar4, tLObject);
                                return;
                            case 1:
                                eo.K0(eoVar4, tLObject);
                                return;
                            case 2:
                                eo eoVar22 = eoVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(eoVar22)) {
                                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar22);
                                            if (!eoVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                eo eoVar32 = eoVar4;
                                TLObject tLObject3 = tLObject;
                                eoVar32.f32432o5 = 0;
                                if (tLObject3 == null && eoVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar32.getParentActivity(), 0, eoVar32.f32316ea);
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar32.showDialog(alertDialog$Builder.f17528a);
                                    ok okVar = eoVar32.Y;
                                    if (okVar != null) {
                                        okVar.c1(null, null, false);
                                        eoVar32.e9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                eo eoVar5 = this.f36346b;
                if (tL_error != null) {
                    eoVar5.getClass();
                    return;
                } else {
                    eoVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                eo.Z0(this.f36346b, tLObject);
                return;
        }
    }
}
