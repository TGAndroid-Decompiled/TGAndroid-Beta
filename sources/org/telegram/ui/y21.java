package org.telegram.ui;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y21 extends org.telegram.ui.Components.oj0 {
    public final Context f52048c;
    public final SessionsActivity d;

    public y21(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.f52048c = context;
        C(true);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int i10;
        int b10 = d1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i7 = sessionsActivity.terminateAllSessionsRow;
        if (b10 != i7) {
            if (b10 < sessionsActivity.J || b10 >= sessionsActivity.K) {
                if (b10 < sessionsActivity.L || b10 >= sessionsActivity.M) {
                    if ((b10 < sessionsActivity.F || b10 >= sessionsActivity.G) && b10 != sessionsActivity.f41965y) {
                        i10 = sessionsActivity.ttlRow;
                        if (b10 != i10) {
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
        return true;
    }

    @Override
    public final int b() {
        return this.d.R;
    }

    @Override
    public final long c(int i7) {
        int i10;
        int i11;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i7 == i10) {
            hash = Objects.hash(0, 0);
        } else if (i7 == sessionsActivity.D) {
            hash = Objects.hash(0, 1);
        } else if (i7 == sessionsActivity.N) {
            hash = Objects.hash(0, 2);
        } else if (i7 == sessionsActivity.H) {
            hash = Objects.hash(0, 3);
        } else if (i7 == sessionsActivity.Q) {
            hash = Objects.hash(0, 4);
        } else if (i7 == sessionsActivity.T) {
            hash = Objects.hash(0, 5);
        } else if (i7 == sessionsActivity.O) {
            hash = Objects.hash(0, 6);
        } else if (i7 == sessionsActivity.f41964x) {
            hash = Objects.hash(0, 7);
        } else if (i7 == sessionsActivity.I) {
            hash = Objects.hash(0, 8);
        } else if (i7 == sessionsActivity.E) {
            hash = Objects.hash(0, 9);
        } else if (i7 == sessionsActivity.S) {
            hash = Objects.hash(0, 10);
        } else if (i7 == sessionsActivity.f41965y) {
            hash = Objects.hash(0, 11);
        } else {
            int i12 = sessionsActivity.J;
            if (i7 >= i12 && i7 < sessionsActivity.K) {
                TLObject tLObject = (TLObject) sessionsActivity.d.get(i7 - i12);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else {
                    if (tLObject instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            } else {
                int i13 = sessionsActivity.L;
                if (i7 >= i13 && i7 < sessionsActivity.M) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f41959f.get(i7 - i13)).bot_id));
                } else {
                    int i14 = sessionsActivity.F;
                    if (i7 >= i14 && i7 < sessionsActivity.G) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.f41958e.get(i7 - i14);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i7 != sessionsActivity.P) {
                        i11 = sessionsActivity.ttlRow;
                        if (i7 == i11) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    } else {
                        hash = Objects.hash(0, 12);
                    }
                }
            }
        }
        return hash;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i7 != i10) {
            if (i7 != sessionsActivity.D && i7 != sessionsActivity.N && i7 != sessionsActivity.H && i7 != sessionsActivity.Q && i7 != sessionsActivity.T && i7 != sessionsActivity.O) {
                if (i7 != sessionsActivity.f41964x && i7 != sessionsActivity.I && i7 != sessionsActivity.E && i7 != sessionsActivity.S) {
                    if (i7 != sessionsActivity.f41965y) {
                        if (i7 < sessionsActivity.J || i7 >= sessionsActivity.K) {
                            if (i7 < sessionsActivity.L || i7 >= sessionsActivity.M) {
                                if (i7 < sessionsActivity.F || i7 >= sessionsActivity.G) {
                                    if (i7 != sessionsActivity.P) {
                                        i11 = sessionsActivity.ttlRow;
                                        if (i7 == i11) {
                                            return 6;
                                        }
                                        return 0;
                                    }
                                    return 5;
                                }
                                return 4;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        String G;
        int i11 = d1Var.f57047f;
        boolean z9 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) d1Var.f57043a;
                            SessionsActivity sessionsActivity = this.d;
                            if (i7 == sessionsActivity.f41965y) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.h;
                                if (tL_authorization == null) {
                                    tL_authorization = new TLRPC.TL_authorization();
                                    tL_authorization.flags = 1;
                                    tL_authorization.current = true;
                                    tL_authorization.platform = "Android";
                                    tL_authorization.device_model = Build.MANUFACTURER + " " + Build.MODEL;
                                    StringBuilder sb2 = new StringBuilder("SDK ");
                                    sb2.append(Build.VERSION.SDK_INT);
                                    tL_authorization.system_version = sb2.toString();
                                    tL_authorization.app_name = "Telegram Android";
                                    tL_authorization.app_version = "";
                                    try {
                                        PackageInfo packageInfo = org.telegram.messenger.t0.f25566b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25566b.getPackageName(), 0);
                                        tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                                        boolean z10 = org.telegram.messenger.r2.f25212a;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(tL_authorization.app_version);
                                        sb3.append(" beta");
                                        tL_authorization.app_version = sb3.toString();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    tL_authorization.country = "";
                                    tL_authorization.region = "";
                                    tL_authorization.ip = "";
                                }
                                if (!this.d.d.isEmpty() || !this.d.f41958e.isEmpty() || this.d.P != -1) {
                                    z9 = true;
                                }
                                s6Var.c(tL_authorization, z9);
                                return;
                            }
                            int i12 = sessionsActivity.J;
                            if (i7 >= i12 && i7 < sessionsActivity.K) {
                                TLObject tLObject = (TLObject) sessionsActivity.d.get(i7 - i12);
                                if (i7 != this.d.K - 1) {
                                    z9 = true;
                                }
                                s6Var.c(tLObject, z9);
                                return;
                            }
                            int i13 = sessionsActivity.L;
                            if (i7 >= i13 && i7 < sessionsActivity.M) {
                                int i14 = i7 - i13;
                                ArrayList arrayList = sessionsActivity.f41959f;
                                if (arrayList != null && i14 >= 0 && i14 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f41959f.get(i14);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i7 != sessionsActivity2.M - 1 && i7 != sessionsActivity2.K - 1) {
                                        z9 = true;
                                    }
                                    s6Var.c(tL_connectedBot, z9);
                                    return;
                                }
                                return;
                            }
                            int i15 = sessionsActivity.F;
                            if (i7 >= i15 && i7 < sessionsActivity.G) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.f41958e.get(i7 - i15);
                                if (i7 != this.d.G - 1) {
                                    z9 = true;
                                }
                                s6Var.c(tLObject2, z9);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.f57043a;
                        int i16 = this.d.f41962s;
                        if (i16 > 30 && i16 <= 183) {
                            G = org.telegram.messenger.id.G(i16 / 30, "Months", new Object[0]);
                        } else if (i16 == 365) {
                            G = org.telegram.messenger.id.G(i16 / 365, "Years", new Object[0]);
                        } else {
                            G = org.telegram.messenger.id.G(i16 / 7, "Weeks", new Object[0]);
                        }
                        w9Var.c(org.telegram.messenger.id.M0(2131749273, null), G, true, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) d1Var.f57043a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i7 == sessionsActivity3.f41964x) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131751694, null));
                    return;
                } else if (i7 == sessionsActivity3.I) {
                    if (sessionsActivity3.f41963w == 0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131747767, null));
                        return;
                    } else {
                        n4Var.setText(org.telegram.messenger.id.M0(2131747764, null));
                        return;
                    }
                } else if (i7 == sessionsActivity3.E) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131748740, null));
                    return;
                } else if (i7 == sessionsActivity3.S) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131744209, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) d1Var.f57043a;
            z8Var.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i7 == sessionsActivity4.D) {
                if (sessionsActivity4.f41963w == 0) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131752074, null));
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131752073, null));
                    return;
                }
            } else if (i7 == sessionsActivity4.N) {
                if (sessionsActivity4.f41963w == 0) {
                    if (sessionsActivity4.d.isEmpty()) {
                        z8Var.setText("");
                        return;
                    } else {
                        z8Var.setText(org.telegram.messenger.id.M0(2131745557, null));
                        return;
                    }
                }
                z8Var.setText(org.telegram.messenger.id.M0(2131744206, null));
                return;
            } else if (i7 == sessionsActivity4.H) {
                z8Var.setText(org.telegram.messenger.id.M0(2131748739, null));
                return;
            } else if (i7 == sessionsActivity4.Q || i7 == sessionsActivity4.T || i7 == sessionsActivity4.O) {
                z8Var.setText("");
                z8Var.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) d1Var.f57043a;
        i10 = this.d.terminateAllSessionsRow;
        if (i7 == i10) {
            int i17 = org.telegram.ui.ActionBar.k6.f28073p7;
            m8Var.g(i17, i17);
            m8Var.setTag(Integer.valueOf(i17));
            if (this.d.f41963w == 0) {
                m8Var.o(2131232068, org.telegram.messenger.id.M0(2131744211, null), false);
            } else {
                m8Var.o(2131232068, org.telegram.messenger.id.M0(2131744210, null), false);
            }
        } else if (i7 == this.d.P) {
            int i18 = org.telegram.ui.ActionBar.k6.f28092q6;
            m8Var.g(i18, i18);
            m8Var.setTag(Integer.valueOf(i18));
            m8Var.o(2131232320, org.telegram.messenger.id.M0(2131753894, null), !this.d.d.isEmpty());
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        int i17;
        float f11;
        int i18;
        float f12;
        int i19;
        int i20;
        float f13;
        int i21;
        float f14;
        int i22;
        int i23;
        int i24;
        int i25;
        Context context = this.f52048c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    SessionsActivity sessionsActivity = this.d;
                    if (i7 != 5) {
                        if (i7 != 6) {
                            int i26 = sessionsActivity.f41963w;
                            ?? frameLayout2 = new FrameLayout(context);
                            frameLayout2.f30275s = new org.telegram.ui.Components.w5((View) frameLayout2);
                            frameLayout2.f30277x = org.telegram.messenger.p10.f24470s0;
                            LinearLayout linearLayout = new LinearLayout(context);
                            frameLayout2.f30276w = linearLayout;
                            int i27 = 0;
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            frameLayout2.f30268a = i26;
                            int i28 = 72;
                            int i29 = 15;
                            int i30 = 21;
                            int i31 = 3;
                            if (i26 == 1) {
                                boolean z9 = org.telegram.messenger.id.f23157a0;
                                if (z9) {
                                    i22 = 5;
                                } else {
                                    i22 = 3;
                                }
                                int i32 = i22 | 48;
                                if (z9) {
                                    i23 = 15;
                                } else {
                                    i23 = 49;
                                }
                                float f15 = i23;
                                if (z9) {
                                    i29 = 49;
                                }
                                frameLayout2.addView(linearLayout, c8.ha.d(-1, 30.0f, i32, f15, 11.0f, i29, 0.0f));
                                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                                frameLayout2.f30273n = w8Var;
                                w8Var.u(org.telegram.messenger.g0.L(10.0f));
                                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                                frameLayout2.h = l9Var;
                                l9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z10 = org.telegram.messenger.id.f23157a0;
                                if (z10) {
                                    i24 = 5;
                                } else {
                                    i24 = 3;
                                }
                                int i33 = i24 | 48;
                                if (z10) {
                                    i25 = 0;
                                } else {
                                    i25 = 21;
                                }
                                float f16 = i25;
                                if (z10) {
                                    i27 = 21;
                                }
                                frameLayout2.addView(l9Var, c8.ha.d(20, 20.0f, i33, f16, 13.0f, i27, 0.0f));
                            } else {
                                org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
                                frameLayout2.f30272f = l9Var2;
                                l9Var2.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z11 = org.telegram.messenger.id.f23157a0;
                                if (z11) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                int i34 = i10 | 48;
                                if (!z11) {
                                    i27 = 16;
                                }
                                float f17 = i27;
                                if (z11) {
                                    i11 = 16;
                                } else {
                                    i11 = 0;
                                }
                                frameLayout2.addView(l9Var2, c8.ha.d(42, 42.0f, i34, f17, 9.0f, i11, 0.0f));
                                frameLayout2.f30273n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                                org.telegram.ui.Components.l9 l9Var3 = new org.telegram.ui.Components.l9(context);
                                frameLayout2.h = l9Var3;
                                l9Var3.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                                boolean z12 = org.telegram.messenger.id.f23157a0;
                                if (z12) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                int i35 = i12 | 48;
                                if (z12) {
                                    i13 = 0;
                                } else {
                                    i13 = 16;
                                }
                                float f18 = i13;
                                if (z12) {
                                    i14 = 16;
                                } else {
                                    i14 = 0;
                                }
                                frameLayout2.addView(l9Var3, c8.ha.d(42, 42.0f, i35, f18, 9.0f, i14, 0.0f));
                                boolean z13 = org.telegram.messenger.id.f23157a0;
                                if (z13) {
                                    i15 = 5;
                                } else {
                                    i15 = 3;
                                }
                                int i36 = i15 | 48;
                                if (z13) {
                                    i16 = 15;
                                } else {
                                    i16 = 72;
                                }
                                float f19 = i16;
                                if (z13) {
                                    i29 = 72;
                                }
                                frameLayout2.addView(linearLayout, c8.ha.d(-1, 30.0f, i36, f19, 6.333f, i29, 0.0f));
                            }
                            TextView textView = new TextView(context);
                            frameLayout2.f30269b = textView;
                            int i37 = org.telegram.ui.ActionBar.k6.G6;
                            org.telegram.ui.ActionBar.r6.V(textView, i37, null);
                            if (i26 == 0) {
                                f10 = 15.0f;
                            } else {
                                f10 = 16.0f;
                            }
                            textView.setTextSize(1, f10);
                            textView.setLines(1);
                            textView.setTypeface(org.telegram.messenger.g0.o());
                            textView.setMaxLines(1);
                            textView.setSingleLine(true);
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView.setEllipsize(truncateAt);
                            if (org.telegram.messenger.id.f23157a0) {
                                i17 = 5;
                            } else {
                                i17 = 3;
                            }
                            textView.setGravity(i17 | 48);
                            TextView textView2 = new TextView(context);
                            frameLayout2.f30270c = textView2;
                            float f20 = 13.0f;
                            if (i26 == 0) {
                                f11 = 12.0f;
                            } else {
                                f11 = 13.0f;
                            }
                            textView2.setTextSize(1, f11);
                            if (org.telegram.messenger.id.f23157a0) {
                                i18 = 3;
                            } else {
                                i18 = 5;
                            }
                            textView2.setGravity(i18 | 48);
                            if (org.telegram.messenger.id.f23157a0) {
                                linearLayout.addView(textView2, c8.ha.t(-2, -1, 51, 0, 2, 0, 0));
                                linearLayout.addView(textView, c8.ha.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                            } else {
                                linearLayout.addView(textView, c8.ha.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                                linearLayout.addView(textView2, c8.ha.t(-2, -1, 53, 0, 2, 0, 0));
                            }
                            if (org.telegram.messenger.id.f23157a0) {
                                if (i26 != 0) {
                                    i28 = 21;
                                }
                            } else {
                                if (i26 != 0) {
                                    i28 = 21;
                                }
                                i30 = i28;
                                i28 = 21;
                            }
                            TextView textView3 = new TextView(context);
                            frameLayout2.d = textView3;
                            org.telegram.ui.ActionBar.r6.V(textView3, i37, null);
                            if (i26 == 0) {
                                f12 = 13.0f;
                            } else {
                                f12 = 14.0f;
                            }
                            org.telegram.messenger.camera.q.n(textView3, 1, f12, 1, 1);
                            textView3.setSingleLine(true);
                            textView3.setEllipsize(truncateAt);
                            if (org.telegram.messenger.id.f23157a0) {
                                i19 = 5;
                            } else {
                                i19 = 3;
                            }
                            textView3.setGravity(i19 | 48);
                            if (org.telegram.messenger.id.f23157a0) {
                                i20 = 5;
                            } else {
                                i20 = 3;
                            }
                            int i38 = i20 | 48;
                            float f21 = i30;
                            if (i26 == 0) {
                                f13 = 28.0f;
                            } else {
                                f13 = 36.0f;
                            }
                            float f22 = i28;
                            frameLayout2.addView(textView3, c8.ha.d(-1, -2.0f, i38, f21, f13, f22, 0.0f));
                            TextView textView4 = new TextView(context);
                            frameLayout2.f30271e = textView4;
                            org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.A6, null);
                            if (i26 != 0) {
                                f20 = 14.0f;
                            }
                            org.telegram.messenger.camera.q.n(textView4, 1, f20, 1, 1);
                            textView4.setSingleLine(true);
                            textView4.setEllipsize(truncateAt);
                            if (org.telegram.messenger.id.f23157a0) {
                                i21 = 5;
                            } else {
                                i21 = 3;
                            }
                            textView4.setGravity(i21 | 48);
                            if (org.telegram.messenger.id.f23157a0) {
                                i31 = 5;
                            }
                            int i39 = i31 | 48;
                            if (i26 == 0) {
                                f14 = 46.0f;
                            } else {
                                f14 = 59.0f;
                            }
                            frameLayout2.addView(textView4, c8.ha.d(-1, -2.0f, i39, f21, f14, f22, 0.0f));
                            frameLayout = frameLayout2;
                        } else {
                            frameLayout = new org.telegram.ui.Cells.w9(context);
                        }
                    } else {
                        frameLayout = new z21(sessionsActivity, context);
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.n4(context);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.m8(context);
        }
        return new v4.d1(frameLayout);
    }
}
