package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class vy extends org.telegram.ui.ActionBar.j {
    public final bz f43185a;

    public vy(bz bzVar) {
        this.f43185a = bzVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        bz bzVar = this.f43185a;
        int i12 = bzVar.f36511w;
        ArrayList arrayList = bzVar.f36506e;
        int i13 = bzVar.f36512x;
        if (i10 == -1) {
            if (bzVar.f36513y == null) {
                bzVar.Y();
            } else {
                bzVar.finishFragment();
            }
        } else if (i10 == 1 && bzVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            bzVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = bzVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.m2) bzVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(bzVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(bzVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(bzVar.getParentActivity(), appWidgetManager, i13);
            }
            y0 y0Var = bzVar.f36513y;
            if (y0Var != null) {
                int i15 = y0Var.f44245a;
                Object obj = y0Var.f44246b;
                switch (i15) {
                    case 25:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.F;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.F;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            bzVar.Y();
        }
    }
}
