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
public final class t11 extends org.telegram.ui.Components.mm0 {
    public final Context f43464c;
    public final ProxyListActivity d;

    public t11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f43464c = context;
        C(true);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int i11;
        int b10 = e1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 != i10 && b10 != proxyListActivity.v) {
            i11 = proxyListActivity.proxyAddRow;
            if (b10 != i11 && b10 != proxyListActivity.f36166y) {
                if (b10 < proxyListActivity.f36161n || b10 >= proxyListActivity.f36162r) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void E() {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.E.size();
        r5Var = ((org.telegram.ui.ActionBar.r2) proxyListActivity).simpleActionBar;
        boolean o10 = r5Var.o();
        if (size > 0) {
            r5Var3 = ((org.telegram.ui.ActionBar.r2) proxyListActivity).simpleActionBar;
            r5Var3.t(size, o10);
            if (!o10) {
                r5Var4 = ((org.telegram.ui.ActionBar.r2) proxyListActivity).simpleActionBar;
                r5Var4.x();
                int i10 = proxyListActivity.f36161n;
                r(i10, proxyListActivity.f36162r - i10, 2);
            }
        } else if (o10) {
            r5Var2 = ((org.telegram.ui.ActionBar.r2) proxyListActivity).simpleActionBar;
            r5Var2.n();
            int i11 = proxyListActivity.f36161n;
            r(i11, proxyListActivity.f36162r - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.E.clear();
        int i10 = proxyListActivity.f36161n;
        r(i10, proxyListActivity.f36162r - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i11 = proxyListActivity.f36161n;
        if (i10 >= i11 && i10 < proxyListActivity.f36162r) {
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
        return this.d.e;
    }

    @Override
    public final long i(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.f36160f) {
            return -1L;
        }
        if (i10 != proxyListActivity.f36163s) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    return -4L;
                }
                if (i10 == proxyListActivity.h) {
                    return -6L;
                }
                if (i10 == proxyListActivity.f36166y) {
                    return -8L;
                }
                if (i10 == proxyListActivity.v) {
                    return -9L;
                }
                if (i10 == proxyListActivity.f36164w) {
                    return -10L;
                }
                if (i10 == proxyListActivity.f36165x) {
                    return -11L;
                }
                int i13 = proxyListActivity.f36161n;
                if (i10 >= i13 && i10 < proxyListActivity.f36162r) {
                    return ((SharedConfig.ProxyInfo) proxyListActivity.F.get(i10 - i13)).hashCode();
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
        if (i10 != proxyListActivity.f36160f && i10 != proxyListActivity.f36163s) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11 && i10 != proxyListActivity.f36166y) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12 && i10 != proxyListActivity.v) {
                    if (i10 == proxyListActivity.h) {
                        return 2;
                    }
                    if (i10 == proxyListActivity.f36164w) {
                        return 6;
                    }
                    if (i10 >= proxyListActivity.f36161n && i10 < proxyListActivity.f36162r) {
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i13 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z11 = true;
        switch (i13) {
            case 1:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.G6, null);
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.f36166y == -1) {
                        z11 = false;
                    }
                    gaVar.b(string, z11);
                    return;
                } else if (i10 == proxyListActivity.f36166y) {
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.f23582p7, null);
                    gaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 == proxyListActivity.h) {
                    q4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    String string2 = LocaleController.getString(R.string.UseProxySettings);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.v == -1) {
                        z11 = false;
                    }
                    a9Var.f(string2, z12, z11);
                    return;
                } else if (i10 == proxyListActivity.v) {
                    a9Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (i10 == proxyListActivity.f36165x) {
                    i9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                }
                return;
            case 5:
                u11 u11Var = (u11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f36161n);
                u11Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u11Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f36161n));
                u11Var.h = contains;
                u11Var.f43832f.a(contains, false);
                u11Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f36164w) {
                    org.telegram.ui.Components.ax0 ax0Var = (org.telegram.ui.Components.ax0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i14));
                    }
                    ax0Var.setCallback(new org.telegram.ui.Components.voip.c1(21));
                    ax0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(s4.e1 e1Var, int i10, List list) {
        int i11;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i12 == 5 && !list.isEmpty()) {
            u11 u11Var = (u11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i10 - proxyListActivity.f36161n))) != u11Var.h) {
                u11Var.h = contains;
                u11Var.f43832f.a(contains, true);
            }
            if (list.contains(2)) {
                u11Var.a(!arrayList.isEmpty(), true);
            }
        } else if (e1Var.f47776f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 == i11) {
                a9Var.setChecked(proxyListActivity.d);
            } else if (i10 == proxyListActivity.v) {
                a9Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        } else {
            v(e1Var, i10);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View f7Var;
        Context context = this.f43464c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                f7Var = new u11(this.d, context);
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, f7Var, null);
                            } else {
                                f7Var = new org.telegram.ui.Components.ax0(context, null);
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, f7Var, null);
                            }
                        } else {
                            f7Var = new org.telegram.ui.Cells.i9(context);
                        }
                    } else {
                        f7Var = new org.telegram.ui.Cells.a9(context);
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, f7Var, null);
                    }
                } else {
                    f7Var = new org.telegram.ui.Cells.q4(context);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, f7Var, null);
                }
            } else {
                f7Var = new org.telegram.ui.Cells.ga(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, f7Var, null);
            }
        } else {
            f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        }
        return ic.a.n(f7Var, f7Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10;
        if (e1Var.f47776f == 3) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) e1Var.f47773a;
            int b10 = e1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                a9Var.setChecked(proxyListActivity.d);
            } else if (b10 == proxyListActivity.v) {
                a9Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
