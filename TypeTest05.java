class TypeTest05
{
	public static void main(String [] args)
	{
		double a=5;
		double b=2;

		int r;
		r=(int)(a/b);
		//���� a�� double�� ���� b�� double��
		//�� a/b�� ����� double���̴�.
		//double ���� ���� int�� ������ r��
		//�ٷ�(����) ������ �� ����,
		//����ȯ ���� ������ �� �ִ�.
/*
		    ���� ������(=)�� �������� ������ ������ �ڷ����� 
			������ ������ ���� ������� �ڷ����� ���� ��ġ �ؾ� �Ѵ�.

			���� �������� ���������� �޸� ũ�Ⱑ �� �۰� 
			������ ������ �ڷ����� ũ�Ⱑ �� ũ�ٸ� �� ���� ���� �ʴ´�.

			�׷��� �ʰ�
			�� �ݴ��� ��Ȳ�̶��
			��, �������� ������ �������� �޸� ũ�Ⱑ
			������ ������ �ڷ����� ũ�⺸�� �� ũ�ٸ�
			�ݵ�� ����ȯ(Type Casting)�ؼ� �����ؾ� �Ѵ�.

*/
		System.out.println(r);
	}
}