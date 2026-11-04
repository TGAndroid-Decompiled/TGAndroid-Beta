package z9;

import java.util.HashMap;
public final class f {
    public static final f f60176a;
    public static final HashMap f60177b;
    public static final f[] f60178c;
    f EF0;

    static {
        Enum r02 = new Enum("X86_32", 0);
        Enum r12 = new Enum("X86_64", 1);
        Enum r32 = new Enum("ARM_UNKNOWN", 2);
        Enum r5 = new Enum("PPC", 3);
        Enum r72 = new Enum("PPC64", 4);
        Enum r9 = new Enum("ARMV6", 5);
        Enum r11 = new Enum("ARMV7", 6);
        ?? r13 = new Enum("UNKNOWN", 7);
        f60176a = r13;
        Enum r15 = new Enum("ARMV7S", 8);
        Enum r22 = new Enum("ARM64", 9);
        f60178c = new f[]{r02, r12, r32, r5, r72, r9, r11, r13, r15, r22};
        HashMap hashMap = new HashMap(4);
        f60177b = hashMap;
        hashMap.put("armeabi-v7a", r11);
        hashMap.put("armeabi", r9);
        hashMap.put("arm64-v8a", r22);
        hashMap.put("x86", r02);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f60178c.clone();
    }
}
