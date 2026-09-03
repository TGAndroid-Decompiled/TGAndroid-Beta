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
public final class u11 extends org.telegram.ui.Components.ql0 {
    public final Context f38662c;
    public final ProxyListActivity d;

    public u11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f38662c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int i11;
        int i12;
        int b10 = l1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 != i10 && b10 != proxyListActivity.f32187w) {
            i11 = proxyListActivity.callsRow;
            if (b10 != i11) {
                i12 = proxyListActivity.proxyAddRow;
                if (b10 != i12 && b10 != proxyListActivity.C) {
                    if (b10 < proxyListActivity.f32185r || b10 >= proxyListActivity.f32186s) {
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
                int i10 = proxyListActivity.f32185r;
                r(i10, proxyListActivity.f32186s - i10, 2);
            }
        } else if (s6) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
            kVar2.r();
            int i11 = proxyListActivity.f32185r;
            r(i11, proxyListActivity.f32186s - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.E.clear();
        int i10 = proxyListActivity.f32185r;
        r(i10, proxyListActivity.f32186s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i11 = proxyListActivity.f32185r;
        if (i10 >= i11 && i10 < proxyListActivity.f32186s) {
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
        return this.d.f32183f;
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
                    if (i10 == proxyListActivity.f32184n) {
                        return -6L;
                    }
                    if (i10 == proxyListActivity.C) {
                        return -8L;
                    }
                    if (i10 == proxyListActivity.f32187w) {
                        return -9L;
                    }
                    if (i10 == proxyListActivity.f32188x) {
                        return -10L;
                    }
                    if (i10 == proxyListActivity.f32189y) {
                        return -11L;
                    }
                    int i14 = proxyListActivity.f32185r;
                    if (i10 >= i14 && i10 < proxyListActivity.f32186s) {
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
                if (i10 != i12 && i10 != proxyListActivity.f32187w) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 != i13) {
                        if (i10 == proxyListActivity.f32184n) {
                            return 2;
                        }
                        if (i10 == proxyListActivity.f32188x) {
                            return 6;
                        }
                        if (i10 >= proxyListActivity.f32185r && i10 < proxyListActivity.f32186s) {
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
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z4;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i14 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z10 = true;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.C == -1) {
                        z10 = false;
                    }
                    z9Var.b(string, z10);
                    return;
                } else if (i10 == proxyListActivity.C) {
                    z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
                    z9Var.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == proxyListActivity.f32184n) {
                    l4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        r8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.e, false);
                        return;
                    } else if (i10 == proxyListActivity.f32187w) {
                        r8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        return;
                    } else {
                        return;
                    }
                }
                String string2 = LocaleController.getString(R.string.UseProxySettings);
                boolean z11 = proxyListActivity.d;
                if (proxyListActivity.f32187w == -1) {
                    z10 = false;
                }
                r8Var.f(string2, z11, z10);
                return;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i10 == proxyListActivity.B) {
                    z8Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    return;
                } else if (i10 == proxyListActivity.f32189y) {
                    z8Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                } else {
                    return;
                }
            case 5:
                v11 v11Var = (v11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f32185r);
                v11Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                v11Var.setChecked(z4);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f32185r));
                v11Var.h = contains;
                v11Var.f38955f.a(contains, false);
                v11Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f32188x) {
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
    public final void w(f2.l1 l1Var, int i10, List list) {
        int i11;
        int i12;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i13 == 5 && !list.isEmpty()) {
            v11 v11Var = (v11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i10 - proxyListActivity.f32185r))) != v11Var.h) {
                v11Var.h = contains;
                v11Var.f38955f.a(contains, true);
            }
            if (list.contains(2)) {
                v11Var.a(!arrayList.isEmpty(), true);
            }
        } else if (l1Var.f5777f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 != i11) {
                i12 = proxyListActivity.callsRow;
                if (i10 == i12) {
                    r8Var.setChecked(proxyListActivity.e);
                    return;
                } else if (i10 == proxyListActivity.f32187w) {
                    r8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            r8Var.setChecked(proxyListActivity.d);
        } else {
            v(l1Var, i10);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View y6Var;
        Context context = this.f38662c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                y6Var = new v11(this.d, context);
                                y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                            } else {
                                y6Var = new org.telegram.ui.Components.uv0(context, null);
                                y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                            }
                        } else {
                            y6Var = new org.telegram.ui.Cells.z8(context);
                        }
                    } else {
                        y6Var = new org.telegram.ui.Cells.r8(context);
                        y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                    }
                } else {
                    y6Var = new org.telegram.ui.Cells.l4(context);
                    y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                }
            } else {
                y6Var = new org.telegram.ui.Cells.z9(context);
                y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            }
        } else {
            y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
        }
        return ai.n(y6Var, y6Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10;
        int i11;
        if (l1Var.f5777f == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) l1Var.f5774a;
            int b10 = l1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 != i10) {
                i11 = proxyListActivity.callsRow;
                if (b10 == i11) {
                    r8Var.setChecked(proxyListActivity.e);
                    return;
                } else if (b10 == proxyListActivity.f32187w) {
                    r8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            r8Var.setChecked(proxyListActivity.d);
        }
    }
}
