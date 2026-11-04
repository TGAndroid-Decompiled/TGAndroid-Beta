package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class v51 extends org.telegram.ui.Components.sj0 {
    public final Context f50397c;
    public boolean d = true;
    public final ThemeActivity f50398e;

    public v51(ThemeActivity themeActivity, Context context) {
        this.f50398e = themeActivity;
        this.f50397c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 0 || i3 == 1 || i3 == 4 || i3 == 7 || i3 == 10 || i3 == 11 || i3 == 12 || i3 == 14 || i3 == 18 || i3 == 20 || i3 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f50398e.K0;
    }

    @Override
    public final int d(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ThemeActivity themeActivity = this.f50398e;
        if (i3 != themeActivity.f42044b0 && i3 != themeActivity.L && i3 != themeActivity.f42046c0 && i3 != themeActivity.Z && i3 != themeActivity.Q && i3 != themeActivity.R && i3 != themeActivity.N && i3 != themeActivity.M) {
            if (i3 != themeActivity.f42052g0 && i3 != themeActivity.f42042a0 && i3 != themeActivity.f42071w0 && i3 != themeActivity.B0 && i3 != themeActivity.H0) {
                if (i3 != themeActivity.f42066s0 && i3 != themeActivity.W && i3 != themeActivity.f42047d0 && i3 != themeActivity.P && i3 != themeActivity.f42054i0 && i3 != themeActivity.f42060o0 && i3 != themeActivity.f42057l0 && i3 != themeActivity.K && i3 != themeActivity.J0 && i3 != themeActivity.A0 && i3 != themeActivity.C0 && i3 != themeActivity.D0 && i3 != themeActivity.E0) {
                    if (i3 != themeActivity.S && i3 != themeActivity.T && i3 != themeActivity.U && i3 != themeActivity.V) {
                        if (i3 != themeActivity.X && i3 != themeActivity.f42049e0 && i3 != themeActivity.f42053h0 && i3 != themeActivity.f42074y && i3 != themeActivity.f42055j0 && i3 != themeActivity.f42072x && i3 != themeActivity.m0 && i3 != themeActivity.f42056k0 && i3 != themeActivity.f42068u0 && i3 != themeActivity.f42073x0 && i3 != themeActivity.I0 && i3 != themeActivity.F0 && i3 != themeActivity.G0) {
                            if (i3 == themeActivity.f42051f0) {
                                return 6;
                            }
                            if (i3 != themeActivity.Y && i3 != themeActivity.H && i3 != themeActivity.F) {
                                i10 = themeActivity.raiseToListenRow;
                                if (i3 != i10) {
                                    i11 = themeActivity.pauseOnRecordRow;
                                    if (i3 != i11 && i3 != themeActivity.E && i3 != themeActivity.f42067t0) {
                                        i12 = themeActivity.pauseOnMediaRow;
                                        if (i3 != i12 && i3 != themeActivity.G) {
                                            i13 = themeActivity.sensitiveContentRow;
                                            if (i3 != i13) {
                                                i14 = themeActivity.textSizeRow;
                                                if (i3 == i14) {
                                                    return 8;
                                                }
                                                if (i3 != themeActivity.f42059n0) {
                                                    i15 = themeActivity.nightThemeRow;
                                                    if (i3 != i15) {
                                                        i16 = themeActivity.browserRow;
                                                        if (i3 != i16) {
                                                            if (i3 == themeActivity.f42061p0) {
                                                                return 11;
                                                            }
                                                            if (i3 != themeActivity.f42064r0) {
                                                                i17 = themeActivity.bubbleRadiusRow;
                                                                if (i3 != i17) {
                                                                    i18 = themeActivity.backgroundRow;
                                                                    if (i3 != i18 && i3 != themeActivity.f42076z0) {
                                                                        i19 = themeActivity.createNewThemeRow;
                                                                        if (i3 != i19) {
                                                                            i20 = themeActivity.liteModeRow;
                                                                            if (i3 != i20) {
                                                                                i21 = themeActivity.stickersRow;
                                                                                if (i3 != i21) {
                                                                                    if (i3 == themeActivity.f42069v0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i3 == themeActivity.f42075y0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i3 == themeActivity.f42062q0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i3 != themeActivity.I && i3 != themeActivity.J) {
                                                                                        i22 = themeActivity.appIconSelectorRow;
                                                                                        if (i3 != i22) {
                                                                                            i23 = themeActivity.changeUserColor;
                                                                                            if (i3 == i23) {
                                                                                                return 21;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        return 20;
                                                                                    }
                                                                                    return 19;
                                                                                }
                                                                                return 14;
                                                                            }
                                                                            return 14;
                                                                        }
                                                                        return 14;
                                                                    }
                                                                    return 14;
                                                                }
                                                                return 13;
                                                            }
                                                            return 12;
                                                        }
                                                        return 10;
                                                    }
                                                    return 10;
                                                }
                                                return 9;
                                            }
                                            return 7;
                                        }
                                        return 7;
                                    }
                                    return 7;
                                }
                                return 7;
                            }
                            return 7;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        String M0;
        String M02;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String M03;
        String M04;
        int i23 = d1Var.f55544f;
        View view = d1Var.f55540a;
        ThemeActivity themeActivity = this.f50398e;
        boolean z11 = false;
        boolean z12 = true;
        if (i23 != 1) {
            if (i23 != 2) {
                if (i23 != 4) {
                    if (i23 != 5) {
                        if (i23 != 6) {
                            if (i23 != 7) {
                                if (i23 != 14) {
                                    if (i23 != 17) {
                                        if (i23 != 19) {
                                            if (i23 != 21) {
                                                switch (i23) {
                                                    case 10:
                                                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                                                        i21 = themeActivity.nightThemeRow;
                                                        if (i3 != i21) {
                                                            i22 = themeActivity.browserRow;
                                                            if (i3 == i22) {
                                                                h5Var.b(org.telegram.messenger.bd.M0(2131749217, null), org.telegram.messenger.bd.M0(2131749216, null), 2131232030, themeActivity.getMessagesController().M2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.k6.f28074o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            M03 = org.telegram.ui.ActionBar.k6.C0();
                                                        } else {
                                                            M03 = org.telegram.messenger.bd.M0(2131753783, "AutoNightThemeOff");
                                                        }
                                                        if (z11) {
                                                            int i24 = org.telegram.ui.ActionBar.k6.f28074o;
                                                            if (i24 == 1) {
                                                                M04 = org.telegram.messenger.bd.M0(2131753787, "AutoNightScheduled");
                                                            } else if (i24 == 3) {
                                                                M04 = org.telegram.messenger.bd.M0(2131753786, "AutoNightSystemDefault");
                                                            } else {
                                                                M04 = org.telegram.messenger.bd.M0(2131753796, "AutoNightAdaptive");
                                                            }
                                                            M03 = a1.g.C(M04, " ", M03);
                                                        }
                                                        h5Var.b(org.telegram.messenger.bd.M0(2131753784, "AutoNightTheme"), M03, 2131231843, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f42045c.A1(themeActivity.f42043b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.tj0 tj0Var = (org.telegram.ui.Components.tj0) view;
                                                        x51 x51Var = (x51) tj0Var.getAdapter();
                                                        x51Var.f();
                                                        int indexOf = x51Var.f51834e.indexOf(x51Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = x51Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((u4.b0) tj0Var.getLayoutManager()).h1(indexOf, (themeActivity.f42043b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((il0) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                                        if (i3 == themeActivity.I) {
                                            g6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            g6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((rt) view).a();
                                    return;
                                }
                                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                                l8Var.f29600w = 48;
                                i16 = themeActivity.backgroundRow;
                                if (i3 == i16) {
                                    l8Var.setSubtitle(null);
                                    int i25 = org.telegram.ui.ActionBar.k6.f28121q6;
                                    l8Var.g(i25, i25);
                                    String M05 = org.telegram.messenger.bd.M0(2131752550, null);
                                    i20 = themeActivity.changeUserColor;
                                    if (i20 >= 0) {
                                        z11 = true;
                                    }
                                    l8Var.o(2131232066, M05, z11);
                                    return;
                                } else if (i3 != themeActivity.f42076z0) {
                                    i17 = themeActivity.createNewThemeRow;
                                    if (i3 != i17) {
                                        i18 = themeActivity.liteModeRow;
                                        if (i3 != i18) {
                                            i19 = themeActivity.stickersRow;
                                            if (i3 == i19) {
                                                l8Var.g(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                                                l8Var.o(2131232038, org.telegram.messenger.bd.M0(2131744867, null), false);
                                                l8Var.setSubtitle(org.telegram.messenger.bd.M0(2131744866, null));
                                                l8Var.f29599s = 64;
                                                l8Var.f29600w = 60;
                                                l8Var.f29601x = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        l8Var.g(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                                        l8Var.o(2131232015, org.telegram.messenger.bd.M0(2131748874, null), true);
                                        l8Var.setSubtitle(org.telegram.messenger.bd.M0(2131748873, null));
                                        l8Var.f29600w = 60;
                                        l8Var.f29599s = 64;
                                        l8Var.f29601x = 20;
                                        return;
                                    }
                                    l8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.k6.f28121q6;
                                    l8Var.g(i26, i26);
                                    l8Var.o(2131232097, org.telegram.messenger.bd.M0(2131751713, null), false);
                                    return;
                                } else {
                                    l8Var.setSubtitle(null);
                                    int i27 = org.telegram.ui.ActionBar.k6.f28121q6;
                                    l8Var.g(i27, i27);
                                    l8Var.o(2131232400, org.telegram.messenger.bd.M0(2131751282, null), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                            if (i3 == themeActivity.Y) {
                                q8Var.f(org.telegram.messenger.bd.M0(2131753791, "AutoNightLocation"), org.telegram.ui.ActionBar.k6.f28094p, true);
                                return;
                            } else if (i3 == themeActivity.O) {
                                q8Var.f(org.telegram.messenger.bd.M0(2131751158, "EnableAnimations"), org.telegram.messenger.hp.e1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i3 == themeActivity.H) {
                                q8Var.f(org.telegram.messenger.bd.M0(2131745642, "SendByEnter"), org.telegram.messenger.hp.e1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i3 != themeActivity.F) {
                                i12 = themeActivity.raiseToListenRow;
                                if (i3 == i12) {
                                    q8Var.g(org.telegram.messenger.bd.M0(2131746435, "RaiseToListen"), org.telegram.messenger.bd.M0(2131746434, "RaiseToListenInfo"), org.telegram.messenger.az.f21662s0, true, true);
                                    return;
                                } else if (i3 != themeActivity.G) {
                                    i13 = themeActivity.pauseOnRecordRow;
                                    if (i3 != i13) {
                                        i14 = themeActivity.pauseOnMediaRow;
                                        if (i3 == i14) {
                                            q8Var.f(org.telegram.messenger.bd.M0(2131747440, null), org.telegram.messenger.az.G0, true);
                                            return;
                                        } else if (i3 != themeActivity.E) {
                                            i15 = themeActivity.sensitiveContentRow;
                                            if (i3 == i15) {
                                                q8Var.g(org.telegram.messenger.bd.M0(2131745340, null), org.telegram.messenger.bd.M0(2131745339, null), themeActivity.getMessagesController().S4(), true, true);
                                                return;
                                            } else if (i3 == themeActivity.f42067t0) {
                                                q8Var.f(org.telegram.messenger.bd.M0(2131753675, "BlurInChat"), org.telegram.messenger.az.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            q8Var.g(org.telegram.messenger.bd.M0(2131751439, "DirectShare"), org.telegram.messenger.bd.M0(2131751438, "DirectShareInfo"), org.telegram.messenger.az.f21676x0, false, true);
                                            return;
                                        }
                                    }
                                    q8Var.g(org.telegram.messenger.bd.M0(2131747439, null), org.telegram.messenger.bd.M0(2131747438, "PauseMusicOnRecordInfo"), org.telegram.messenger.az.F0, true, true);
                                    return;
                                } else {
                                    q8Var.g(org.telegram.messenger.bd.M0(2131748257, "NextMediaTap"), org.telegram.messenger.bd.M0(2131748256, "NextMediaTapInfo"), org.telegram.messenger.az.f21665t0, true, true);
                                    return;
                                }
                            } else {
                                q8Var.g(org.telegram.messenger.bd.M0(2131746433, "RaiseToSpeak"), org.telegram.messenger.bd.M0(2131746432, "RaiseToSpeakInfo"), org.telegram.messenger.az.f21659r0, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.i0) view).setProgress(org.telegram.ui.ActionBar.k6.f28114q);
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (i3 == themeActivity.X) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131753788, "AutoNightSchedule"));
                        return;
                    } else if (i3 == themeActivity.f42049e0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131753795, "AutoNightBrightness"));
                        return;
                    } else if (i3 == themeActivity.f42053h0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131753789, "AutoNightPreferred"));
                        return;
                    } else if (i3 == themeActivity.f42074y) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131745993, "SETTINGS"));
                        return;
                    } else if (i3 == themeActivity.f42055j0) {
                        if (themeActivity.f42050f == 3) {
                            n4Var.setText(org.telegram.messenger.bd.M0(2131752839, "BuildMyOwnTheme"));
                            return;
                        } else {
                            n4Var.setText(org.telegram.messenger.bd.M0(2131752011, "ColorTheme"));
                            return;
                        }
                    } else if (i3 == themeActivity.f42072x) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131744201, "TextSizeHeader"));
                        return;
                    } else if (i3 == themeActivity.m0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131752225, "ChatList"));
                        return;
                    } else if (i3 == themeActivity.f42056k0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131752840, "BubbleRadius"));
                        return;
                    } else if (i3 == themeActivity.f42068u0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131752222, "ChatListSwipeGesture"));
                        return;
                    } else if (i3 == themeActivity.f42073x0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131745661, "SelectTheme"));
                        return;
                    } else if (i3 == themeActivity.I0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131754240, null));
                        return;
                    } else if (i3 == themeActivity.G0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131747773, "OtherSettings"));
                        return;
                    } else if (i3 == themeActivity.F0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131748668, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                if (i3 == themeActivity.S) {
                    String M06 = org.telegram.messenger.bd.M0(2131753793, "AutoNightDisabled");
                    if (org.telegram.ui.ActionBar.k6.f28074o == 0) {
                        z11 = true;
                    }
                    aaVar.a(M06, z11, true);
                    return;
                } else if (i3 == themeActivity.T) {
                    String M07 = org.telegram.messenger.bd.M0(2131753787, "AutoNightScheduled");
                    if (org.telegram.ui.ActionBar.k6.f28074o == 1) {
                        z11 = true;
                    }
                    aaVar.a(M07, z11, true);
                    return;
                } else if (i3 == themeActivity.U) {
                    String M08 = org.telegram.messenger.bd.M0(2131753796, "AutoNightAdaptive");
                    if (org.telegram.ui.ActionBar.k6.f28074o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.V != -1) {
                        z11 = true;
                    }
                    aaVar.a(M08, z10, z11);
                    return;
                } else if (i3 == themeActivity.V) {
                    String M09 = org.telegram.messenger.bd.M0(2131753786, "AutoNightSystemDefault");
                    if (org.telegram.ui.ActionBar.k6.f28074o != 3) {
                        z12 = false;
                    }
                    aaVar.a(M09, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            if (i3 == themeActivity.f42052g0) {
                y8Var.setText(org.telegram.messenger.bd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.k6.f28114q * 100.0f))));
                return;
            } else if (i3 == themeActivity.f42042a0) {
                y8Var.setText(ThemeActivity.D0());
                return;
            } else if (i3 == themeActivity.f42071w0) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131752221, "ChatListSwipeGestureInfo"));
                return;
            } else if (i3 == themeActivity.H0) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131748873, "LiteModeInfo"));
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
        i10 = themeActivity.nightThemeRow;
        if (i3 == i10) {
            if (org.telegram.ui.ActionBar.k6.f28074o != 0 && org.telegram.ui.ActionBar.k6.J != null) {
                v9Var.c(org.telegram.messenger.bd.M0(2131753784, null), org.telegram.ui.ActionBar.k6.C0(), false, false);
            } else {
                v9Var.c(org.telegram.messenger.bd.M0(2131753784, null), org.telegram.messenger.bd.M0(2131753783, null), false, false);
            }
        } else if (i3 == themeActivity.f42044b0) {
            int i28 = org.telegram.ui.ActionBar.k6.f28134r;
            int i29 = i28 / 60;
            v9Var.c(org.telegram.messenger.bd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i29), Integer.valueOf(i28 - (i29 * 60))), false, true);
        } else if (i3 == themeActivity.f42046c0) {
            int i30 = org.telegram.ui.ActionBar.k6.f28152s;
            int i31 = i30 / 60;
            v9Var.c(org.telegram.messenger.bd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, false);
        } else if (i3 == themeActivity.Z) {
            v9Var.c(org.telegram.messenger.bd.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.f28227w, false, false);
        } else if (i3 == themeActivity.R) {
            int i32 = org.telegram.messenger.hp.e1().getInt("sortContactsBy", 0);
            if (i32 == 0) {
                M02 = org.telegram.messenger.bd.M0(2131751601, "Default");
            } else if (i32 == 1) {
                M02 = org.telegram.messenger.bd.M0(2131745297, "FirstName");
            } else {
                M02 = org.telegram.messenger.bd.M0(2131745296, "LastName");
            }
            v9Var.c(org.telegram.messenger.bd.M0(2131745301, "SortBy"), M02, false, true);
        } else if (i3 == themeActivity.Q) {
            v9Var.b(org.telegram.messenger.bd.M0(2131749272, "ImportContacts"), true);
        } else if (i3 == themeActivity.L) {
            int i33 = org.telegram.messenger.az.f21663s1;
            if (i33 == 0) {
                M0 = org.telegram.messenger.bd.M0(2131751367, "DistanceUnitsAutomatic");
            } else if (i33 == 1) {
                M0 = org.telegram.messenger.bd.M0(2131751366, "DistanceUnitsKilometers");
            } else {
                M0 = org.telegram.messenger.bd.M0(2131751365, "DistanceUnitsMiles");
            }
            String M010 = org.telegram.messenger.bd.M0(2131751368, "DistanceUnits");
            boolean z13 = themeActivity.P0;
            if (themeActivity.E0 < 0) {
                z12 = false;
            }
            v9Var.c(M010, M0, z13, z12);
            themeActivity.P0 = false;
        } else if (i3 == themeActivity.M) {
            v9Var.c(org.telegram.messenger.bd.M0(2131745809, null), org.telegram.ui.web.d1.a().f50829a, themeActivity.Q0, false);
        } else if (i3 == themeActivity.N) {
            String M011 = org.telegram.messenger.bd.M0(2131748447, null);
            if (org.telegram.messenger.az.f21668u0) {
                i11 = 2131748445;
            } else {
                i11 = 2131748446;
            }
            v9Var.c(M011, org.telegram.messenger.bd.M0(i11, null), themeActivity.O0, false);
            themeActivity.O0 = false;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ?? frameLayout;
        int i10;
        int i11;
        float f10;
        u51 u51Var;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.q4 q4Var;
        int i15;
        int i16;
        int i17 = 3;
        float f11 = 21.0f;
        ThemeActivity themeActivity = this.f50398e;
        Context context = this.f50397c;
        switch (i3) {
            case 1:
                u51Var = new org.telegram.ui.Cells.v9(context);
                break;
            case 2:
                u51Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 3:
                u51Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f28960a = textView;
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.bd.f21784a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                boolean z12 = org.telegram.messenger.bd.f21784a0;
                if (z12) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                int i18 = i11 | 48;
                if (z12) {
                    f10 = 71.0f;
                } else {
                    f10 = 21.0f;
                }
                if (!z12) {
                    f11 = 23.0f;
                }
                frameLayout.addView(textView, b8.mf.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f28961b = imageView;
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232753);
                if (!org.telegram.messenger.bd.f21784a0) {
                    i17 = 5;
                }
                frameLayout.addView(imageView, b8.mf.d(19, 14.0f, i17 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                u51Var = frameLayout;
                break;
            case 5:
                u51Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                u51Var = new r51(this, context);
                break;
            case 7:
                u51Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                u51Var = new w51(themeActivity, context);
                break;
            case 9:
                frameLayout = new s51(context, 0);
                frameLayout.f49370b = new org.telegram.ui.Cells.v0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i19 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) frameLayout.f49370b;
                    if (i19 < v0VarArr.length) {
                        if (i19 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, 0);
                        v0Var.f30707b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        v0Var.f30709e = textPaint;
                        v0Var.setWillNotDraw(false);
                        v0Var.f30708c = z10;
                        if (z10) {
                            i12 = 2131752223;
                        } else {
                            i12 = 2131752224;
                        }
                        v0Var.setContentDescription(org.telegram.messenger.bd.M0(i12, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(v0Var, context);
                        v0Var.d = u0Var;
                        u0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        v0Var.addView(u0Var, b8.mf.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && org.telegram.messenger.az.f21654p1) || (!z10 && !org.telegram.messenger.az.f21654p1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        u0Var.a(z11, false);
                        v0VarArr[i19] = v0Var;
                        org.telegram.ui.Cells.v0 v0Var2 = ((org.telegram.ui.Cells.v0[]) frameLayout.f49370b)[i19];
                        if (i19 == 1) {
                            i13 = 10;
                        } else {
                            i13 = 0;
                        }
                        frameLayout.addView(v0Var2, b8.mf.m(0.5f, -1, -1, i13, 0, 0));
                        ((org.telegram.ui.Cells.v0[]) frameLayout.f49370b)[i19].setOnClickListener(new ei.e2(3, frameLayout, z10));
                        i19++;
                    } else {
                        u51Var = frameLayout;
                        break;
                    }
                }
                break;
            case 10:
                u51Var = new org.telegram.ui.Cells.h5(this.f50397c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                t51 t51Var = new t51(this, this.f50397c, themeActivity, themeActivity.f42050f, themeActivity.f42048e, themeActivity.d);
                themeActivity.f42045c = t51Var;
                t51Var.setDrawDivider(themeActivity.f42070w);
                themeActivity.f42045c.setFocusable(false);
                View view = themeActivity.f42045c;
                view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(148.0f)));
                u51Var = view;
                break;
            case 12:
                u51 u51Var2 = new u51(0, context, null);
                u51Var2.setFocusable(false);
                u51Var2.setItemAnimator(null);
                u51Var2.setLayoutAnimation(null);
                u51Var2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                u51Var2.setClipToPadding(false);
                u4.b0 b0Var = new u4.b0();
                b0Var.j1(0);
                u51Var2.setLayoutManager(b0Var);
                x51 x51Var = new x51(themeActivity, context);
                u51Var2.setAdapter(x51Var);
                u51Var2.setOnItemClickListener(new p51(this, x51Var, u51Var2, 0));
                u51Var2.setOnItemLongClickListener(new rb0(25, this, x51Var));
                u51Var2.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(62.0f)));
                u51Var = u51Var2;
                break;
            case 13:
                u51Var = new m51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                u51Var = new org.telegram.ui.Cells.l8(context);
                break;
            case 15:
                i14 = ((org.telegram.ui.ActionBar.d2) themeActivity).currentAccount;
                u51Var = new org.telegram.ui.Components.uw0(context, i14);
                break;
            case 16:
                q4Var = ((org.telegram.ui.ActionBar.d2) themeActivity).parentLayout;
                View rl0Var = new rl0(context, q4Var, 0);
                rl0Var.setImportantForAccessibility(4);
                u51Var = rl0Var;
                break;
            case 17:
                View rtVar = new rt(themeActivity.f42050f, context, themeActivity);
                rtVar.setFocusable(false);
                rtVar.setLayoutParams(new u4.p0(-1, -2));
                u51Var = rtVar;
                break;
            case 19:
                u51Var = new org.telegram.ui.Cells.g6(context, false);
                break;
            case 20:
                i15 = ((org.telegram.ui.ActionBar.d2) themeActivity).currentAccount;
                ?? tj0Var = new org.telegram.ui.Components.tj0(context, null);
                tj0Var.f30366f3 = new ArrayList();
                tj0Var.f30368h3 = i15;
                tj0Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                tj0Var.setFocusable(false);
                tj0Var.setItemAnimator(null);
                tj0Var.setLayoutAnimation(null);
                u4.b0 b0Var2 = new u4.b0(0, false);
                tj0Var.f30367g3 = b0Var2;
                tj0Var.setLayoutManager(b0Var2);
                tj0Var.setAdapter(new y7(tj0Var, 1));
                tj0Var.i(new gi.o1(tj0Var, 1));
                tj0Var.setOnItemClickListener(new ei.h0(tj0Var, themeActivity, context, 3));
                tj0Var.z1();
                u51Var = tj0Var;
                break;
            case 21:
                i16 = ((org.telegram.ui.ActionBar.d2) themeActivity).currentAccount;
                u51Var = new il0(i16, 0L, this.f50397c, themeActivity.getResourceProvider());
                break;
        }
        return new u4.d1(u51Var);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        boolean z10;
        if (d1Var.f55544f == 4) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) d1Var.f55540a;
            if (d1Var.b() == org.telegram.ui.ActionBar.k6.f28074o) {
                z10 = true;
            } else {
                z10 = false;
            }
            aaVar.setTypeChecked(z10);
        }
    }
}
