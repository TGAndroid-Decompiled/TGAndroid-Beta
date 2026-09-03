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
public final class u11 extends org.telegram.ui.Components.rl0 {
    public final Context f41695c;
    public final ProxyListActivity d;

    public u11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f41695c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int i11;
        int i12;
        int b10 = m1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 != i10 && b10 != proxyListActivity.f34747w) {
            i11 = proxyListActivity.callsRow;
            if (b10 != i11) {
                i12 = proxyListActivity.proxyAddRow;
                if (b10 != i12 && b10 != proxyListActivity.C) {
                    if (b10 < proxyListActivity.f34745r || b10 >= proxyListActivity.f34746s) {
                        return false;
                    }
                    return true;
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
        int size = proxyListActivity.E.size();
        kVar = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
        boolean s6 = kVar.s();
        if (size > 0) {
            proxyListActivity.D.a(size, s6);
            if (!s6) {
                kVar3 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
                kVar3.O(null, null);
                int i10 = proxyListActivity.f34745r;
                r(i10, proxyListActivity.f34746s - i10, 2);
            }
        } else if (s6) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
            kVar2.r();
            int i11 = proxyListActivity.f34745r;
            r(i11, proxyListActivity.f34746s - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.E.clear();
        int i10 = proxyListActivity.f34745r;
        r(i10, proxyListActivity.f34746s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i11 = proxyListActivity.f34745r;
        if (i10 >= i11 && i10 < proxyListActivity.f34746s) {
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.F.get(i10 - i11);
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
        return this.d.f34743f;
    }

    @Override
    public final long i(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h) {
            return -1L;
        }
        if (i10 != proxyListActivity.v) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        return -5L;
                    }
                    if (i10 == proxyListActivity.f34744n) {
                        return -6L;
                    }
                    if (i10 == proxyListActivity.C) {
                        return -8L;
                    }
                    if (i10 == proxyListActivity.f34747w) {
                        return -9L;
                    }
                    if (i10 == proxyListActivity.f34748x) {
                        return -10L;
                    }
                    if (i10 == proxyListActivity.f34749y) {
                        return -11L;
                    }
                    int i14 = proxyListActivity.f34745r;
                    if (i10 >= i14 && i10 < proxyListActivity.f34746s) {
                        return ((SharedConfig.ProxyInfo) proxyListActivity.F.get(i10 - i14)).hashCode();
                    }
                    return -7L;
                }
                return -4L;
            }
            return -3L;
        }
        return -2L;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 != proxyListActivity.h && i10 != proxyListActivity.v) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11 && i10 != proxyListActivity.C) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12 && i10 != proxyListActivity.f34747w) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 != i13) {
                        if (i10 == proxyListActivity.f34744n) {
                            return 2;
                        }
                        if (i10 == proxyListActivity.f34748x) {
                            return 6;
                        }
                        if (i10 >= proxyListActivity.f34745r && i10 < proxyListActivity.f34746s) {
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z4;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i14 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z10 = true;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.C == -1) {
                        z10 = false;
                    }
                    aaVar.b(string, z10);
                    return;
                } else if (i10 == proxyListActivity.C) {
                    aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21878p7, false));
                    aaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == proxyListActivity.f34744n) {
                    m4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        s8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.f34742e, false);
                        return;
                    } else if (i10 == proxyListActivity.f34747w) {
                        s8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        return;
                    } else {
                        return;
                    }
                }
                String string2 = LocaleController.getString(R.string.UseProxySettings);
                boolean z11 = proxyListActivity.d;
                if (proxyListActivity.f34747w == -1) {
                    z10 = false;
                }
                s8Var.f(string2, z11, z10);
                return;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 == proxyListActivity.B) {
                    a9Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    return;
                } else if (i10 == proxyListActivity.f34749y) {
                    a9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                } else {
                    return;
                }
            case 5:
                v11 v11Var = (v11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f34745r);
                v11Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                v11Var.setChecked(z4);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f34745r));
                v11Var.h = contains;
                v11Var.f41992f.a(contains, false);
                v11Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f34748x) {
                    org.telegram.ui.Components.uv0 uv0Var = (org.telegram.ui.Components.uv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    uv0Var.setCallback(new cl0(7));
                    uv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(f2.m1 m1Var, int i10, List list) {
        int i11;
        int i12;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i13 == 5 && !list.isEmpty()) {
            v11 v11Var = (v11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i10 - proxyListActivity.f34745r))) != v11Var.h) {
                v11Var.h = contains;
                v11Var.f41992f.a(contains, true);
            }
            if (list.contains(2)) {
                v11Var.a(!arrayList.isEmpty(), true);
            }
        } else if (m1Var.f5879f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 != i11) {
                i12 = proxyListActivity.callsRow;
                if (i10 == i12) {
                    s8Var.setChecked(proxyListActivity.f34742e);
                    return;
                } else if (i10 == proxyListActivity.f34747w) {
                    s8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            s8Var.setChecked(proxyListActivity.d);
        } else {
            v(m1Var, i10);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View z6Var;
        Context context = this.f41695c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                z6Var = new v11(this.d, context);
                                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                            } else {
                                z6Var = new org.telegram.ui.Components.uv0(context, null);
                                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                            }
                        } else {
                            z6Var = new org.telegram.ui.Cells.a9(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.s8(context);
                        z6Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.m4(context);
                    z6Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                }
            } else {
                z6Var = new org.telegram.ui.Cells.aa(context);
                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
            }
        } else {
            z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        }
        return yh.o(z6Var, z6Var, -1, -2);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        int i10;
        int i11;
        if (m1Var.f5879f == 3) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) m1Var.f5875a;
            int b10 = m1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 != i10) {
                i11 = proxyListActivity.callsRow;
                if (b10 == i11) {
                    s8Var.setChecked(proxyListActivity.f34742e);
                    return;
                } else if (b10 == proxyListActivity.f34747w) {
                    s8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            s8Var.setChecked(proxyListActivity.d);
        }
    }
}
