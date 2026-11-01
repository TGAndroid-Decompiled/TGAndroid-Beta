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
public final class v71 extends org.telegram.ui.Components.tk0 {
    public final Context f42431c;
    public boolean d = true;
    public final ThemeActivity e;

    public v71(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.f42431c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.J0;
    }

    @Override
    public final int d(int i10) {
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
        int i24;
        ThemeActivity themeActivity = this.e;
        if (i10 != themeActivity.f34095a0 && i10 != themeActivity.K && i10 != themeActivity.f34097b0 && i10 != themeActivity.Y && i10 != themeActivity.P && i10 != themeActivity.Q && i10 != themeActivity.M && i10 != themeActivity.L) {
            if (i10 != themeActivity.f34103f0 && i10 != themeActivity.Z && i10 != themeActivity.f34121v0 && i10 != themeActivity.A0 && i10 != themeActivity.G0) {
                if (i10 != themeActivity.f34116r0 && i10 != themeActivity.V && i10 != themeActivity.f34099c0 && i10 != themeActivity.O && i10 != themeActivity.f34105h0 && i10 != themeActivity.f34111n0 && i10 != themeActivity.f34108k0 && i10 != themeActivity.J && i10 != themeActivity.I0 && i10 != themeActivity.f34128z0 && i10 != themeActivity.B0 && i10 != themeActivity.C0 && i10 != themeActivity.D0) {
                    if (i10 != themeActivity.R && i10 != themeActivity.S && i10 != themeActivity.T && i10 != themeActivity.U) {
                        if (i10 != themeActivity.W && i10 != themeActivity.f34100d0 && i10 != themeActivity.f34104g0 && i10 != themeActivity.f34126y && i10 != themeActivity.f34106i0 && i10 != themeActivity.f34124x && i10 != themeActivity.f34109l0 && i10 != themeActivity.f34107j0 && i10 != themeActivity.f34119t0 && i10 != themeActivity.f34123w0 && i10 != themeActivity.H0 && i10 != themeActivity.E0 && i10 != themeActivity.F0) {
                            if (i10 == themeActivity.f34101e0) {
                                return 6;
                            }
                            if (i10 != themeActivity.X && i10 != themeActivity.G && i10 != themeActivity.E) {
                                i11 = themeActivity.raiseToListenRow;
                                if (i10 != i11) {
                                    i12 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i12 && i10 != themeActivity.D && i10 != themeActivity.f34118s0) {
                                        i13 = themeActivity.pauseOnMediaRow;
                                        if (i10 != i13 && i10 != themeActivity.F) {
                                            i14 = themeActivity.sensitiveContentRow;
                                            if (i10 != i14) {
                                                i15 = themeActivity.textSizeRow;
                                                if (i10 == i15) {
                                                    return 8;
                                                }
                                                if (i10 != themeActivity.m0) {
                                                    i16 = themeActivity.nightThemeRow;
                                                    if (i10 != i16) {
                                                        i17 = themeActivity.browserRow;
                                                        if (i10 != i17) {
                                                            if (i10 == themeActivity.f34112o0) {
                                                                return 11;
                                                            }
                                                            if (i10 != themeActivity.f34114q0) {
                                                                i18 = themeActivity.bubbleRadiusRow;
                                                                if (i10 != i18) {
                                                                    i19 = themeActivity.backgroundRow;
                                                                    if (i10 != i19 && i10 != themeActivity.f34127y0) {
                                                                        i20 = themeActivity.createNewThemeRow;
                                                                        if (i10 != i20) {
                                                                            i21 = themeActivity.liteModeRow;
                                                                            if (i10 != i21) {
                                                                                i22 = themeActivity.stickersRow;
                                                                                if (i10 != i22) {
                                                                                    if (i10 == themeActivity.f34120u0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i10 == themeActivity.f34125x0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i10 == themeActivity.f34113p0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i10 != themeActivity.H && i10 != themeActivity.I) {
                                                                                        i23 = themeActivity.appIconSelectorRow;
                                                                                        if (i10 != i23) {
                                                                                            i24 = themeActivity.changeUserColor;
                                                                                            if (i10 == i24) {
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
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        String L0;
        String L02;
        boolean z10;
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
        String L03;
        String L04;
        int i24 = c1Var.f47912f;
        View view = c1Var.f47909a;
        ThemeActivity themeActivity = this.e;
        boolean z11 = false;
        boolean z12 = true;
        if (i24 != 1) {
            if (i24 != 2) {
                if (i24 != 4) {
                    if (i24 != 5) {
                        if (i24 != 6) {
                            if (i24 != 7) {
                                if (i24 != 14) {
                                    if (i24 != 17) {
                                        if (i24 != 19) {
                                            if (i24 != 21) {
                                                switch (i24) {
                                                    case 10:
                                                        org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                                                        i22 = themeActivity.nightThemeRow;
                                                        if (i10 != i22) {
                                                            i23 = themeActivity.browserRow;
                                                            if (i10 == i23) {
                                                                l5Var.b(org.telegram.messenger.dd.L0(2131749218, null), org.telegram.messenger.dd.L0(2131749217, null), 2131232029, themeActivity.getMessagesController().K2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.t6.f21128o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            L03 = org.telegram.ui.ActionBar.t6.C0();
                                                        } else {
                                                            L03 = org.telegram.messenger.dd.L0(2131753783, "AutoNightThemeOff");
                                                        }
                                                        if (z11) {
                                                            int i25 = org.telegram.ui.ActionBar.t6.f21128o;
                                                            if (i25 == 1) {
                                                                L04 = org.telegram.messenger.dd.L0(2131753787, "AutoNightScheduled");
                                                            } else if (i25 == 3) {
                                                                L04 = org.telegram.messenger.dd.L0(2131753786, "AutoNightSystemDefault");
                                                            } else {
                                                                L04 = org.telegram.messenger.dd.L0(2131753796, "AutoNightAdaptive");
                                                            }
                                                            L03 = a1.g.C(L04, " ", L03);
                                                        }
                                                        l5Var.b(org.telegram.messenger.dd.L0(2131753784, "AutoNightTheme"), L03, 2131231842, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f34098c.A1(themeActivity.f34096b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.uk0 uk0Var = (org.telegram.ui.Components.uk0) view;
                                                        x71 x71Var = (x71) uk0Var.getAdapter();
                                                        x71Var.f();
                                                        int indexOf = x71Var.e.indexOf(x71Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = x71Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((s4.a0) uk0Var.getLayoutManager()).h1(indexOf, (themeActivity.f34096b.getMeasuredWidth() / 2) - org.telegram.messenger.i0.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((xm0) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
                                        if (i10 == themeActivity.H) {
                                            l6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            l6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((uu) view).a();
                                    return;
                                }
                                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                                p8Var.f22465w = 48;
                                i17 = themeActivity.backgroundRow;
                                if (i10 == i17) {
                                    p8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.t6.q6;
                                    p8Var.g(i26, i26);
                                    String L05 = org.telegram.messenger.dd.L0(2131752550, null);
                                    i21 = themeActivity.changeUserColor;
                                    if (i21 >= 0) {
                                        z11 = true;
                                    }
                                    p8Var.o(2131232065, L05, z11);
                                    return;
                                } else if (i10 != themeActivity.f34127y0) {
                                    i18 = themeActivity.createNewThemeRow;
                                    if (i10 != i18) {
                                        i19 = themeActivity.liteModeRow;
                                        if (i10 != i19) {
                                            i20 = themeActivity.stickersRow;
                                            if (i10 == i20) {
                                                p8Var.g(org.telegram.ui.ActionBar.t6.J5, org.telegram.ui.ActionBar.t6.G6);
                                                p8Var.o(2131232037, org.telegram.messenger.dd.L0(2131744875, null), false);
                                                p8Var.setSubtitle(org.telegram.messenger.dd.L0(2131744874, null));
                                                p8Var.f22464s = 64;
                                                p8Var.f22465w = 60;
                                                p8Var.f22466x = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        p8Var.g(org.telegram.ui.ActionBar.t6.J5, org.telegram.ui.ActionBar.t6.G6);
                                        p8Var.o(2131232014, org.telegram.messenger.dd.L0(2131748876, null), true);
                                        p8Var.setSubtitle(org.telegram.messenger.dd.L0(2131748875, null));
                                        p8Var.f22465w = 60;
                                        p8Var.f22464s = 64;
                                        p8Var.f22466x = 20;
                                        return;
                                    }
                                    p8Var.setSubtitle(null);
                                    int i27 = org.telegram.ui.ActionBar.t6.q6;
                                    p8Var.g(i27, i27);
                                    p8Var.o(2131232096, org.telegram.messenger.dd.L0(2131751713, null), false);
                                    return;
                                } else {
                                    p8Var.setSubtitle(null);
                                    int i28 = org.telegram.ui.ActionBar.t6.q6;
                                    p8Var.g(i28, i28);
                                    p8Var.o(2131232399, org.telegram.messenger.dd.L0(2131751282, null), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                            if (i10 == themeActivity.X) {
                                t8Var.f(org.telegram.messenger.dd.L0(2131753791, "AutoNightLocation"), org.telegram.ui.ActionBar.t6.f21147p, true);
                                return;
                            } else if (i10 == themeActivity.N) {
                                t8Var.f(org.telegram.messenger.dd.L0(2131751158, "EnableAnimations"), org.telegram.messenger.wp.d1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i10 == themeActivity.G) {
                                t8Var.f(org.telegram.messenger.dd.L0(2131745649, "SendByEnter"), org.telegram.messenger.wp.d1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i10 != themeActivity.E) {
                                i13 = themeActivity.raiseToListenRow;
                                if (i10 == i13) {
                                    t8Var.g(org.telegram.messenger.dd.L0(2131746442, "RaiseToListen"), org.telegram.messenger.dd.L0(2131746441, "RaiseToListenInfo"), org.telegram.messenger.uz.f18550s0, true, true);
                                    return;
                                } else if (i10 != themeActivity.F) {
                                    i14 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i14) {
                                        i15 = themeActivity.pauseOnMediaRow;
                                        if (i10 == i15) {
                                            t8Var.f(org.telegram.messenger.dd.L0(2131747448, null), org.telegram.messenger.uz.G0, true);
                                            return;
                                        } else if (i10 != themeActivity.D) {
                                            i16 = themeActivity.sensitiveContentRow;
                                            if (i10 == i16) {
                                                t8Var.g(org.telegram.messenger.dd.L0(2131745348, null), org.telegram.messenger.dd.L0(2131745347, null), themeActivity.getMessagesController().P4(), true, true);
                                                return;
                                            } else if (i10 == themeActivity.f34118s0) {
                                                t8Var.f(org.telegram.messenger.dd.L0(2131753675, "BlurInChat"), org.telegram.messenger.uz.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            t8Var.g(org.telegram.messenger.dd.L0(2131751439, "DirectShare"), org.telegram.messenger.dd.L0(2131751438, "DirectShareInfo"), org.telegram.messenger.uz.f18564x0, false, true);
                                            return;
                                        }
                                    }
                                    t8Var.g(org.telegram.messenger.dd.L0(2131747447, null), org.telegram.messenger.dd.L0(2131747446, "PauseMusicOnRecordInfo"), org.telegram.messenger.uz.F0, true, true);
                                    return;
                                } else {
                                    t8Var.g(org.telegram.messenger.dd.L0(2131748266, "NextMediaTap"), org.telegram.messenger.dd.L0(2131748265, "NextMediaTapInfo"), org.telegram.messenger.uz.f18553t0, true, true);
                                    return;
                                }
                            } else {
                                t8Var.g(org.telegram.messenger.dd.L0(2131746440, "RaiseToSpeak"), org.telegram.messenger.dd.L0(2131746439, "RaiseToSpeakInfo"), org.telegram.messenger.uz.f18547r0, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.i0) view).setProgress(org.telegram.ui.ActionBar.t6.f21164q);
                        return;
                    }
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    if (i10 == themeActivity.W) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131753788, "AutoNightSchedule"));
                        return;
                    } else if (i10 == themeActivity.f34100d0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131753795, "AutoNightBrightness"));
                        return;
                    } else if (i10 == themeActivity.f34104g0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131753789, "AutoNightPreferred"));
                        return;
                    } else if (i10 == themeActivity.f34126y) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131746000, "SETTINGS"));
                        return;
                    } else if (i10 == themeActivity.f34106i0) {
                        if (themeActivity.f34102f == 3) {
                            p4Var.setText(org.telegram.messenger.dd.L0(2131752839, "BuildMyOwnTheme"));
                            return;
                        } else {
                            p4Var.setText(org.telegram.messenger.dd.L0(2131752011, "ColorTheme"));
                            return;
                        }
                    } else if (i10 == themeActivity.f34124x) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131744216, "TextSizeHeader"));
                        return;
                    } else if (i10 == themeActivity.f34109l0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131752225, "ChatList"));
                        return;
                    } else if (i10 == themeActivity.f34107j0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131752840, "BubbleRadius"));
                        return;
                    } else if (i10 == themeActivity.f34119t0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131752222, "ChatListSwipeGesture"));
                        return;
                    } else if (i10 == themeActivity.f34123w0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131745668, "SelectTheme"));
                        return;
                    } else if (i10 == themeActivity.H0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131754240, null));
                        return;
                    } else if (i10 == themeActivity.F0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131747781, "OtherSettings"));
                        return;
                    } else if (i10 == themeActivity.E0) {
                        p4Var.setText(org.telegram.messenger.dd.L0(2131748675, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                if (i10 == themeActivity.R) {
                    String L06 = org.telegram.messenger.dd.L0(2131753793, "AutoNightDisabled");
                    if (org.telegram.ui.ActionBar.t6.f21128o == 0) {
                        z11 = true;
                    }
                    aaVar.a(L06, z11, true);
                    return;
                } else if (i10 == themeActivity.S) {
                    String L07 = org.telegram.messenger.dd.L0(2131753787, "AutoNightScheduled");
                    if (org.telegram.ui.ActionBar.t6.f21128o == 1) {
                        z11 = true;
                    }
                    aaVar.a(L07, z11, true);
                    return;
                } else if (i10 == themeActivity.T) {
                    String L08 = org.telegram.messenger.dd.L0(2131753796, "AutoNightAdaptive");
                    if (org.telegram.ui.ActionBar.t6.f21128o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.U != -1) {
                        z11 = true;
                    }
                    aaVar.a(L08, z10, z11);
                    return;
                } else if (i10 == themeActivity.U) {
                    String L09 = org.telegram.messenger.dd.L0(2131753786, "AutoNightSystemDefault");
                    if (org.telegram.ui.ActionBar.t6.f21128o != 3) {
                        z12 = false;
                    }
                    aaVar.a(L09, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setFixedSize(0);
            if (i10 == themeActivity.f34103f0) {
                b9Var.setText(org.telegram.messenger.dd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.t6.f21164q * 100.0f))));
                return;
            } else if (i10 == themeActivity.Z) {
                b9Var.setText(ThemeActivity.D0());
                return;
            } else if (i10 == themeActivity.f34121v0) {
                b9Var.setText(org.telegram.messenger.dd.L0(2131752221, "ChatListSwipeGestureInfo"));
                return;
            } else if (i10 == themeActivity.G0) {
                b9Var.setText(org.telegram.messenger.dd.L0(2131748875, "LiteModeInfo"));
                return;
            } else {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        i11 = themeActivity.nightThemeRow;
        if (i10 == i11) {
            if (org.telegram.ui.ActionBar.t6.f21128o != 0 && org.telegram.ui.ActionBar.t6.J != null) {
                x9Var.c(org.telegram.messenger.dd.L0(2131753784, null), org.telegram.ui.ActionBar.t6.C0(), false, false);
            } else {
                x9Var.c(org.telegram.messenger.dd.L0(2131753784, null), org.telegram.messenger.dd.L0(2131753783, null), false, false);
            }
        } else if (i10 == themeActivity.f34095a0) {
            int i29 = org.telegram.ui.ActionBar.t6.f21180r;
            int i30 = i29 / 60;
            x9Var.c(org.telegram.messenger.dd.L0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i30), Integer.valueOf(i29 - (i30 * 60))), false, true);
        } else if (i10 == themeActivity.f34097b0) {
            int i31 = org.telegram.ui.ActionBar.t6.f21198s;
            int i32 = i31 / 60;
            x9Var.c(org.telegram.messenger.dd.L0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i32), Integer.valueOf(i31 - (i32 * 60))), false, false);
        } else if (i10 == themeActivity.Y) {
            x9Var.c(org.telegram.messenger.dd.L0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.t6.f21271w, false, false);
        } else if (i10 == themeActivity.Q) {
            int i33 = org.telegram.messenger.wp.d1().getInt("sortContactsBy", 0);
            if (i33 == 0) {
                L02 = org.telegram.messenger.dd.L0(2131751601, "Default");
            } else if (i33 == 1) {
                L02 = org.telegram.messenger.dd.L0(2131745305, "FirstName");
            } else {
                L02 = org.telegram.messenger.dd.L0(2131745304, "LastName");
            }
            x9Var.c(org.telegram.messenger.dd.L0(2131745309, "SortBy"), L02, false, true);
        } else if (i10 == themeActivity.P) {
            x9Var.b(org.telegram.messenger.dd.L0(2131749273, "ImportContacts"), true);
        } else if (i10 == themeActivity.K) {
            int i34 = org.telegram.messenger.uz.f18551s1;
            if (i34 == 0) {
                L0 = org.telegram.messenger.dd.L0(2131751367, "DistanceUnitsAutomatic");
            } else if (i34 == 1) {
                L0 = org.telegram.messenger.dd.L0(2131751366, "DistanceUnitsKilometers");
            } else {
                L0 = org.telegram.messenger.dd.L0(2131751365, "DistanceUnitsMiles");
            }
            String L010 = org.telegram.messenger.dd.L0(2131751368, "DistanceUnits");
            boolean z13 = themeActivity.O0;
            if (themeActivity.D0 < 0) {
                z12 = false;
            }
            x9Var.c(L010, L0, z13, z12);
            themeActivity.O0 = false;
        } else if (i10 == themeActivity.L) {
            x9Var.c(org.telegram.messenger.dd.L0(2131745816, null), org.telegram.ui.web.g1.a().f42847a, themeActivity.P0, false);
        } else if (i10 == themeActivity.M) {
            String L011 = org.telegram.messenger.dd.L0(2131748454, null);
            if (org.telegram.messenger.uz.f18556u0) {
                i12 = 2131748452;
            } else {
                i12 = 2131748453;
            }
            x9Var.c(L011, org.telegram.messenger.dd.L0(i12, null), themeActivity.N0, false);
            themeActivity.N0 = false;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ?? x9Var;
        int i11;
        int i12;
        float f7;
        float f10;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i16;
        xm0 xm0Var;
        int i17;
        ThemeActivity themeActivity = this.e;
        Context context = this.f42431c;
        switch (i10) {
            case 1:
                x9Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 2:
                x9Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 3:
                x9Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f21694a = textView;
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                org.telegram.messenger.a30.o(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                int i18 = 3;
                if (org.telegram.messenger.dd.X) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11 | 16);
                boolean z12 = org.telegram.messenger.dd.X;
                if (z12) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                int i19 = i12 | 48;
                if (z12) {
                    f7 = 71.0f;
                } else {
                    f7 = 21.0f;
                }
                if (z12) {
                    f10 = 21.0f;
                } else {
                    f10 = 23.0f;
                }
                frameLayout.addView(textView, w7.b6.d(-1, -1.0f, i19, f7, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f21695b = imageView;
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232752);
                if (!org.telegram.messenger.dd.X) {
                    i18 = 5;
                }
                frameLayout.addView(imageView, w7.b6.d(19, 14.0f, i18 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                xm0Var = frameLayout;
                x9Var = xm0Var;
                break;
            case 5:
                x9Var = new org.telegram.ui.Cells.p4(context);
                break;
            case 6:
                x9Var = new r71(this, context);
                break;
            case 7:
                x9Var = new org.telegram.ui.Cells.t8(context);
                break;
            case 8:
                x9Var = new w71(themeActivity, context);
                break;
            case 9:
                x9Var = new s71(context, 0);
                x9Var.f41280b = new org.telegram.ui.Cells.u0[2];
                x9Var.setOrientation(0);
                x9Var.setPadding(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(21.0f), 0);
                int i20 = 0;
                while (true) {
                    org.telegram.ui.Cells.u0[] u0VarArr = (org.telegram.ui.Cells.u0[]) x9Var.f41280b;
                    if (i20 >= u0VarArr.length) {
                        break;
                    } else {
                        if (i20 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(context, 0);
                        u0Var.f23119b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        u0Var.e = textPaint;
                        u0Var.setWillNotDraw(false);
                        u0Var.f23120c = z10;
                        if (z10) {
                            i13 = 2131752223;
                        } else {
                            i13 = 2131752224;
                        }
                        u0Var.setContentDescription(org.telegram.messenger.dd.L0(i13, null));
                        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
                        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(u0Var, context);
                        u0Var.d = t0Var;
                        t0Var.setSize(org.telegram.messenger.i0.L(20.0f));
                        u0Var.addView(t0Var, w7.b6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && org.telegram.messenger.uz.f18542p1) || (!z10 && !org.telegram.messenger.uz.f18542p1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        t0Var.a(z11, false);
                        u0VarArr[i20] = u0Var;
                        org.telegram.ui.Cells.u0 u0Var2 = ((org.telegram.ui.Cells.u0[]) x9Var.f41280b)[i20];
                        if (i20 == 1) {
                            i14 = 10;
                        } else {
                            i14 = 0;
                        }
                        x9Var.addView(u0Var2, w7.b6.m(0.5f, -1, -1, i14, 0, 0));
                        ((org.telegram.ui.Cells.u0[]) x9Var.f41280b)[i20].setOnClickListener(new org.telegram.ui.ActionBar.c0(1, x9Var, z10));
                        i20++;
                    }
                }
                break;
            case 10:
                x9Var = new org.telegram.ui.Cells.l5(21, 60, this.f42431c, null, true);
                break;
            case 11:
                this.d = true;
                t71 t71Var = new t71(this, this.f42431c, themeActivity, themeActivity.f34102f, themeActivity.e, themeActivity.d);
                themeActivity.f34098c = t71Var;
                t71Var.setDrawDivider(themeActivity.f34122w);
                themeActivity.f34098c.setFocusable(false);
                x9Var = themeActivity.f34098c;
                x9Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(148.0f)));
                break;
            case 12:
                ?? u71Var = new u71(0, context, null);
                u71Var.setFocusable(false);
                u71Var.setItemAnimator(null);
                u71Var.setLayoutAnimation(null);
                u71Var.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), 0);
                u71Var.setClipToPadding(false);
                s4.a0 a0Var = new s4.a0();
                a0Var.j1(0);
                u71Var.setLayoutManager(a0Var);
                x71 x71Var = new x71(themeActivity, context);
                u71Var.setAdapter(x71Var);
                u71Var.setOnItemClickListener(new p71(this, x71Var, u71Var, 0));
                u71Var.setOnItemLongClickListener(new cp0(16, this, x71Var));
                u71Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(62.0f)));
                xm0Var = u71Var;
                x9Var = xm0Var;
                break;
            case 13:
                x9Var = new m71(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                x9Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 15:
                i15 = ((org.telegram.ui.ActionBar.k2) themeActivity).currentAccount;
                x9Var = new org.telegram.ui.Components.zx0(context, i15);
                break;
            case 16:
                z4Var = ((org.telegram.ui.ActionBar.k2) themeActivity).parentLayout;
                x9Var = new gn0(context, z4Var, 0);
                x9Var.setImportantForAccessibility(4);
                break;
            case 17:
                x9Var = new uu(themeActivity.f34102f, context, themeActivity);
                x9Var.setFocusable(false);
                x9Var.setLayoutParams(new s4.o0(-1, -2));
                break;
            case 19:
                x9Var = new org.telegram.ui.Cells.l6(context, false);
                break;
            case 20:
                i16 = ((org.telegram.ui.ActionBar.k2) themeActivity).currentAccount;
                x9Var = new org.telegram.ui.Components.uk0(context, null);
                x9Var.f23062e3 = new ArrayList();
                x9Var.f23064g3 = i16;
                x9Var.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
                x9Var.setFocusable(false);
                x9Var.setItemAnimator(null);
                x9Var.setLayoutAnimation(null);
                s4.a0 a0Var2 = new s4.a0(0, false);
                x9Var.f23063f3 = a0Var2;
                x9Var.setLayoutManager(a0Var2);
                x9Var.setAdapter(new x7(x9Var, 1));
                x9Var.i(new mg.u1(x9Var, 2));
                x9Var.setOnItemClickListener(new org.telegram.ui.Cells.o(x9Var, themeActivity, context, 0));
                x9Var.z1();
                break;
            case 21:
                i17 = ((org.telegram.ui.ActionBar.k2) themeActivity).currentAccount;
                xm0Var = new xm0(i17, 0L, this.f42431c, themeActivity.getResourceProvider());
                x9Var = xm0Var;
                break;
        }
        return new s4.c1(x9Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        if (c1Var.f47912f == 4) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) c1Var.f47909a;
            if (c1Var.b() == org.telegram.ui.ActionBar.t6.f21128o) {
                z10 = true;
            } else {
                z10 = false;
            }
            aaVar.setTypeChecked(z10);
        }
    }
}
