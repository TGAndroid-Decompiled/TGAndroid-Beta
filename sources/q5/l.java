package q5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j7.g5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import l7.w0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class l extends c6.a {
    public static final w0 f44610e;
    public final List f44611a;
    public final Bundle f44612b;
    public int f44613c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<l> CREATOR = new v(11);

    static {
        w0 w0Var = new w0(27);
        w0Var.D(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        w0Var.D(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        w0Var.D(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        w0Var.D(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        w0Var.D(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        w0Var.D(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        w0Var.D(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        w0Var.D(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        w0Var.D(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        w0Var.D(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        w0Var.D(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        w0Var.D(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        w0Var.D(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        w0Var.D(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        w0Var.D(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        w0Var.D(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        w0Var.D(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        w0Var.D(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        w0Var.D(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        w0Var.D(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        w0Var.D(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        w0Var.D(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        w0Var.D(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        w0Var.D(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        w0Var.D(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        w0Var.D(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        w0Var.D(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        w0Var.D(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        f44610e = w0Var;
    }

    public l(ArrayList arrayList, Bundle bundle, int i10) {
        this.f44611a = arrayList;
        this.f44612b = bundle;
        this.f44613c = i10;
    }

    public static void f(int i10, String str) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) ((HashMap) f44610e.d).get(str);
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            if (i11 != i10 && i11 != 0) {
                throw new IllegalArgumentException(e2.c.k("Value for ", str, " must be a ", d[i10]));
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    public static boolean j(Bundle bundle, Bundle bundle2) {
        if (bundle.size() == bundle2.size()) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle) || j((Bundle) obj, (Bundle) obj2)) {
                    if (obj == null) {
                        if (obj2 != null || !bundle2.containsKey(str)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void e(String str, String str2) {
        f(1, str);
        this.f44612b.putString(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (j(this.f44612b, lVar.f44612b) && this.f44611a.equals(lVar.f44611a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final JSONObject g() {
        Bundle bundle;
        int i10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f44613c);
        } catch (JSONException unused) {
        }
        JSONArray b10 = v5.a.b(this.f44611a);
        if (b10.length() != 0) {
            try {
                jSONObject.put("images", b10);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i11 = this.f44613c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                bundle = this.f44612b;
                if (i12 >= size) {
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    w0 w0Var = f44610e;
                    String str2 = (String) ((HashMap) w0Var.f12080b).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) w0Var.d).get(str);
                        if (num != null) {
                            i10 = num.intValue();
                        } else {
                            i10 = 0;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        if (i10 == 5) {
                                            long j10 = bundle.getLong(str);
                                            Pattern pattern = u5.a.f48383a;
                                            jSONObject.put(str2, j10 / 1000.0d);
                                        }
                                    }
                                } else {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                }
                            } else {
                                jSONObject.put(str2, bundle.getInt(str));
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void h(JSONObject jSONObject) {
        HashSet hashSet;
        int i10;
        Bundle bundle = this.f44612b;
        bundle.clear();
        List list = this.f44611a;
        list.clear();
        this.f44613c = 0;
        try {
            this.f44613c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            v5.a.c(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = this.f44613c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    w0 w0Var = f44610e;
                    String str = (String) ((HashMap) w0Var.f12081c).get(next);
                    if (str != null) {
                        if (hashSet2.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    Integer num = (Integer) ((HashMap) w0Var.d).get(str);
                                    if (num != null) {
                                        i10 = num.intValue();
                                    } else {
                                        i10 = 0;
                                    }
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            if (i10 != 3) {
                                                if (i10 != 4) {
                                                    if (i10 == 5) {
                                                        long optLong = jSONObject.optLong(next);
                                                        Pattern pattern = u5.a.f48383a;
                                                        hashSet = hashSet2;
                                                        try {
                                                            bundle.putLong(str, optLong * 1000);
                                                        } catch (JSONException unused2) {
                                                        }
                                                    }
                                                } else {
                                                    hashSet = hashSet2;
                                                    if (obj instanceof String) {
                                                        String str2 = (String) obj;
                                                        if (v5.a.a(str2) != null) {
                                                            bundle.putString(str, str2);
                                                        }
                                                    }
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    bundle.putDouble(str, optDouble);
                                                }
                                            }
                                        } else {
                                            hashSet = hashSet2;
                                            if (obj instanceof Integer) {
                                                bundle.putInt(str, ((Integer) obj).intValue());
                                            }
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                        if (obj instanceof String) {
                                            bundle.putString(str, (String) obj);
                                        }
                                    }
                                }
                            } catch (JSONException unused3) {
                                hashSet = hashSet2;
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            bundle.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                    hashSet2 = hashSet;
                }
            }
        } catch (JSONException unused4) {
        }
    }

    public final int hashCode() {
        int i10;
        int i11 = 17;
        Bundle bundle = this.f44612b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                int i12 = i11 * 31;
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                i11 = i12 + i10;
            }
        }
        return this.f44611a.hashCode() + (i11 * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.p(parcel, 2, this.f44611a);
        g5.b(parcel, 3, this.f44612b);
        int i11 = this.f44613c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.r(parcel, q10);
    }

    public l(int i10) {
        this(new ArrayList(), new Bundle(), i10);
    }
}
