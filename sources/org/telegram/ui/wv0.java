package org.telegram.ui;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;
public final class wv0 implements Consumer {
    public final ProfileActivity f43175a;

    public wv0(ProfileActivity profileActivity) {
        this.f43175a = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        ProfileActivity profileActivity = this.f43175a;
        HashSet hashSet = profileActivity.f33836h5;
        ArrayList arrayList = new ArrayList((HashSet) obj);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (profileActivity.getMessagesController().f19234r7.f(profileActivity.f33810e1, ((Integer) arrayList.get(i10)).intValue()) == null) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        hashSet.clear();
        hashSet.addAll(arrayList);
        profileActivity.F5(true);
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
