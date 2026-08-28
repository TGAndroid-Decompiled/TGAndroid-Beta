package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s91 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public e91 A;
    public final ng.d A0;
    public e91 B;
    public final ig.a B0;
    public o91 C;
    public p81 C0;
    public e91 D;
    public final ArrayList D0;
    public e91 E;
    public final RectF E0;
    public e91 F;
    public final RectF F0;
    public e91 G;
    public e91 H;
    public e91 I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public org.telegram.ui.Components.tn N;
    public t81 O;
    public ig.k P;
    public f2.m0 Q;
    public final LruCache R;
    public org.telegram.ui.Components.pi0 S;
    public x81 T;
    public q81 U;
    public r91 V;
    public qf.f W;
    public LinearLayout X;
    public final boolean Y;
    public final boolean Z;
    public TLRPC.ChatFull f42606a;
    public final boolean f42607a0;
    public final long f42608b;
    public long f42609b0;
    public boolean f42610c;
    public long f42611c0;
    public e91 d;
    public final org.telegram.ui.ActionBar.c2[] f42612d0;
    public e91 f42613e;
    public kh.j1 f42614e0;
    public n91 f42615f;
    public xb f42616f0;
    public fe f42617g0;
    public e91 h;
    public final boolean f42618h0;
    public pg0 f42619i0;
    public wg.b[] f42620j0;
    public int f42621k0;
    public final SparseIntArray f42622l0;
    public final SparseIntArray m0;
    public e91 f42623n;
    public final ArrayList f42624n0;
    public final ArrayList f42625o0;
    public final ArrayList f42626p0;
    public final ArrayList f42627q0;
    public e91 f42628r;
    public final ArrayList f42629r0;
    public e91 f42630s;
    public boolean f42631s0;
    public boolean f42632t0;
    public f91 f42633u0;
    public e91 v;
    public ih.n6 f42634v0;
    public e91 f42635w;
    public int f42636w0;
    public e91 f42637x;
    public final v5 f42638x0;
    public e91 f42639y;
    public final ig.e f42640y0;
    public final ng.d f42641z0;

    public s91(Bundle bundle) {
        super(bundle);
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.R = new LruCache(50);
        this.f42612d0 = new org.telegram.ui.ActionBar.c2[1];
        this.f42621k0 = -1;
        this.f42622l0 = new SparseIntArray();
        this.m0 = new SparseIntArray();
        this.f42624n0 = new ArrayList();
        this.f42625o0 = new ArrayList();
        this.f42626p0 = new ArrayList();
        this.f42627q0 = new ArrayList();
        this.f42629r0 = new ArrayList();
        this.f42632t0 = true;
        this.f42638x0 = new v5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.D0 = arrayList;
        RectF rectF = new RectF();
        this.E0 = rectF;
        RectF rectF2 = new RectF();
        this.F0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.f42608b = j10;
        this.Y = bundle.getBoolean("is_megagroup", false);
        this.Z = bundle.getBoolean("start_from_boosts", false);
        this.f42607a0 = bundle.getBoolean("start_from_monetization", false);
        this.f42618h0 = bundle.getBoolean("only_boosts", false);
        this.f42606a = getMessagesController().getChatFull(j10);
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f42640y0 = new ig.e(false);
            this.f42641z0 = new ng.d(null);
            ng.d dVar = new ng.d(null);
            this.A0 = dVar;
            ig.a aVar = new ig.a(dVar);
            this.B0 = aVar;
            aVar.f11132f = LiteMode.isEnabled(262144);
            return;
        }
        this.f42640y0 = null;
        this.f42641z0 = null;
        this.A0 = null;
        this.B0 = new ig.a(cVar);
    }

    public static void T(s91 s91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                arrayList.add(new MessageObject(s91Var.currentAccount, arrayList2.get(i9), false, true));
            }
            s91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new m81(s91Var, arrayList, 0));
    }

    public static void U(s91 s91Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float abs5;
        int i9;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        int i10;
        ArrayList arrayList4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        ArrayList arrayList5 = s91Var.J;
        ArrayList arrayList6 = s91Var.K;
        ArrayList arrayList7 = s91Var.f42624n0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final e91[] e91VarArr = {e0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), e0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), e0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), e0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), e0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), e0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), e0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), e0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), e0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), e0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), e0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), e0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            e91 e91Var = e91VarArr[2];
            if (e91Var != null) {
                e91Var.f37880n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.t a2 = n91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f40666o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f40667p = (String) a2.f4177b;
            obj.f40668q = (String) a2.f4179e;
            obj.f40669r = ((Boolean) a2.f4178c).booleanValue();
            obj.f40670s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.t a3 = n91.a(tL_broadcastStats.reactions_per_story);
            obj.f40671t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f40672u = (String) a3.f4177b;
            obj.v = (String) a3.f4179e;
            obj.f40673w = ((Boolean) a3.f4178c).booleanValue();
            obj.f40674x = ((Boolean) a3.d).booleanValue();
            com.google.firebase.messaging.t a10 = n91.a(tL_broadcastStats.views_per_story);
            obj.f40675y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f40676z = (String) a10.f4177b;
            obj.A = (String) a10.f4179e;
            obj.B = ((Boolean) a10.f4178c).booleanValue();
            obj.C = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.t a11 = n91.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a11.f4177b;
            obj.F = (String) a11.f4179e;
            obj.G = ((Boolean) a11.f4178c).booleanValue();
            obj.H = ((Boolean) a11.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d9 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i11 = (int) (d - d9);
            if (d9 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i11 / ((float) d9)) * 100.0f);
            }
            obj.f40654a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f40655b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs5 == 0.0f) {
                i9 = i11;
                obj.f40656c = "";
            } else {
                int i12 = (int) abs5;
                if (abs5 == i12) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i11 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i11, 0));
                    String sb3 = sb2.toString();
                    obj.f40656c = sb3 + " (" + i12 + "%)";
                    i9 = i11;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i11 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb4.append(str14);
                    sb4.append(AndroidUtilities.formatWholeNumber(i11, 0));
                    i9 = i11;
                    obj.f40656c = String.format(locale2, "%s (%.1f%s)", sb4.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i9 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d10 = tL_statsAbsValueAndPrev2.current;
            double d11 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d10 - d11);
            if (d11 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i13 / ((float) d11)) * 100.0f);
            }
            obj.f40660i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f40661j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i13 != 0 && abs6 != 0.0f) {
                int i14 = (int) abs6;
                if (abs6 == i14) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i13 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb5.append(str13);
                    sb5.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    String sb6 = sb5.toString();
                    obj.f40662k = sb6 + " (" + i14 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i13 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb7.append(str12);
                    sb7.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    obj.f40662k = String.format(locale4, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f40662k = "";
            }
            if (i13 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f40663l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            if (d13 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i15 / ((float) d13)) * 100.0f);
            }
            obj.f40657e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f40658f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i15 != 0 && abs7 != 0.0f) {
                int i16 = (int) abs7;
                if (abs7 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i15 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb8.append(str11);
                    sb8.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    String sb9 = sb8.toString();
                    obj.f40659g = sb9 + " (" + i16 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb10 = new StringBuilder();
                    if (i15 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb10.append(str10);
                    sb10.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    obj.f40659g = String.format(locale6, "%s (%.1f%s)", sb10.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f40659g = "";
            }
            if (i15 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f40664m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                obj.f40665n = ta.b.c(i17, "%");
            } else {
                obj.f40665n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            s91Var.f42615f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            s91Var.f42609b0 = tL_statsDateRangeDays.max_date * 1000;
            s91Var.f42611c0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i20 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i20);
                int i21 = i20 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f41380a = postInteractionCounters2;
                int i22 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i10 = i21;
                    s91Var.f42622l0.put(obj2.b(), i18);
                    i18++;
                } else {
                    i10 = i21;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    s91Var.f42626p0.add(obj2);
                    s91Var.m0.put(obj2.b(), i19);
                    i19++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i20 = i10;
                arrayList8 = arrayList4;
                size = i22;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new m81(s91Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                s91Var.getMessagesStorage().getMessages(-s91Var.f42608b, 0L, false, arrayList12.size(), ((p91) arrayList12.get(0)).b(), 0, 0, s91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(s91Var) {
                public final s91 f40081b;

                {
                    this.f40081b = s91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            s91 s91Var2 = this.f40081b;
                            s91Var2.getClass();
                            e91[] e91VarArr2 = e91VarArr;
                            s91Var2.d = e91VarArr2[0];
                            s91Var2.D = e91VarArr2[1];
                            s91Var2.E = e91VarArr2[2];
                            s91Var2.F = e91VarArr2[3];
                            s91Var2.G = e91VarArr2[4];
                            s91Var2.H = e91VarArr2[5];
                            s91Var2.f42613e = e91VarArr2[6];
                            s91Var2.I = e91VarArr2[7];
                            s91Var2.f0(e91VarArr2);
                            return;
                        default:
                            s91 s91Var3 = this.f40081b;
                            s91Var3.getClass();
                            e91[] e91VarArr3 = e91VarArr;
                            s91Var3.f42628r = e91VarArr3[0];
                            s91Var3.h = e91VarArr3[1];
                            s91Var3.f42613e = e91VarArr3[2];
                            s91Var3.f42623n = e91VarArr3[3];
                            s91Var3.d = e91VarArr3[4];
                            s91Var3.f42630s = e91VarArr3[5];
                            s91Var3.v = e91VarArr3[6];
                            s91Var3.f42635w = e91VarArr3[7];
                            s91Var3.f42637x = e91VarArr3[8];
                            s91Var3.f42639y = e91VarArr3[9];
                            s91Var3.A = e91VarArr3[10];
                            s91Var3.B = e91VarArr3[11];
                            s91Var3.f0(e91VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final e91[] e91VarArr2 = {e0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), e0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), e0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), e0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), e0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), e0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), e0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), e0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            e91 e91Var2 = e91VarArr2[6];
            if (e91Var2 != null) {
                e91Var2.f37880n = true;
            }
            e91 e91Var3 = e91VarArr2[7];
            if (e91Var3 != null) {
                e91Var3.f37881o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d14 = tL_statsAbsValueAndPrev4.current;
            double d15 = tL_statsAbsValueAndPrev4.previous;
            int i23 = (int) (d14 - d15);
            if (d15 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i23 / ((float) d15)) * 100.0f);
            }
            obj3.f41017a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f41018b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i23 != 0 && abs != 0.0f) {
                int i24 = (int) abs;
                if (abs == i24) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb11 = new StringBuilder();
                    if (i23 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb11.append(str8);
                    sb11.append(AndroidUtilities.formatWholeNumber(i23, 0));
                    String sb12 = sb11.toString();
                    obj3.f41019c = sb12 + " (" + i24 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb13 = new StringBuilder();
                    if (i23 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb13.append(str7);
                    sb13.append(AndroidUtilities.formatWholeNumber(i23, 0));
                    obj3.f41019c = String.format(locale9, "%s (%.1f%s)", sb13.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f41019c = "";
            }
            if (i23 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d16 = tL_statsAbsValueAndPrev5.current;
            double d17 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d16 - d17);
            if (d17 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i25 / ((float) d17)) * 100.0f);
            }
            obj3.f41023i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f41024j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i25 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb14 = new StringBuilder();
                if (i25 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb14.append(str6);
                sb14.append(AndroidUtilities.formatWholeNumber(i25, 0));
                String sb15 = sb14.toString();
                obj3.f41025k = sb15;
            } else {
                obj3.f41025k = "";
            }
            if (i25 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f41026l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            if (d19 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i26 / ((float) d19)) * 100.0f);
            }
            obj3.f41027m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f41028n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i26 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb16 = new StringBuilder();
                if (i26 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb16.append(str5);
                sb16.append(AndroidUtilities.formatWholeNumber(i26, 0));
                String sb17 = sb16.toString();
                obj3.f41029o = sb17;
            } else {
                obj3.f41029o = "";
            }
            if (i26 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f41030p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            if (d21 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i27 / ((float) d21)) * 100.0f);
            }
            obj3.f41020e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f41021f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i27 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb18 = new StringBuilder();
                if (i27 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb18.append(str4);
                sb18.append(AndroidUtilities.formatWholeNumber(i27, 0));
                String sb19 = sb18.toString();
                obj3.f41022g = sb19;
            } else {
                obj3.f41022g = "";
            }
            if (i27 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            s91Var.C = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            s91Var.f42609b0 = tL_statsDateRangeDays2.max_date * 1000;
            s91Var.f42611c0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f40087a = l91.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb20 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb20.append(LocaleController.formatPluralString("messages", i29, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb20.length() > 0) {
                            sb20.append(", ");
                        }
                        sb20.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f40088b = sb20.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i28++;
                    arrayList2 = arrayList3;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i30 = 0; i30 < tL_megagroupStats.top_admins.size(); i30++) {
                    ArrayList arrayList19 = s91Var.M;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i30);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f40087a = l91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb21 = new StringBuilder();
                    int i31 = tL_statsGroupTopAdmin.deleted;
                    if (i31 > 0) {
                        sb21.append(LocaleController.formatPluralString("Deletions", i31, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f40088b = sb21.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i32 = 0; i32 < tL_megagroupStats.top_inviters.size(); i32++) {
                    ArrayList arrayList22 = s91Var.L;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i32);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f40087a = l91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i33 = tL_statsGroupTopInviter.invitations;
                    if (i33 > 0) {
                        obj6.f40088b = LocaleController.formatPluralString("Invitations", i33, new Object[0]);
                    } else {
                        obj6.f40088b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(s91Var) {
                public final s91 f40081b;

                {
                    this.f40081b = s91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            s91 s91Var2 = this.f40081b;
                            s91Var2.getClass();
                            e91[] e91VarArr22 = e91VarArr2;
                            s91Var2.d = e91VarArr22[0];
                            s91Var2.D = e91VarArr22[1];
                            s91Var2.E = e91VarArr22[2];
                            s91Var2.F = e91VarArr22[3];
                            s91Var2.G = e91VarArr22[4];
                            s91Var2.H = e91VarArr22[5];
                            s91Var2.f42613e = e91VarArr22[6];
                            s91Var2.I = e91VarArr22[7];
                            s91Var2.f0(e91VarArr22);
                            return;
                        default:
                            s91 s91Var3 = this.f40081b;
                            s91Var3.getClass();
                            e91[] e91VarArr3 = e91VarArr2;
                            s91Var3.f42628r = e91VarArr3[0];
                            s91Var3.h = e91VarArr3[1];
                            s91Var3.f42613e = e91VarArr3[2];
                            s91Var3.f42623n = e91VarArr3[3];
                            s91Var3.d = e91VarArr3[4];
                            s91Var3.f42630s = e91VarArr3[5];
                            s91Var3.v = e91VarArr3[6];
                            s91Var3.f42635w = e91VarArr3[7];
                            s91Var3.f42637x = e91VarArr3[8];
                            s91Var3.f42639y = e91VarArr3[9];
                            s91Var3.A = e91VarArr3[10];
                            s91Var3.B = e91VarArr3[11];
                            s91Var3.f0(e91VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void V(s91 s91Var) {
        float f10;
        RectF rectF = s91Var.F0;
        ig.e eVar = s91Var.f42640y0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null && s91Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (s91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            s91Var.E0.set(0.0f, -dp, s91Var.fragmentView.getMeasuredWidth(), s91Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), s91Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            eVar.g(2, s91Var.D0);
            eVar.e(s91Var.C0, s91Var.fragmentView.getMeasuredWidth(), s91Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void X(s91 s91Var) {
        View currentView = s91Var.f42614e0.getCurrentView();
        xb xbVar = s91Var.f42616f0;
        if (currentView == xbVar) {
            s91Var.actionBar.setAdaptiveBackground(xbVar.B);
            return;
        }
        fe feVar = s91Var.f42617g0;
        if (currentView == feVar) {
            s91Var.actionBar.setAdaptiveBackground(feVar.W0);
        } else {
            s91Var.actionBar.setAdaptiveBackground(s91Var.O);
        }
    }

    public static void Y(s91 s91Var) {
        r91 r91Var = s91Var.V;
        if (r91Var != null) {
            r91Var.f42335b = true;
        }
        int childCount = s91Var.O.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = s91Var.O.getChildAt(i9);
            if (childAt instanceof d91) {
                ((d91) childAt).f37128b.f46219p0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 c0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f22380id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22380id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new s91(bundle);
        }
        return new u5(-chat.f22380id);
    }

    public static rf.b d0(JSONObject jSONObject, int i9, boolean z10) {
        if (i9 == 0) {
            return new rf.b(jSONObject);
        }
        if (i9 == 1) {
            return new rf.b(jSONObject);
        }
        if (i9 == 2) {
            ?? bVar = new rf.b(jSONObject);
            int length = ((rf.a) bVar.d.get(0)).f47153a.length;
            int size = bVar.d.size();
            bVar.f47170l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bVar.f47170l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = bVar.f47170l;
                    jArr[i10] = jArr[i10] + ((rf.a) bVar.d.get(i11)).f47153a[i10];
                }
            }
            bVar.f47171m = new SegmentTree(bVar.f47170l);
            return bVar;
        } else if (i9 == 4) {
            ?? bVar2 = new rf.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j10 = 0;
                for (int i12 = 0; i12 < bVar2.d.size(); i12++) {
                    int length2 = bVar2.f47160a.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        long j11 = ((rf.a) bVar2.d.get(i12)).f47153a[i13];
                        jArr2[i12] = jArr2[i12] + j11;
                        if (j11 == 0) {
                            iArr[i12] = iArr[i12] + 1;
                        }
                    }
                    j10 += jArr2[i12];
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < bVar2.d.size(); i14++) {
                    if (jArr2[i14] / j10 < 0.01d && iArr[i14] > bVar2.f47160a.length / 2.0f) {
                        arrayList.add((rf.a) bVar2.d.get(i14));
                    }
                }
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    bVar2.d.remove((rf.a) obj);
                }
            }
            int length3 = ((rf.a) bVar2.d.get(0)).f47153a.length;
            int size3 = bVar2.d.size();
            bVar2.f47172l = new long[length3];
            for (int i16 = 0; i16 < length3; i16++) {
                bVar2.f47172l[i16] = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    long[] jArr3 = bVar2.f47172l;
                    jArr3[i16] = jArr3[i16] + ((rf.a) bVar2.d.get(i17)).f47153a[i16];
                }
            }
            new SegmentTree(bVar2.f47172l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static e91 e0(TL_stats.StatsGraph statsGraph, String str, int i9, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        e91 e91Var = new e91(str, i9);
        e91Var.f37879m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                rf.b d02 = d0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i9, z10);
                e91Var.d = d02;
                if (d02 != null) {
                    d02.h = statsGraph.rate;
                }
                e91Var.f37874g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (d02 == null || (jArr2 = d02.f47160a) == null || jArr2.length < 2) {
                    e91Var.f37878l = true;
                }
                if (i9 == 4 && d02 != null && (jArr = d02.f47160a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    e91Var.f37872e = new rf.e(d02, j10);
                    e91Var.f37871c = j10;
                    return e91Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            e91Var.f37873f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return e91Var;
    }

    public static void j0(e91 e91Var, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
        rf.b bVar;
        int i9;
        if (e91Var != null && (bVar = e91Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                rf.a aVar = (rf.a) obj;
                int i11 = aVar.f47158g;
                if (i11 >= 0) {
                    if (!org.telegram.ui.ActionBar.f6.c1(i11)) {
                        int i12 = aVar.f47158g;
                        if (org.telegram.ui.ActionBar.f6.I == org.telegram.ui.ActionBar.f6.J) {
                            i9 = aVar.f47159i;
                        } else {
                            i9 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.f6.u1(i12, i9, false);
                        org.telegram.ui.ActionBar.f6.nl[aVar.f47158g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, aVar.f47158g));
                }
            }
        }
    }

    public static void k0(View view) {
        if (view instanceof d91) {
            ((d91) view).d();
        } else if (view instanceof org.telegram.ui.Cells.z6) {
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false)), org.telegram.ui.ActionBar.f6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7), 0, 0);
            fqVar.f28550w = true;
            view.setBackground(fqVar);
        } else if (view instanceof sf.c) {
            ((sf.c) view).a();
        } else if (view instanceof m91) {
            int i9 = m91.d;
            ((m91) view).b();
        }
    }

    public final void b0() {
        int i9;
        int i10 = AndroidUtilities.navigationBarHeight;
        int i11 = AndroidUtilities.statusBarHeight;
        pg0 pg0Var = this.f42619i0;
        if (pg0Var != null) {
            pg0Var.setTranslationY(-i10);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        if (this.f42610c) {
            i9 = AndroidUtilities.dp(72.0f);
        } else {
            i9 = 0;
        }
        int i12 = i9 + i10;
        t81 t81Var = this.O;
        if (t81Var != null) {
            t81Var.setPadding(0, currentActionBarHeight, 0, i12);
        }
        xb xbVar = this.f42616f0;
        if (xbVar != null) {
            xbVar.B.setPadding(0, currentActionBarHeight, 0, i12);
        }
        fe feVar = this.f42617g0;
        if (feVar != null) {
            feVar.W0.setPadding(0, currentActionBarHeight, 0, i12);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        boolean z12;
        int i9;
        float f10;
        String str;
        boolean z13;
        s91 s91Var = this;
        s91Var.W = new qf.f(null);
        MessagesController messagesController = MessagesController.getInstance(s91Var.currentAccount);
        long j10 = s91Var.f42608b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(s91Var.currentAccount).getChatFull(j10);
        if (chatFull != null && chatFull.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        if (chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(wg.b.b(context, s91Var.resourceProvider, wg.a.E, R.string.Statistics));
        }
        arrayList.add(wg.b.b(context, s91Var.resourceProvider, wg.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(wg.b.b(context, s91Var.resourceProvider, wg.a.MONETIZATION, R.string.Monetization));
        }
        s91Var.f42620j0 = (wg.b[]) arrayList.toArray(new wg.b[0]);
        pg0 pg0Var = new pg0(context, s91Var.resourceProvider);
        s91Var.f42619i0 = pg0Var;
        pg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i10 = 0;
        while (true) {
            wg.b[] bVarArr = s91Var.f42620j0;
            if (i10 >= bVarArr.length) {
                break;
            }
            wg.b bVar = bVarArr[i10];
            bVar.setOnClickListener(new gh.z0(s91Var, i10, 24));
            s91Var.f42619i0.addView(s91Var.f42620j0[i10]);
            s91Var.f42619i0.i(bVar, true, false);
            i10++;
        }
        s91Var.f42614e0 = new kh.j1(s91Var, s91Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            s91Var.f42616f0 = new xb(s91Var, -j10, s91Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = s91Var.getParentActivity();
            int i11 = s91Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.b6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            frameLayout = frameLayout2;
            fe feVar = new fe(parentActivity, this, i11, j11, resourceProvider, z13, chatFull.can_view_stars_revenue);
            s91Var = this;
            s91Var.f42617g0 = feVar;
            feVar.setActionBar(s91Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z14 = z10;
        FrameLayout frameLayout3 = frameLayout;
        s91Var.f42614e0.setAdapter(new s81(s91Var, z14, isBoostSupported, z11, frameLayout3));
        boolean z15 = s91Var.f42618h0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        s91Var.f42610c = z12;
        if (z12 && s91Var.Z) {
            s91Var.f42614e0.setPosition(z14 ? 1 : 0);
        } else if (z12 && s91Var.f42607a0) {
            kh.j1 j1Var = s91Var.f42614e0;
            if (!z15 && isBoostSupported) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            j1Var.setPosition((z14 ? 1 : 0) + i9);
        }
        s91Var.l0(s91Var.f42614e0.getCurrentPosition(), false);
        fh.x4 x4Var = new fh.x4(s91Var, s91Var.getParentActivity(), 9);
        s91Var.actionBar.setDrawBlurBackground(x4Var);
        x4Var.setBackgroundColor(s91Var.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        pg.i iVar = new pg.i(x4Var);
        ig.a aVar = s91Var.B0;
        aVar.d = iVar;
        aVar.f11131e = x4Var;
        x4Var.addView(s91Var.f42614e0, g7.e6.g());
        x4Var.addView(s91Var.actionBar);
        if (s91Var.f42610c) {
            x4Var.addView(s91Var.f42619i0, g7.e6.e(344, 72, 81));
            s91Var.setBulletinDelegate(new bg.z(16));
        }
        s91Var.fragmentView = x4Var;
        t81 t81Var = new t81(s91Var, context);
        s91Var.O = t81Var;
        t81Var.setSections(true);
        s91Var.O.setClipToPadding(false);
        t81 t81Var2 = s91Var.O;
        Objects.requireNonNull(t81Var2);
        s91Var.P = new ig.k(t81Var2, x4Var, new ns(t81Var2, 1));
        xb xbVar = s91Var.f42616f0;
        if (xbVar != null) {
            org.telegram.ui.Components.wk0 wk0Var = xbVar.B;
            Objects.requireNonNull(wk0Var);
            xbVar.C = new ig.k(wk0Var, x4Var, new ns(wk0Var, 0));
            s91Var.f42616f0.B.j(new r81(s91Var, 1));
        }
        fe feVar2 = s91Var.f42617g0;
        if (feVar2 != null) {
            org.telegram.ui.Components.i51 i51Var = feVar2.W0;
            Objects.requireNonNull(i51Var);
            feVar2.X0 = new ig.k(i51Var, x4Var, new u8(i51Var, 0));
            s91Var.f42617g0.W0.j(new r81(s91Var, 2));
        }
        s91Var.C0 = new p81(s91Var, x4Var);
        s91Var.O.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        s91Var.X = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        s91Var.S = imageView;
        imageView.setAutoRepeat(true);
        s91Var.S.f(R.raw.statistic_preload, 120, 120, null);
        s91Var.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.f6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i13 = org.telegram.ui.ActionBar.f6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        textView2.setTag(Integer.valueOf(i13));
        org.telegram.messenger.ll.l(R.string.LoadingStatsDescription, textView2, 1);
        s91Var.X.addView(s91Var.S, g7.e6.t(120, 120, 1, 0, 0, 0, 20));
        s91Var.X.addView(textView, g7.e6.t(-2, -2, 1, 0, 0, 0, 10));
        s91Var.X.addView(textView2, g7.e6.q(-2, -2, 1));
        frameLayout3.addView(s91Var.X, g7.e6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (s91Var.T == null) {
            s91Var.T = new x81(s91Var);
        }
        s91Var.O.setAdapter(s91Var.T);
        f2.m0 m0Var = new f2.m0();
        s91Var.Q = m0Var;
        s91Var.O.setLayoutManager(m0Var);
        s91Var.U = new f2.n();
        s91Var.O.setItemAnimator(null);
        s91Var.O.j(new r81(s91Var, 0));
        s91Var.O.setOnItemClickListener(new c21(s91Var, 5));
        s91Var.O.setOnItemLongClickListener(new dl0(s91Var, 18));
        frameLayout3.addView(s91Var.O);
        org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, null, false, null);
        s91Var.N = tnVar;
        tnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        s91Var.N.getAvatarImageView().setScaleX(0.9f);
        s91Var.N.getAvatarImageView().setScaleY(0.9f);
        s91Var.N.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = s91Var.actionBar;
        org.telegram.ui.Components.tn tnVar2 = s91Var.N;
        if (!s91Var.inPreviewMode) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(tnVar2, 0, g7.e6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = s91Var.getMessagesController().getChat(Long.valueOf(j10));
        s91Var.N.setChatAvatar(chat2);
        org.telegram.ui.Components.tn tnVar3 = s91Var.N;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        tnVar3.setTitle(str);
        org.telegram.ui.Components.tn tnVar4 = s91Var.N;
        if (tnVar4.getSubtitleTextView() != null) {
            tnVar4.getSubtitleTextView().setVisibility(8);
        }
        org.telegram.ui.Cells.j2.v(false, s91Var.actionBar);
        s91Var.actionBar.setActionBarMenuOnItemClick(new cd0(s91Var, 26));
        s91Var.N.i(org.telegram.ui.ActionBar.f6.w0(null, i12, false), org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        s91Var.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i12, false), false);
        s91Var.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i12, false), true);
        s91Var.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23388z8, false), false);
        s91Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        boolean z16 = s91Var.f42632t0;
        v5 v5Var = s91Var.f42638x0;
        if (z16) {
            s91Var.X.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(v5Var, 500L);
            s91Var.X.setVisibility(0);
            s91Var.O.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            s91Var.X.setVisibility(8);
            s91Var.O.setVisibility(0);
        }
        kg.d c10 = aVar.c(s91Var.f42619i0, mg.c.f(s91Var.resourceProvider), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.666f));
        s91Var.f42619i0.setBackground(c10);
        s91Var.b0();
        s91Var.f42633u0 = new f91(s91Var.T, s91Var.Q);
        return s91Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.o2 o2Var2;
        org.telegram.ui.ActionBar.o2 o2Var3 = null;
        int i11 = 0;
        if (i9 == NotificationCenter.storiesListUpdated) {
            if (((ih.n6) objArr[0]) == this.f42634v0) {
                i0();
                n0();
                if (this.T != null) {
                    this.O.setItemAnimator(null);
                    this.f42633u0.f();
                }
            }
        } else if (i9 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack);
                } else {
                    o2Var = null;
                }
                if (o2Var instanceof ho) {
                    ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    o2Var2 = (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack2);
                } else {
                    o2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        o2Var3 = (org.telegram.ui.ActionBar.o2) j3.r0.k(3, fragmentStack2);
                    }
                    if (o2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
                    }
                    finishFragment();
                    if (o2Var3 instanceof qn) {
                        bg.u.f(o2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (o2Var2 instanceof ProfileActivity) {
                    bg.u.f(o2Var2, chat, false);
                }
            }
        } else if (i9 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    arrayList = this.f42624n0;
                    if (i12 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    int i13 = this.f42622l0.get(messageObject.getId(), -1);
                    if (i13 >= 0 && ((p91) arrayList.get(i13)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((p91) arrayList.get(i13));
                        } else {
                            ((p91) arrayList.get(i13)).f41381b = messageObject;
                        }
                    }
                    i12++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f42625o0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    p91 p91Var = (p91) arrayList.get(i11);
                    if (p91Var.f41381b == null) {
                        this.f42621k0 = p91Var.b();
                        break;
                    } else {
                        arrayList4.add(p91Var);
                        i11++;
                    }
                }
                if (arrayList4.size() < 20) {
                    g0();
                }
                n0();
                if (this.T != null) {
                    this.O.setItemAnimator(null);
                    this.f42633u0.f();
                }
            }
        } else if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == this.f42608b && this.f42606a == null) {
                this.f42606a = chatFull;
                h0();
            }
        }
    }

    public final void f0(e91[] e91VarArr) {
        x81 x81Var = this.T;
        if (x81Var != null) {
            x81Var.E();
            this.O.setItemAnimator(null);
            this.T.l();
        }
        this.f42632t0 = false;
        LinearLayout linearLayout = this.X;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.f42638x0);
            this.X.animate().alpha(0.0f).setDuration(230L).setListener(new bc0(this, 27));
            this.O.setVisibility(0);
            this.O.setAlpha(0.0f);
            this.O.animate().alpha(1.0f).setDuration(230L).start();
            for (e91 e91Var : e91VarArr) {
                if (e91Var != null && e91Var.d == null && e91Var.f37873f != null) {
                    e91Var.a(this.currentAccount, this.classGuid, this.f42606a.stats_dc, new org.telegram.ui.Components.v41(1, this, e91Var));
                }
            }
        }
    }

    public final void g0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f22418id = new ArrayList<>();
        ArrayList arrayList = this.f42624n0;
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = this.f42622l0.get(this.f42621k0); i10 < size; i10++) {
            if (((p91) arrayList.get(i10)).f41381b == null) {
                tL_channels_getMessages.f22418id.add(Integer.valueOf(((p91) arrayList.get(i10)).b()));
                i9++;
                if (i9 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f42608b);
        this.f42631s0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new o81(this, 0));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.h5 h5Var;
        e91 e91Var;
        e91 e91Var2;
        sx0 sx0Var = new sx0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"message"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"views"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"shares"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"likes"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"date"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{sf.c.class}, new String[]{"textView"}, null, null, -1, null, i10));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23072h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23388z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.f23351x6));
        int i12 = org.telegram.ui.ActionBar.f6.f23212p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i12));
        org.telegram.ui.Components.tn tnVar = this.N;
        if (tnVar != null) {
            h5Var = tnVar.getTitleTextView();
        } else {
            h5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(h5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Oi));
        org.telegram.ui.Components.tn tnVar2 = this.N;
        if (tnVar2 != null) {
            view2 = tnVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.f6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23303u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23319v6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        if (this.Y) {
            for (int i13 = 0; i13 < 6; i13++) {
                if (i13 == 0) {
                    e91Var2 = this.d;
                } else if (i13 == 1) {
                    e91Var2 = this.D;
                } else if (i13 == 2) {
                    e91Var2 = this.E;
                } else if (i13 == 3) {
                    e91Var2 = this.F;
                } else if (i13 == 4) {
                    e91Var2 = this.G;
                } else {
                    e91Var2 = this.H;
                }
                j0(e91Var2, arrayList, sx0Var);
            }
        } else {
            for (int i14 = 0; i14 < 12; i14++) {
                if (i14 == 0) {
                    e91Var = this.d;
                } else if (i14 == 1) {
                    e91Var = this.h;
                } else if (i14 == 2) {
                    e91Var = this.f42623n;
                } else if (i14 == 3) {
                    e91Var = this.f42628r;
                } else if (i14 == 4) {
                    e91Var = this.f42630s;
                } else if (i14 == 5) {
                    e91Var = this.v;
                } else if (i14 == 6) {
                    e91Var = this.f42637x;
                } else if (i14 == 7) {
                    e91Var = this.f42613e;
                } else if (i14 == 8) {
                    e91Var = this.f42635w;
                } else if (i14 == 9) {
                    e91Var = this.f42639y;
                } else if (i14 == 10) {
                    e91Var = this.A;
                } else {
                    e91Var = this.B;
                }
                j0(e91Var, arrayList, sx0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f42618h0) {
            return;
        }
        boolean z10 = this.Y;
        long j10 = this.f42608b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new o81(this, 1), null, null, 0, this.f42606a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        ArrayList arrayList = this.f42627q0;
        arrayList.clear();
        ArrayList arrayList2 = this.f42626p0;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            p91 p91Var = (p91) obj;
            MessageObject f10 = this.f42634v0.f(p91Var.b());
            if (f10 != null) {
                p91Var.f41381b = f10;
                arrayList.add(p91Var);
            }
        }
        this.m0.clear();
        arrayList2.clear();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        kh.j1 j1Var = this.f42614e0;
        if (j1Var != null && (j1Var.f31033b != 0 || j1Var.f31034c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void l0(int i9, boolean z10) {
        boolean z11;
        int i10 = 0;
        while (true) {
            wg.b[] bVarArr = this.f42620j0;
            if (i10 < bVarArr.length) {
                wg.b bVar = bVarArr[i10];
                if (i10 == i9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void m0(float f10, boolean z10) {
        for (int i9 = 0; i9 < this.f42620j0.length; i9++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i9 - f10));
            wg.b bVar = this.f42620j0[i9];
            bVar.F = max;
            bVar.E = z10;
            bVar.invalidate();
        }
        this.f42619i0.invalidate();
    }

    public final void n0() {
        ArrayList arrayList = this.f42629r0;
        arrayList.clear();
        arrayList.addAll(this.f42625o0);
        arrayList.addAll(this.f42627q0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.w0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ih.v6 storiesController = getMessagesController().getStoriesController();
        long j10 = this.f42608b;
        ih.n6 A = storiesController.A(-j10, 2, -1, true);
        this.f42634v0 = A;
        if (A != null) {
            this.f42636w0 = A.o();
        }
        if (this.f42606a != null) {
            h0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.f42612d0;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
            c2VarArr[0] = null;
        }
        ih.n6 n6Var = this.f42634v0;
        if (n6Var != null) {
            n6Var.z(this.f42636w0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        b0();
    }
}
