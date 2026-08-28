package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class xa1 extends org.telegram.ui.Components.vk0 {
    public final Context f44443c;
    public boolean d = true;
    public final ThemeActivity f44444e;

    public xa1(ThemeActivity themeActivity, Context context) {
        this.f44444e = themeActivity;
        this.f44443c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 0 || i9 == 1 || i9 == 4 || i9 == 7 || i9 == 10 || i9 == 11 || i9 == 12 || i9 == 14 || i9 == 18 || i9 == 20 || i9 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f44444e.F0;
    }

    @Override
    public final int j(int i9) {
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
        ThemeActivity themeActivity = this.f44444e;
        if (i9 != themeActivity.W && i9 != themeActivity.G && i9 != themeActivity.X && i9 != themeActivity.U && i9 != themeActivity.L && i9 != themeActivity.M && i9 != themeActivity.I && i9 != themeActivity.H) {
            if (i9 != themeActivity.f36228b0 && i9 != themeActivity.V && i9 != themeActivity.f36248r0 && i9 != themeActivity.f36255w0 && i9 != themeActivity.C0) {
                if (i9 != themeActivity.f36243n0 && i9 != themeActivity.R && i9 != themeActivity.Y && i9 != themeActivity.K && i9 != themeActivity.f36231d0 && i9 != themeActivity.f36239j0 && i9 != themeActivity.f36236g0 && i9 != themeActivity.F && i9 != themeActivity.E0 && i9 != themeActivity.f36253v0 && i9 != themeActivity.f36257x0 && i9 != themeActivity.f36259y0 && i9 != themeActivity.f36260z0) {
                    if (i9 != themeActivity.N && i9 != themeActivity.O && i9 != themeActivity.P && i9 != themeActivity.Q) {
                        if (i9 != themeActivity.S && i9 != themeActivity.Z && i9 != themeActivity.f36230c0 && i9 != themeActivity.f36256x && i9 != themeActivity.f36233e0 && i9 != themeActivity.f36254w && i9 != themeActivity.f36237h0 && i9 != themeActivity.f36235f0 && i9 != themeActivity.f36245p0 && i9 != themeActivity.f36250s0 && i9 != themeActivity.D0 && i9 != themeActivity.A0 && i9 != themeActivity.B0) {
                            if (i9 == themeActivity.f36226a0) {
                                return 6;
                            }
                            if (i9 != themeActivity.T && i9 != themeActivity.C && i9 != themeActivity.A) {
                                i10 = themeActivity.raiseToListenRow;
                                if (i9 != i10) {
                                    i11 = themeActivity.pauseOnRecordRow;
                                    if (i9 != i11 && i9 != themeActivity.f36258y && i9 != themeActivity.f36244o0) {
                                        i12 = themeActivity.pauseOnMediaRow;
                                        if (i9 != i12 && i9 != themeActivity.B) {
                                            i13 = themeActivity.sensitiveContentRow;
                                            if (i9 != i13) {
                                                i14 = themeActivity.textSizeRow;
                                                if (i9 == i14) {
                                                    return 8;
                                                }
                                                if (i9 != themeActivity.f36238i0) {
                                                    i15 = themeActivity.nightThemeRow;
                                                    if (i9 != i15) {
                                                        i16 = themeActivity.browserRow;
                                                        if (i9 != i16) {
                                                            if (i9 == themeActivity.f36240k0) {
                                                                return 11;
                                                            }
                                                            if (i9 != themeActivity.m0) {
                                                                i17 = themeActivity.bubbleRadiusRow;
                                                                if (i9 != i17) {
                                                                    i18 = themeActivity.backgroundRow;
                                                                    if (i9 != i18 && i9 != themeActivity.f36252u0) {
                                                                        i19 = themeActivity.createNewThemeRow;
                                                                        if (i9 != i19) {
                                                                            i20 = themeActivity.liteModeRow;
                                                                            if (i9 != i20) {
                                                                                i21 = themeActivity.stickersRow;
                                                                                if (i9 != i21) {
                                                                                    if (i9 == themeActivity.f36246q0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i9 == themeActivity.f36251t0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i9 == themeActivity.f36241l0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i9 != themeActivity.D && i9 != themeActivity.E) {
                                                                                        i22 = themeActivity.appIconSelectorRow;
                                                                                        if (i9 != i22) {
                                                                                            i23 = themeActivity.changeUserColor;
                                                                                            if (i9 == i23) {
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
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        String string;
        String string2;
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
        String string3;
        String string4;
        int i23 = q1Var.f5505f;
        View view = q1Var.f5501a;
        ThemeActivity themeActivity = this.f44444e;
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
                                                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                                                        i21 = themeActivity.nightThemeRow;
                                                        if (i9 != i21) {
                                                            i22 = themeActivity.browserRow;
                                                            if (i9 == i22) {
                                                                j5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.f6.f23190o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            string3 = org.telegram.ui.ActionBar.f6.z0();
                                                        } else {
                                                            string3 = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                                                        }
                                                        if (z11) {
                                                            int i24 = org.telegram.ui.ActionBar.f6.f23190o;
                                                            if (i24 == 1) {
                                                                string4 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                                            } else if (i24 == 3) {
                                                                string4 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                                            } else {
                                                                string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                                            }
                                                            string3 = aa.d.z(string4, " ", string3);
                                                        }
                                                        j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string3, R.drawable.menu_night_mode_24, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f36229c.x1(themeActivity.f36227b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) view;
                                                        za1 za1Var = (za1) wk0Var.getAdapter();
                                                        za1Var.l();
                                                        int indexOf = za1Var.f45098e.indexOf(za1Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = za1Var.h() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((f2.m0) wk0Var.getLayoutManager()).h1(indexOf, (themeActivity.f36227b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((ho0) view).set(themeActivity.getUserConfig().getCurrentUser());
                                            return;
                                        }
                                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                                        if (i9 == themeActivity.D) {
                                            i6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            i6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((tu) view).b();
                                    return;
                                }
                                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                                p8Var.v = 48;
                                i16 = themeActivity.backgroundRow;
                                if (i9 == i16) {
                                    p8Var.setSubtitle(null);
                                    int i25 = org.telegram.ui.ActionBar.f6.f23229q6;
                                    p8Var.e(i25, i25);
                                    String string5 = LocaleController.getString(R.string.ChangeChatBackground);
                                    int i26 = R.drawable.msg_background;
                                    i20 = themeActivity.changeUserColor;
                                    if (i20 >= 0) {
                                        z11 = true;
                                    }
                                    p8Var.m(i26, string5, z11);
                                    return;
                                } else if (i9 != themeActivity.f36252u0) {
                                    i17 = themeActivity.createNewThemeRow;
                                    if (i9 != i17) {
                                        i18 = themeActivity.liteModeRow;
                                        if (i9 != i18) {
                                            i19 = themeActivity.stickersRow;
                                            if (i9 == i19) {
                                                p8Var.e(org.telegram.ui.ActionBar.f6.J5, org.telegram.ui.ActionBar.f6.G6);
                                                p8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                                                p8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                                p8Var.f24879s = 64;
                                                p8Var.v = 60;
                                                p8Var.f24880w = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        p8Var.e(org.telegram.ui.ActionBar.f6.J5, org.telegram.ui.ActionBar.f6.G6);
                                        p8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                                        p8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                                        p8Var.v = 60;
                                        p8Var.f24879s = 64;
                                        p8Var.f24880w = 20;
                                        return;
                                    }
                                    p8Var.setSubtitle(null);
                                    int i27 = org.telegram.ui.ActionBar.f6.f23229q6;
                                    p8Var.e(i27, i27);
                                    p8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                                    return;
                                } else {
                                    p8Var.setSubtitle(null);
                                    int i28 = org.telegram.ui.ActionBar.f6.f23229q6;
                                    p8Var.e(i28, i28);
                                    p8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                            if (i9 == themeActivity.T) {
                                t8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.f6.f23205p, true);
                                return;
                            } else if (i9 == themeActivity.J) {
                                t8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                                return;
                            } else if (i9 == themeActivity.C) {
                                t8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i9 != themeActivity.A) {
                                i12 = themeActivity.raiseToListenRow;
                                if (i9 == i12) {
                                    t8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                                    return;
                                } else if (i9 != themeActivity.B) {
                                    i13 = themeActivity.pauseOnRecordRow;
                                    if (i9 != i13) {
                                        i14 = themeActivity.pauseOnMediaRow;
                                        if (i9 == i14) {
                                            t8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                                            return;
                                        } else if (i9 != themeActivity.f36258y) {
                                            i15 = themeActivity.sensitiveContentRow;
                                            if (i9 == i15) {
                                                t8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                                                return;
                                            } else if (i9 == themeActivity.f36244o0) {
                                                t8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            t8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                                            return;
                                        }
                                    }
                                    t8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                                    return;
                                } else {
                                    t8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                                    return;
                                }
                            } else {
                                t8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.f6.f23222q);
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (i9 == themeActivity.S) {
                        m4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                        return;
                    } else if (i9 == themeActivity.Z) {
                        m4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                        return;
                    } else if (i9 == themeActivity.f36230c0) {
                        m4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    } else if (i9 == themeActivity.f36256x) {
                        m4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                        return;
                    } else if (i9 == themeActivity.f36233e0) {
                        if (themeActivity.f36234f == 3) {
                            m4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                            return;
                        } else {
                            m4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                            return;
                        }
                    } else if (i9 == themeActivity.f36254w) {
                        m4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                        return;
                    } else if (i9 == themeActivity.f36237h0) {
                        m4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                        return;
                    } else if (i9 == themeActivity.f36235f0) {
                        m4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                        return;
                    } else if (i9 == themeActivity.f36245p0) {
                        m4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                        return;
                    } else if (i9 == themeActivity.f36250s0) {
                        m4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                        return;
                    } else if (i9 == themeActivity.D0) {
                        m4Var.setText(LocaleController.getString(R.string.AppIcon));
                        return;
                    } else if (i9 == themeActivity.B0) {
                        m4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                        return;
                    } else if (i9 == themeActivity.A0) {
                        m4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                if (i9 == themeActivity.N) {
                    String string6 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    if (org.telegram.ui.ActionBar.f6.f23190o == 0) {
                        z11 = true;
                    }
                    gaVar.a(string6, z11, true);
                    return;
                } else if (i9 == themeActivity.O) {
                    String string7 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    if (org.telegram.ui.ActionBar.f6.f23190o == 1) {
                        z11 = true;
                    }
                    gaVar.a(string7, z11, true);
                    return;
                } else if (i9 == themeActivity.P) {
                    String string8 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    if (org.telegram.ui.ActionBar.f6.f23190o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.Q != -1) {
                        z11 = true;
                    }
                    gaVar.a(string8, z10, z11);
                    return;
                } else if (i9 == themeActivity.Q) {
                    String string9 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    if (org.telegram.ui.ActionBar.f6.f23190o != 3) {
                        z12 = false;
                    }
                    gaVar.a(string9, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setFixedSize(0);
            if (i9 == themeActivity.f36228b0) {
                b9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.f6.f23222q * 100.0f))));
                return;
            } else if (i9 == themeActivity.V) {
                b9Var.setText(ThemeActivity.x0());
                return;
            } else if (i9 == themeActivity.f36248r0) {
                b9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i9 == themeActivity.C0) {
                b9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        i10 = themeActivity.nightThemeRow;
        if (i9 == i10) {
            if (org.telegram.ui.ActionBar.f6.f23190o != 0 && org.telegram.ui.ActionBar.f6.J != null) {
                baVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.f6.z0(), false, false);
            } else {
                baVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
            }
        } else if (i9 == themeActivity.W) {
            int i29 = org.telegram.ui.ActionBar.f6.f23241r;
            int i30 = i29 / 60;
            baVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i30), Integer.valueOf(i29 - (i30 * 60))), false, true);
        } else if (i9 == themeActivity.X) {
            int i31 = org.telegram.ui.ActionBar.f6.f23260s;
            int i32 = i31 / 60;
            baVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i32), Integer.valueOf(i31 - (i32 * 60))), false, false);
        } else if (i9 == themeActivity.U) {
            baVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.f6.f23327w, false, false);
        } else if (i9 == themeActivity.M) {
            int i33 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
            if (i33 == 0) {
                string2 = LocaleController.getString("Default", R.string.Default);
            } else if (i33 == 1) {
                string2 = LocaleController.getString("FirstName", R.string.SortFirstName);
            } else {
                string2 = LocaleController.getString("LastName", R.string.SortLastName);
            }
            baVar.c(LocaleController.getString("SortBy", R.string.SortBy), string2, false, true);
        } else if (i9 == themeActivity.L) {
            baVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
        } else if (i9 == themeActivity.G) {
            int i34 = SharedConfig.distanceSystemType;
            if (i34 == 0) {
                string = LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic);
            } else if (i34 == 1) {
                string = LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers);
            } else {
                string = LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles);
            }
            String string10 = LocaleController.getString("DistanceUnits", R.string.DistanceUnits);
            boolean z13 = themeActivity.K0;
            if (themeActivity.f36260z0 < 0) {
                z12 = false;
            }
            baVar.c(string10, string, z13, z12);
            themeActivity.K0 = false;
        } else if (i9 == themeActivity.H) {
            baVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.j1.a().f43902a, themeActivity.L0, false);
        } else if (i9 == themeActivity.I) {
            String string11 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            if (SharedConfig.recordViaSco) {
                i11 = R.string.MicrophoneForVoiceMessagesSco;
            } else {
                i11 = R.string.MicrophoneForVoiceMessagesBuiltIn;
            }
            baVar.c(string11, LocaleController.getString(i11), themeActivity.J0, false);
            themeActivity.J0 = false;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ?? frameLayout;
        int i10;
        int i11;
        float f10;
        float f11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        va1 j5Var;
        int i14;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i15;
        int i16;
        int i17 = 4;
        int i18 = 5;
        ThemeActivity themeActivity = this.f44444e;
        Context context = this.f44443c;
        switch (i9) {
            case 1:
                j5Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 2:
                j5Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 3:
                j5Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f24407a = textView;
                org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                boolean z12 = LocaleController.isRTL;
                if (z12) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                int i19 = i11 | 48;
                if (z12) {
                    f10 = 71.0f;
                } else {
                    f10 = 21.0f;
                }
                if (z12) {
                    f11 = 21.0f;
                } else {
                    f11 = 23.0f;
                }
                frameLayout.addView(textView, g7.e6.d(-1, -1.0f, i19, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f24408b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                if (LocaleController.isRTL) {
                    i18 = 3;
                }
                frameLayout.addView(imageView, g7.e6.d(19, 14.0f, i18 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                j5Var = frameLayout;
                break;
            case 5:
                j5Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 6:
                j5Var = new sa1(this, context);
                break;
            case 7:
                j5Var = new org.telegram.ui.Cells.t8(context);
                break;
            case 8:
                j5Var = new ya1(themeActivity, context);
                break;
            case 9:
                frameLayout = new ta1(context);
                frameLayout.f42939b = new org.telegram.ui.Cells.y0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i20 = 0;
                while (true) {
                    ?? r32 = (org.telegram.ui.Cells.y0[]) frameLayout.f42939b;
                    if (i20 >= r32.length) {
                        j5Var = frameLayout;
                        break;
                    } else {
                        if (i20 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.f25978c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.d = textPaint;
                        frameLayout2.setWillNotDraw(false);
                        frameLayout2.f25977b = z10;
                        if (z10) {
                            i12 = R.string.ChatListExpanded;
                        } else {
                            i12 = R.string.ChatListDefault;
                        }
                        frameLayout2.setContentDescription(LocaleController.getString(i12));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(frameLayout2, context);
                        frameLayout2.f25976a = x0Var;
                        x0Var.setSize(AndroidUtilities.dp(20.0f));
                        frameLayout2.addView(x0Var, g7.e6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && SharedConfig.useThreeLinesLayout) || (!z10 && !SharedConfig.useThreeLinesLayout)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        x0Var.a(z11, false);
                        r32[i20] = frameLayout2;
                        org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) frameLayout.f42939b)[i20];
                        if (i20 == 1) {
                            i13 = 10;
                        } else {
                            i13 = 0;
                        }
                        frameLayout.addView(y0Var, g7.e6.m(0.5f, -1, -1, i13, 0, 0));
                        ((org.telegram.ui.Cells.y0[]) frameLayout.f42939b)[i20].setOnClickListener(new ih.b2(3, frameLayout, z10));
                        i20++;
                    }
                }
                break;
            case 10:
                j5Var = new org.telegram.ui.Cells.j5(21, 60, this.f44443c, null, true);
                break;
            case 11:
                this.d = true;
                ua1 ua1Var = new ua1(this, this.f44443c, themeActivity, themeActivity.f36234f, themeActivity.f36232e, themeActivity.d);
                themeActivity.f36229c = ua1Var;
                ua1Var.setDrawDivider(themeActivity.v);
                themeActivity.f36229c.setFocusable(false);
                View view = themeActivity.f36229c;
                view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(148.0f)));
                j5Var = view;
                break;
            case 12:
                va1 va1Var = new va1(context, 0, null);
                va1Var.setFocusable(false);
                va1Var.setItemAnimator(null);
                va1Var.setLayoutAnimation(null);
                va1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                va1Var.setClipToPadding(false);
                f2.m0 m0Var = new f2.m0();
                m0Var.j1(0);
                va1Var.setLayoutManager(m0Var);
                za1 za1Var = new za1(themeActivity, context);
                va1Var.setAdapter(za1Var);
                va1Var.setOnItemClickListener(new qa1(this, za1Var, va1Var, 0));
                va1Var.setOnItemLongClickListener(new nl0(22, this, za1Var));
                va1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(62.0f)));
                j5Var = va1Var;
                break;
            case 13:
                j5Var = new na1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                j5Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 15:
                i14 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                ?? frameLayout3 = new FrameLayout(context);
                Paint paint = new Paint(1);
                frameLayout3.f26926a = paint;
                frameLayout3.f26927b = new Paint(1);
                Paint paint2 = new Paint(1);
                frameLayout3.f26928c = paint2;
                Paint paint3 = new Paint(1);
                frameLayout3.d = paint3;
                frameLayout3.f26929e = new RectF();
                int i21 = 6;
                frameLayout3.h = r14;
                frameLayout3.f26931n = r15;
                frameLayout3.f26932r = new org.telegram.ui.Components.mi0[6];
                frameLayout3.v = new org.telegram.ui.Components.pi0[2];
                float f12 = 1.0f;
                frameLayout3.f26935x = 1.0f;
                String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                int i22 = org.telegram.ui.ActionBar.f6.f22986c9;
                int[] iArr = {i22, i22, i22, i22, org.telegram.ui.ActionBar.f6.Y5, org.telegram.ui.ActionBar.f6.d9};
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint2.setStyle(style);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint2.setStrokeCap(cap);
                paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint3.setStyle(style);
                paint3.setStrokeCap(cap);
                paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
                org.telegram.ui.Components.zx0 zx0Var = new org.telegram.ui.Components.zx0(frameLayout3, context);
                frameLayout3.f26930f = zx0Var;
                zx0Var.setMinValue(0);
                zx0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i14).dialogFilters.isEmpty();
                if (!isEmpty) {
                    i17 = 5;
                }
                zx0Var.setMaxValue(i17);
                if (isEmpty) {
                    i21 = 5;
                }
                zx0Var.setAllItemsCount(i21);
                zx0Var.setWrapSelectorWheel(true);
                zx0Var.setFormatter(new org.telegram.ui.Components.yx0(frameLayout3));
                zx0Var.setOnValueChangedListener(new org.telegram.ui.Components.yx0(frameLayout3));
                zx0Var.setImportantForAccessibility(2);
                zx0Var.setValue(SharedConfig.getChatSwipeAction(i14));
                frameLayout3.addView(zx0Var, g7.e6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                frameLayout3.setWillNotDraw(false);
                frameLayout3.f26933s = 0;
                for (int i23 = 0; i23 < 2; i23++) {
                    frameLayout3.v[i23] = new ImageView(context);
                    frameLayout3.addView(frameLayout3.v[i23], g7.e6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.mi0 a2 = frameLayout3.a(frameLayout3.f26930f.getValue());
                if (a2 != null) {
                    frameLayout3.v[0].setImageDrawable(a2);
                    a2.K(a2.f30847e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[1], false, 0.5f, false);
                if (frameLayout3.f26930f.getValue() != 5) {
                    f12 = 0.0f;
                }
                frameLayout3.f26934w = f12;
                frameLayout3.B = frameLayout3.f26930f.getValue();
                j5Var = frameLayout3;
                break;
            case 16:
                b5Var = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
                View faVar = new org.telegram.ui.Cells.fa(context, b5Var, 0);
                faVar.setImportantForAccessibility(4);
                j5Var = faVar;
                break;
            case 17:
                View tuVar = new tu(themeActivity.f36234f, context, themeActivity);
                tuVar.setFocusable(false);
                tuVar.setLayoutParams(new f2.a1(-1, -2));
                j5Var = tuVar;
                break;
            case 19:
                j5Var = new org.telegram.ui.Cells.i6(context, false);
                break;
            case 20:
                i15 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                ?? wk0Var = new org.telegram.ui.Components.wk0(context, null);
                wk0Var.T2 = new ArrayList();
                wk0Var.V2 = i15;
                wk0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                wk0Var.setFocusable(false);
                wk0Var.setItemAnimator(null);
                wk0Var.setLayoutAnimation(null);
                f2.m0 m0Var2 = new f2.m0(0, false);
                wk0Var.U2 = m0Var2;
                wk0Var.setLayoutManager(m0Var2);
                wk0Var.setAdapter(new v7(wk0Var, 1));
                wk0Var.i(new bg.p2(wk0Var, 2));
                wk0Var.setOnItemClickListener(new ih.f0(wk0Var, themeActivity, context, 3));
                wk0Var.w1();
                j5Var = wk0Var;
                break;
            case 21:
                i16 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                frameLayout = new ho0(i16, 0L, this.f44443c, themeActivity.getResourceProvider());
                j5Var = frameLayout;
                break;
        }
        return new f2.q1(j5Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        boolean z10;
        if (q1Var.f5505f == 4) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) q1Var.f5501a;
            if (q1Var.b() == org.telegram.ui.ActionBar.f6.f23190o) {
                z10 = true;
            } else {
                z10 = false;
            }
            gaVar.setTypeChecked(z10);
        }
    }
}
