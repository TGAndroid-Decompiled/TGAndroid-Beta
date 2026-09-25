package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ProxyRotationController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class w11 extends org.telegram.ui.Components.vl0 {
    public final Context f38868c;
    public final ProxyListActivity d;

    public w11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f38868c = context;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int b10 = c1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 != i10 && b10 != proxyListActivity.v) {
            i11 = proxyListActivity.proxyAddRow;
            if (b10 != i11 && b10 != proxyListActivity.f31714y) {
                if (b10 < proxyListActivity.f31709n || b10 >= proxyListActivity.f31710r) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void E() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.F.size();
        kVar = ((org.telegram.ui.ActionBar.m2) proxyListActivity).actionBar;
        boolean s10 = kVar.s();
        if (size > 0) {
            proxyListActivity.E.a(size, s10);
            if (!s10) {
                kVar3 = ((org.telegram.ui.ActionBar.m2) proxyListActivity).actionBar;
                kVar3.O(null, null);
                int i10 = proxyListActivity.f31709n;
                r(i10, proxyListActivity.f31710r - i10, 2);
            }
        } else if (s10) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) proxyListActivity).actionBar;
            kVar2.r();
            int i11 = proxyListActivity.f31709n;
            r(i11, proxyListActivity.f31710r - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.F.clear();
        int i10 = proxyListActivity.f31709n;
        r(i10, proxyListActivity.f31710r - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        int i11 = proxyListActivity.f31709n;
        if (i10 >= i11 && i10 < proxyListActivity.f31710r) {
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.G.get(i10 - i11);
            if (arrayList.contains(proxyInfo)) {
                arrayList.remove(proxyInfo);
            } else {
                arrayList.add(proxyInfo);
            }
            n(i10, 1);
            E();
        }
    }

    @Override
    public final int h() {
        return this.d.e;
    }

    @Override
    public final long i(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.f31708f) {
            return -1L;
        }
        if (i10 != proxyListActivity.f31711s) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    return -4L;
                }
                if (i10 == proxyListActivity.h) {
                    return -6L;
                }
                if (i10 == proxyListActivity.f31714y) {
                    return -8L;
                }
                if (i10 == proxyListActivity.v) {
                    return -9L;
                }
                if (i10 == proxyListActivity.f31712w) {
                    return -10L;
                }
                if (i10 == proxyListActivity.f31713x) {
                    return -11L;
                }
                int i13 = proxyListActivity.f31709n;
                if (i10 >= i13 && i10 < proxyListActivity.f31710r) {
                    return ((SharedConfig.ProxyInfo) proxyListActivity.G.get(i10 - i13)).hashCode();
                }
                return -7L;
            }
            return -3L;
        }
        return -2L;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 != proxyListActivity.f31708f && i10 != proxyListActivity.f31711s) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11 && i10 != proxyListActivity.f31714y) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12 && i10 != proxyListActivity.v) {
                    if (i10 == proxyListActivity.h) {
                        return 2;
                    }
                    if (i10 == proxyListActivity.f31712w) {
                        return 6;
                    }
                    if (i10 >= proxyListActivity.f31709n && i10 < proxyListActivity.f31710r) {
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i13 = c1Var.f42964f;
        View view = c1Var.f42961a;
        boolean z11 = true;
        switch (i13) {
            case 1:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.f31714y == -1) {
                        z11 = false;
                    }
                    eaVar.b(string, z11);
                    return;
                } else if (i10 == proxyListActivity.f31714y) {
                    eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
                    eaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == proxyListActivity.h) {
                    m4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    String string2 = LocaleController.getString(R.string.UseProxySettings);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.v == -1) {
                        z11 = false;
                    }
                    w8Var.f(string2, z12, z11);
                    return;
                } else if (i10 == proxyListActivity.v) {
                    w8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == proxyListActivity.f31713x) {
                    e9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                }
                return;
            case 5:
                x11 x11Var = (x11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f31709n);
                x11Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x11Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f31709n));
                x11Var.h = contains;
                x11Var.f39797f.a(contains, false);
                x11Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f31712w) {
                    org.telegram.ui.Components.ew0 ew0Var = (org.telegram.ui.Components.ew0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i14));
                    }
                    ew0Var.setCallback(new org.telegram.ui.Components.voip.e1(21));
                    ew0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(s4.c1 c1Var, int i10, List list) {
        int i11;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        int i12 = c1Var.f42964f;
        View view = c1Var.f42961a;
        if (i12 == 5 && !list.isEmpty()) {
            x11 x11Var = (x11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i10 - proxyListActivity.f31709n))) != x11Var.h) {
                x11Var.h = contains;
                x11Var.f39797f.a(contains, true);
            }
            if (list.contains(2)) {
                x11Var.a(!arrayList.isEmpty(), true);
            }
        } else if (c1Var.f42964f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 == i11) {
                w8Var.setChecked(proxyListActivity.d);
            } else if (i10 == proxyListActivity.v) {
                w8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        } else {
            v(c1Var, i10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        Context context = this.f38868c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                b7Var = new x11(this.d, context);
                                b7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
                            } else {
                                b7Var = new org.telegram.ui.Components.ew0(context, null);
                                b7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
                            }
                        } else {
                            b7Var = new org.telegram.ui.Cells.e9(context);
                        }
                    } else {
                        b7Var = new org.telegram.ui.Cells.w8(context);
                        b7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
                    }
                } else {
                    b7Var = new org.telegram.ui.Cells.m4(context);
                    b7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
                }
            } else {
                b7Var = new org.telegram.ui.Cells.ea(context);
                b7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
            }
        } else {
            b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        }
        return com.google.android.gms.internal.vision.e2.k(b7Var, b7Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        if (c1Var.f42964f == 3) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.f42961a;
            int b10 = c1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                w8Var.setChecked(proxyListActivity.d);
            } else if (b10 == proxyListActivity.v) {
                w8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
